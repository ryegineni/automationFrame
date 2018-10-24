package com.auto.utils;

import java.io.FileInputStream;
import java.util.Properties;

import jxl.Sheet;
import jxl.Workbook;

public class Helper {
	private static Properties prop=new Properties();
	private static FileInputStream fis;
	private static Workbook w;
	private static Sheet sheet1;
	static{
		try{
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/auto/properties/prop.properties");
			prop.load(fis);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	static{
		try{
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/auto/testData/TestData.xls");
			w=Workbook.getWorkbook(fis);
			sheet1=w.getSheet("shhet1");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

}
