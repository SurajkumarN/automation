package genericLibrary.genLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filelib1 {
	
public String getData(String key) throws IOException {
	File f=new File("./data/commondata.property");
	FileInputStream fis = new FileInputStream(f);
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
}
