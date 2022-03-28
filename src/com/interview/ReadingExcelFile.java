package com.interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingExcelFile {
	
	@Test
	public void read() throws EncryptedDocumentException, IOException {
		File f=new File("./data/script.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet1 = wb.getSheet("sheet1");
		Row row = sheet1.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
	}
}
