package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AnotherMap {

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		//prop.put("향수", new Perfume("450", "프루티"));
		prop.setProperty("List", "ArrayList");
		
		try {
		prop.storeToXML(new FileOutputStream("test.xml"),"12345");
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}