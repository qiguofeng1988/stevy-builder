package com.stevy.builder.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang.math.NumberUtils;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import com.stevy.builder.enums.FieldTypes;
import com.stevy.builder.model.FieldModel;
import com.stevy.builder.model.TableModel;
/**
 * 
 * @author Stevy Qi
 * @Date 2015��5��28��
 */
public class TableUtil {
	
	public static List<TableModel> getTables(String tableName) throws InstantiationException, IllegalAccessException, ClassNotFoundException,
			SQLException {
		return getTables(tableName,null);
	}
	
	public static List<TableModel> getTables(String tableName,String tablePrefix) throws InstantiationException, IllegalAccessException, ClassNotFoundException,
	SQLException {
		List<TableModel> tableList = Lists.newArrayList();
		
		Class.forName(ConfigUtils.getConf().getString("db.driver")).newInstance();
		Connection conn = DriverManager.getConnection(ConfigUtils.getConf().getString("db.url"));
		DatabaseMetaData dbmd = conn.getMetaData();
		ResultSet tableRet = dbmd.getTables(null, "%", tableName, new String[] { "TABLE" });
		String sqlTableName;
		String beanTableName;
		while (tableRet.next()){
			TableModel tableModel = new TableModel();
			sqlTableName = tableRet.getString("TABLE_NAME");
			tableModel.setTableName(sqlTableName);
			if(tablePrefix != null){
				sqlTableName = sqlTableName.replace(tablePrefix, "");
			}
			beanTableName = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, sqlTableName);
			tableModel.setBeanName(beanTableName);
			String columnName;
			String columnType;
			String beanName;
			String suffixBeanName;
			String beanType;
			String remark;
			int datasize;
			int digits;
			int nullable;
			ResultSet colRet = dbmd.getColumns(null, "%", tableRet.getString("TABLE_NAME"), "%");
			List<FieldModel> fieldList = Lists.newArrayList();
			while (colRet.next()) {
				FieldModel fieldModel = new FieldModel();
				columnName = colRet.getString("COLUMN_NAME");//COLUMN_NAME�����ֶε�����
				columnType = colRet.getString("TYPE_NAME");//TYPE_NAME������������
				beanName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, columnName);
				suffixBeanName = beanName.substring(0, 1).toUpperCase() + beanName.substring(1, beanName.length());
				beanType = FieldTypes.getValue(NumberUtils.toInt(colRet.getString("DATA_TYPE")));//TYPE_NAME���� java.sql.Types �� SQL ����
				remark = colRet.getString("REMARKS");//REMARKS �����е�ע�ͣ���Ϊ null��
				datasize = colRet.getInt("COLUMN_SIZE");//COLUMN_SIZE���������������ֶεĳ���
				digits = colRet.getInt("DECIMAL_DIGITS");//С�����ֵ�λ��
				nullable = colRet.getInt("NULLABLE");//���NULLABLE������1�ͱ�ʾ������Null,��0�ͱ�ʾNot Null
				fieldModel.setColumnName(columnName);
				fieldModel.setColumnType(columnType);
				fieldModel.setDatasize(datasize);
				fieldModel.setBeanName(beanName);
				fieldModel.setSuffixBeanName(suffixBeanName);
				fieldModel.setBeanType(beanType);
				fieldModel.setDigits(digits);
				fieldModel.setNullable(nullable);
				fieldModel.setRemark(remark);
				fieldList.add(fieldModel);
			}
			tableModel.setFieldList(fieldList);
			tableList.add(tableModel);
		}
		return tableList;
	}
}
