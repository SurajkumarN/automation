package genericLibrary.genLib;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url = f.getProperty("url");
		System.out.println(url);
		
		String data = f.getExcelproperty("sheet1", 4, 2);
		System.out.println(data);
		
		f.setExcelData("Sheet1", 6, 0,"Suraj");
	}
}
