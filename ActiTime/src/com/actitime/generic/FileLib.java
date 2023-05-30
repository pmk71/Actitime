package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String  getProperty(String key) throws IOException
	{
		FileInputStream fs= new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fs);
		String data = p.getProperty(key);
		return data;

	}
	public String  getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs= new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void  setExcelData(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs= new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);

		FileOutputStream fo= new FileOutputStream("./data/testdata.xlsx");
		wb.write(fo);
		fo.close();

	}
}
