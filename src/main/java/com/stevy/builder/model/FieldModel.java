package com.stevy.builder.model;

/**
 * 
 TABLE_CAT String => 表类别（可为 null） TABLE_SCHEM String => 表模式（可为 null）
 * TABLE_NAME String => 表名称 COLUMN_NAME String => 列名称 DATA_TYPE int => 来自
 * java.sql.Types 的 SQL 类型 TYPE_NAME String => 数据源依赖的类型名称，对于 UDT，该类型名称是完全限定的
 * COLUMN_SIZE int => 列的大小。 BUFFER_LENGTH 未被使用。 DECIMAL_DIGITS int => 小数部分的位数。对于
 * DECIMAL_DIGITS 不适用的数据类型，则返回 Null。 NUM_PREC_RADIX int => 基数（通常为 10 或 2）
 * NULLABLE int => 是否允许使用 NULL。 columnNoNulls - 可能不允许使用 NULL 值 columnNullable -
 * 明确允许使用 NULL 值 columnNullableUnknown - 不知道是否可使用 null REMARKS String =>
 * 描述列的注释（可为 null） COLUMN_DEF String => 该列的默认值，当值在单引号内时应被解释为一个字符串（可为 null）
 * SQL_DATA_TYPE int => 未使用 SQL_DATETIME_SUB int => 未使用 CHAR_OCTET_LENGTH int =>
 * 对于 char 类型，该长度是列中的最大字节数 ORDINAL_POSITION int => 表中的列的索引（从 1 开始） IS_NULLABLE
 * String => ISO 规则用于确定列是否包括 null。 YES --- 如果参数可以包括 NULL NO --- 如果参数不可以包括 NULL
 * 空字符串 --- 如果不知道参数是否可以包括 null SCOPE_CATLOG String => 表的类别，它是引用属性的作用域（如果
 * DATA_TYPE 不是 REF，则为 null） SCOPE_SCHEMA String => 表的模式，它是引用属性的作用域（如果 DATA_TYPE
 * 不是 REF，则为 null） SCOPE_TABLE String => 表名称，它是引用属性的作用域（如果 DATA_TYPE 不是 REF，则为
 * null） SOURCE_DATA_TYPE short => 不同类型或用户生成 Ref 类型、来自 java.sql.Types 的 SQL
 * 类型的源类型（如果 DATA_TYPE 不是 DISTINCT 或用户生成的 REF，则为 null） IS_AUTOINCREMENT String
 * => 指示此列是否自动增加 YES --- 如果该列自动增加 NO --- 如果该列不自动增加 空字符串 --- 如果不能确定该列是否是自动增加参数
 * 
 * @author Stevy Qi
 * @Time 下午1:55:53
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
