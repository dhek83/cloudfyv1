package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream f0;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static int getRowCount(String xlfile, String xsheet) throws IOException
	
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String xlfile, String xsheet, int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
	}
	
	public static String getCellData(String xlfile, String xsheet, int rownum, int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try {
			DataFormatter formatter= new DataFormatter();
			String cellData= formatter.formatCellValue(cell);
			return cellData; 
		}
		
		catch (Exception e)
		{
			data="";
		}
		
		wb.close();
		fi.close();
		return data;
	}
	
	
	public static void setcelldata(String xlfile, String xsheet, int rownum, int colnum, String data) throws IOException
	{  
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xsheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		f0=new FileOutputStream(xlfile);
		wb.write(f0);
		wb.close();
		fi.close();
		f0.close();
		
	}
	
		
		
	}

