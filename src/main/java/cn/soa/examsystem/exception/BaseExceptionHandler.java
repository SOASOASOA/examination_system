
    /**  
    * @Title: BaseExceptionHandler.java
    * @Package cn.soa.examsystem.exception
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.exception;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import cn.soa.examsystem.util.JsonResult;

/**
    * @ClassName: BaseExceptionHandler
    * @Description: �쳣�����������
    * @author zhugang
    * @date 2018��3��24��
    *
    */

@ControllerAdvice   
@ResponseBody
public class BaseExceptionHandler {
	 /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public JsonResult<String>  handleHttpMessageNotReadableException(
            HttpMessageNotReadableException e) {
        return new JsonResult<String>("could_not_read_json");
    }
    
    /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public JsonResult<String> handleValidationException(MethodArgumentNotValidException e) {
        return new JsonResult<String>("parameter_validation_exception");
    }

    /**
     * 405 - Method Not Allowed��HttpRequestMethodNotSupportedException
     * ��ServletException������,��ҪServlet API֧��
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public JsonResult<String> handleHttpRequestMethodNotSupportedException(
            HttpRequestMethodNotSupportedException e) 
    {
        return new JsonResult<String>("request_method_not_supported");
    }
    

    /**
     * 415 - Unsupported Media Type��HttpMediaTypeNotSupportedException
     * ��ServletException������,��ҪServlet API֧��
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler( HttpMediaTypeNotSupportedException.class )
    public JsonResult<String> handleHttpMediaTypeNotSupportedException(Exception e) 
    {
        return new JsonResult<String>("content_type_not_supported");
    }
    
    
    
    /**
    * @Title: handleValidationException
    * @Description: TODO(������һ�仰�����������������)
    * @param @param e
    * @param @return    ����˵��
    * @return JsonResult<String>    ��������
    * @throws
    */
    
	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public JsonResult<String> handleValidationException(ConstraintViolationException e)
	{
	    for(ConstraintViolation<?> s:e.getConstraintViolations())
	    {
	        //return s.getInvalidValue()+": "+s.getMessage();
		 return new JsonResult<String>(s.getMessage());
	}
	    return new JsonResult<String>("����������Ϸ�");
	}

    
    
        /**
        * @Title: validExceptionHandler
        * @Description: TODO(������һ�仰�����������������)
        * @param @param e
        * @param @param request
        * @param @param response
        * @param @return    ����˵��
        * @return JsonResult<JSONObject>    ��������
        * @throws
        */
        
    @ExceptionHandler(BindException.class)
    public JsonResult<JSONObject> validExceptionHandler(BindException e, WebRequest request, HttpServletResponse response) {

        //List<FieldError> fieldErrors=e.getBindingResult().getFieldErrors();
        Map<String,Object> attrMap=new HashMap<String, Object>();
        String[] atrrNames=request.getAttributeNames(WebRequest.SCOPE_REQUEST);
        for(String attr:atrrNames)
        {
            Object value=request.getAttribute(attr,WebRequest.SCOPE_REQUEST);
            if(value instanceof Serializable)
            {
                attrMap.put(attr,value);
            }
        }
        JSONObject exceptionJson = new JSONObject(attrMap);  
        return new JsonResult<JSONObject>(0,exceptionJson);
    }

    /**
     * 500 - Internal Server Error
     
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public JsonResult<String> handleException(Exception e) 
    {
        return new JsonResult<String>("Internal Server Error");
    }
    */
}
