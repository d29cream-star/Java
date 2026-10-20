package com.kh.chap10.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		File file1 = new File("메롱.txt");
		
		try {
			file1.createNewFile();
			
			File folder = new File("folder");
			folder.mkdir();
		
			File file2 = new File("folder/abc.txt");
			file2.createNewFile();
		
			System.out.println(file2.getName());
			System.out.println(file2.length());
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
 