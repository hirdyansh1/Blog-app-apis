package com.bitwise.blog.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	String resourcename;
	String fieldName;
	long fieldvalue;
	public ResourceNotFoundException(String resourcename, String fieldName, long fieldvalue) {
		super(String.format("%s not found with %s : %s" ,resourcename , fieldName,fieldvalue));
		this.resourcename = resourcename;
		this.fieldName = fieldName;
		this.fieldvalue = fieldvalue;
	}
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public long getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(long fieldvalue) {
		this.fieldvalue = fieldvalue;
	}



}
