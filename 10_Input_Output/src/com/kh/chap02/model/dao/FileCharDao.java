package com.kh.chap02.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {

	public void outputToFile() {
		/*
		 * FileWriter fw = null;
		 * 
		 * try { fw = new FileWriter("b.txt"); fw.write("어쩌고저쩌고~");
		 * 
		 * }catch(FileNotFoundException e) { e.printStackTrace(); }catch(IOException e)
		 * { e.printStackTrace();
		 * 
		 * }finally { try{ if(fw != null) { fw.close(); } }catch(IOException e){
		 * e.printStackTrace();
		 * 
		 * } }
		 */

		try (FileWriter fw = new FileWriter("b.txt")) {
			fw.write("한글 출력 가능");
			fw.write("출력출력");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void myDiary() {
		Date now = new Date();
		// System.out.println(now);
		String title = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		// System.out.println(title);
		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(" 오늘의 다이어리.txt");
		try (FileWriter fw = new FileWriter(sb.toString()); Scanner sc = new Scanner(System.in)) {

			System.out.print("내용을 입력해주세요 >");
			String content = sc.nextLine();

			fw.write("오늘의 다이어리 내용 : \t" + content);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
