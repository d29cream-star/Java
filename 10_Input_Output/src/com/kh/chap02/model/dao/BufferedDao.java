package com.kh.chap02.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	public void outputFile() {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("d.txt");
			bw = new BufferedWriter(fw);

			bw.write("하하오오");
			bw.newLine(); // 개행
			bw.write("ㅋㅋㅋㅋ");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void inputFile() {
		try (BufferedReader brf = new BufferedReader(new FileReader("d.txt"))) {
			String str = "";
			while ((str = brf.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
