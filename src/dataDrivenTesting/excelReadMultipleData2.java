package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReadMultipleData2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f=new File("./data/script.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println("Number of rows "+rowCount);
		short cellCount = wb.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println("Number of cell "+cellCount);
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print("	"+data);
			}
			System.out.println(" ");
		}
		
		
	}

}
