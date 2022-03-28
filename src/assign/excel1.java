package assign;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel1 {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("./data/work.xlsx");
        Workbook wb = WorkbookFactory.create(f);
        short s = wb.getSheet("Sheet1").getRow(1).getLastCellNum();
        System.out.println(s);
	}

}

