package genericLibrary.genLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is the generic class for data driven testing
 * 
 * @author HP
 *
 */
public class FileLib {
	/**
	 * This is the method to read the data from PropertyFile
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getProperty(String key) throws IOException {
		File f = new File("./data/commondata.property");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
/**
 * This is the method to read the data from excel file
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String getExcelproperty(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		File f = new File("./data/script.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
/**
 * This is the method for write the data to excel file
 * @param sheetName
 * @param row
 * @param cell
 * @param data
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public void setExcelData(String sheetName, int row, int cell, String data)
			throws EncryptedDocumentException, IOException {
		File f = new File("./data/script.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

	}
}
