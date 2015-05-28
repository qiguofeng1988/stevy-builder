package com.stevy.builder;

import java.util.List;

import com.stevy.builder.model.TableModel;
import com.stevy.builder.util.TableUtil;
import com.stevy.builder.util.VelocityUtil;
/**
 * 
 * @author Stevy Qi
 * @Date 2015��5��28��
 */
public class Builder {

	public static void main(String[] args) throws Exception {
		
		String tableName = "%";
		List<TableModel> tables = TableUtil.getTables(tableName,"gogoup_");
		for (TableModel tableModel : tables) {
			VelocityUtil.createFiles(tableModel);
		}
	}

}
