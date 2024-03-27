package com.main.common;

public class ResponseModel {
	private String type;
	private String msg1;
	private String msg2;
	private Object data;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMsg1() {
		return msg1;
	}
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}
	public String getMsg2() {
		return msg2;
	}
	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) throws NullPointerException{
		this.data = data;
	}
	
	public ResponseModel(){
		setType("");
		setMsg1("");
		setMsg2("");
		setData("");
	}
	public ResponseModel(String type){
		setType(type);
		setMsg1("");
		setMsg2("");
		setData("");
	}
	public ResponseModel(String type, String msg1){
		setType(type);
		setMsg1(msg1);
		setMsg2("");
		setData("");
	}
	public ResponseModel(String type, String msg1, Object data){
		setType(type);
		setMsg1(msg1);
		setMsg2("");
		setData(data);
	}
	public ResponseModel(String type, String msg1, String msg2, Object data){
		setType(type);
		setMsg1(msg1);
		setMsg2(msg2);
		setData(data);
	}
	
}
