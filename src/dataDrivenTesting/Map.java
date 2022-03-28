package dataDrivenTesting;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add(null);
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("url", "https://demo.actitime.com/login.do");
		map.put("username", "Admin");
		map.put("password", "manager");
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		
	}
}
