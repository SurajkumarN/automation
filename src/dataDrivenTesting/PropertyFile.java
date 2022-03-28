package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties pro = new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		String un = pro.getProperty("username");
		String pwd = pro.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
