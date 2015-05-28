package com.stevy.builder.enums;

/**
 * BIT:-7 boolean TINYINT:-6 Short SMALLINT:5 Short INTEGER:4 Integer BIGINT:-5 Long
 * FLOAT:6 Float REAL:7 Float DOUBLE:8 double NUMERIC:2 java.math.BigDecimal
 * DECIMAL:3 java.math.BigDecimal CHAR:1 String VARCHAR:12 String LONGVARCHAR:-1
 * String DATE:91 java.util.Date TIME:92 java.util.Date TIMESTAMP:93
 * java.util.Date BINARY:-2 byte[] VARBINARY:-3 byte[] LONGVARBINARY:-4 byte[]
 * NULL:0 OTHER:1111 JAVA_OBJECT:2000 DISTINCT:2001 STRUCT:2002 ARRAY:2003
 * BLOB:2004 CLOB:2005 REF:2006 DATALINK:70 BOOLEAN:16 ROWID:-8 NCHAR:-15
 * NVARCHAR:-9 LONGNVARCHAR:-16 NCLOB:2011 SQLXML:2009 REF_CURSOR:2012
 * TIME_WITH_TIMEZONE:2013 TIMESTAMP_WITH_TIMEZONE:2014
 * 
 * @author Stevy Qi
 * @Date 2015Äê5ÔÂ28ÈÕ
 */
public enum FieldTypes {
	BIT(-7, "boolean"), TINYINT(-6, "Short"), SMALLINT(5, "Short"), INTEGER(4, "Integer"), BIGINT(-5, "Long"), FLOAT(6,
			"Float"), REAL(7, "Float"), DOUBLE(8, "double"), NUMERIC(2, "java.math.BigDecimal"), DECIMAL(3,
			"java.math.BigDecimal"), CHAR(1, "String"), VARCHAR(12, "String"), LONGVARCHAR(-1, "String"), DATE(91,
			"java.util.Date"), TIME(92, "java.util.Date"), TIMESTAMP(93, "java.util.Date"), BINARY(-1, "byte[]"), VARBINARY(
			-1, "byte[]"), LONGVARBINARY(-1, "byte[]");
	
	private FieldTypes(int key, String value) {
		this.key = key;
		this.value = value;
	}

	private int key;
	private String value;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public static String getValue(int key) {
		for (FieldTypes type : FieldTypes.values()) {
			if ((type.getKey() + "").equals(key + "")) {
				return type.value;
			}
		}
		return null;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
