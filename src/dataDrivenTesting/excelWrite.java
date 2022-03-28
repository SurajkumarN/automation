package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelWrite {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f=new File("./data/script.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		String cv = wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(cv);
		wb.getSheet("Sheet1").getRow(0).getCell(4).setCellValue("Status");
		wb.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("Pass");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
	}
}
