package com.stevy.builder.model;

import java.util.List;
/**
 * 
 * @author Stevy Qi
 * @Time ÏÂÎç1:55:35
 */
public class TableModel {

	private String tableName;
	private String beanName;
	private List<FieldModel> fieldList;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public List<FieldModel> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<FieldModel> fieldList) {
		this.fieldList = fieldList;
	}

	@Override
	public String toString() {
		return "TableModel [tableName=" + tableName + ", beanName=" + beanName + ", fieldList=" + fieldList + "]";
	}


}
