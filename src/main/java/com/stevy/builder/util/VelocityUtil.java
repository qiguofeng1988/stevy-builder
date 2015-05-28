package com.stevy.builder.util;

import java.io.StringWriter;
import java.util.Date;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.tools.generic.DateTool;

import com.google.common.collect.Lists;
import com.stevy.builder.model.TableModel;

/**
 * 
 * @author Stevy Qi
 * @Date 2015Äê5ÔÂ28ÈÕ
 */
public class VelocityUtil {
	
	private static List<String> templateList = Lists.newArrayList();
	static{
		templateList.add("templates/javabean.vm");
	}

	public static String createFileStr(TableModel tableModel, String templateName) throws Exception {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

		ve.init();
		Template t = ve.getTemplate(templateName);
		VelocityContext ctx = new VelocityContext();

		DateTool dateTool = new DateTool();
		ctx.put("tableModel", tableModel);
		ctx.put("now", dateTool.format("yyyy-M-d HH:mm:ss", new Date()));

		StringWriter sw = new StringWriter();

		t.merge(ctx, sw);

		return sw.toString();
	}

	public static void createFile(TableModel tableModel, String templateName) throws Exception {
		String content = createFileStr(tableModel, templateName);
		FileUtil.saveAsFileOutputStream("D:/product/po/" + tableModel.getBeanName() + ".java", content);
	}

	public static void createFiles(TableModel tableModel) throws Exception {
		for (String templateName : templateList) {
			createFile(tableModel, templateName);
		}
	}
}
