package com.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 1L;
	
	private String responseName;
	private String fieldsName;
	private long fieldValue;
	
	public ResourceNotFoundException(String responseName, String fieldsName, long fieldValue) {
		super();
		this.responseName = responseName;
		this.fieldsName = fieldsName;
		this.fieldValue = fieldValue;
	}
	
	public String getResponseName() {
		return responseName;
	}
	public void setResponseName(String responseName) {
		this.responseName = responseName;
	}
	public String getFieldsName() {
		return fieldsName;
	}
	public void setFieldsName(String fieldsName) {
		this.fieldsName = fieldsName;
	}
	public long getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(long fieldValue) {
		this.fieldValue = fieldValue;
	}

	
	
}
