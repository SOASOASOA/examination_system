package cn.soa.examsystem.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.soa.examsystem.util.JsonResult;

public abstract class ExceptionController {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public JsonResult exp(Exception e){
		e.printStackTrace();
		return new JsonResult(e);
	}
}







