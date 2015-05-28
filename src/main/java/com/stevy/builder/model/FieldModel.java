package com.stevy.builder.model;

/**
 * 
 TABLE_CAT String => ����𣨿�Ϊ null�� TABLE_SCHEM String => ��ģʽ����Ϊ null��
 * TABLE_NAME String => ������ COLUMN_NAME String => ������ DATA_TYPE int => ����
 * java.sql.Types �� SQL ���� TYPE_NAME String => ����Դ�������������ƣ����� UDT����������������ȫ�޶���
 * COLUMN_SIZE int => �еĴ�С�� BUFFER_LENGTH δ��ʹ�á� DECIMAL_DIGITS int => С�����ֵ�λ��������
 * DECIMAL_DIGITS �����õ��������ͣ��򷵻� Null�� NUM_PREC_RADIX int => ������ͨ��Ϊ 10 �� 2��
 * NULLABLE int => �Ƿ�����ʹ�� NULL�� columnNoNulls - ���ܲ�����ʹ�� NULL ֵ columnNullable -
 * ��ȷ����ʹ�� NULL ֵ columnNullableUnknown - ��֪���Ƿ��ʹ�� null REMARKS String =>
 * �����е�ע�ͣ���Ϊ null�� COLUMN_DEF String => ���е�Ĭ��ֵ����ֵ�ڵ�������ʱӦ������Ϊһ���ַ�������Ϊ null��
 * SQL_DATA_TYPE int => δʹ�� SQL_DATETIME_SUB int => δʹ�� CHAR_OCTET_LENGTH int =>
 * ���� char ���ͣ��ó��������е�����ֽ��� ORDINAL_POSITION int => ���е��е��������� 1 ��ʼ�� IS_NULLABLE
 * String => ISO ��������ȷ�����Ƿ���� null�� YES --- ����������԰��� NULL NO --- ������������԰��� NULL
 * ���ַ��� --- �����֪�������Ƿ���԰��� null SCOPE_CATLOG String => �����������������Ե����������
 * DATA_TYPE ���� REF����Ϊ null�� SCOPE_SCHEMA String => ���ģʽ�������������Ե���������� DATA_TYPE
 * ���� REF����Ϊ null�� SCOPE_TABLE String => �����ƣ������������Ե���������� DATA_TYPE ���� REF����Ϊ
 * null�� SOURCE_DATA_TYPE short => ��ͬ���ͻ��û����� Ref ���͡����� java.sql.Types �� SQL
 * ���͵�Դ���ͣ���� DATA_TYPE ���� DISTINCT ���û����ɵ� REF����Ϊ null�� IS_AUTOINCREMENT String
 * => ָʾ�����Ƿ��Զ����� YES --- ��������Զ����� NO --- ������в��Զ����� ���ַ��� --- �������ȷ�������Ƿ����Զ����Ӳ���
 * 
 * @author Stevy Qi
 * @Time ����1:55:53
 */
public class FieldModel {

	private String columnName;
	private String columnType;
	private String beanName;
	private String suffixBeanName;
	private String beanType;
	private String remark;
	private Integer datasize;
	private Integer digits;
	private Integer nullable;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getSuffixBeanName() {
		return suffixBeanName;
	}

	public void setSuffixBeanName(String suffixBeanName) {
		this.suffixBeanName = suffixBeanName;
	}

	public String getBeanType() {
		return beanType;
	}

	public void setBeanType(String beanType) {
		this.beanType = beanType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getDatasize() {
		return datasize;
	}

	public void setDatasize(Integer datasize) {
		this.datasize = datasize;
	}

	public Integer getDigits() {
		return digits;
	}

	public void setDigits(Integer digits) {
		this.digits = digits;
	}

	public Integer getNullable() {
		return nullable;
	}

	public void setNullable(Integer nullable) {
		this.nullable = nullable;
	}

	@Override
	public String toString() {
		return "FieldModel [columnName=" + columnName + ", columnType=" + columnType + ", beanName=" + beanName
				+ ", beanType=" + beanType + ", remark=" + remark + ", datasize=" + datasize + ", digits=" + digits
				+ ", nullable=" + nullable + "]";
	}

}
