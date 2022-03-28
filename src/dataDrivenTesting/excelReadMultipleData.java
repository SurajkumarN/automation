package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("./data/script.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(rowCount);
		// short cellCount = wb.getSheet("sheet1").getRow(0).getLastCellNum();
		for (int i = 0; i <= rowCount; i++) {
			String data0 = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String data1 = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			String data2 = wb.getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();
			String data3 = wb.getSheet("Sheet1").getRow(i).getCell(3).getStringCellValue();
			String data4 = wb.getSheet("Sheet1").getRow(i).getCell(4).getStringCellValue();
			System.out.println(data0 + "	" + data1 + "	" + data2 + "	" + data3 + "	" + data4);

		}
	}

}
