package cn.soa.examsystem.util;

import java.io.Serializable;

public class JsonResult<T> implements Serializable{ 
	private static final long serialVersionUID = 188L;
	private int state;
	private String message;
	private T data;
	public static final int SUCCESS=0;
	public static final int ERROR=1;
	public JsonResult(){
		state=ERROR;
		state=SUCCESS;
	}
	public JsonResult(T data){
		state=SUCCESS;
		this.data=data;
	}
	public JsonResult(Throwable e){
		state=ERROR;
		this.message= e.getMessage();
	}
	public JsonResult(int state,Throwable e){
		state=ERROR;
		this.message= e.getMessage();
	}
	public JsonResult(int state,T data){
		state=SUCCESS;
		this.data=data;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}
	
}
