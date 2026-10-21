package com.kh.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {

	public void outputToFile() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);

			fos.write('A');
			fos.write('B');

			// fos.write('조');
			// fos.write('안');
			// fos.write('나');

			// fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void inputFromFile() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			/*System.out.println((char)fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/
			/*while(true) {
				int value = fis.read();
				if(value != -1) {					
					System.out.println(value);
				} else {
					break;
				}
			}*/
			int value = 0;
			while((value - fis.read() != -1)) {
				System.out.println(value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
