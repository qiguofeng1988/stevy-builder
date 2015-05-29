package com.stevy.builder;

import java.util.List;

import com.stevy.builder.model.TableModel;
import com.stevy.builder.util.TableUtil;
import com.stevy.builder.util.VelocityUtil;

/**
 * 
 * @author Stevy Qi
 * @Date 2015年5月28日
 */
public class Builder {

	public static void main(String[] args) throws Exception {

		String tableName = "%";
		String packageName = "com.zcool.gogoup";
		String savePath = "D:/product/";
		List<TableModel> tables = TableUtil.getTables(tableName, "gogoup_");
		for (TableModel tableModel : tables) {
			System.out.println(tableModel);
			VelocityUtil.createFiles(tableModel, packageName, savePath);
		}
	}

}
