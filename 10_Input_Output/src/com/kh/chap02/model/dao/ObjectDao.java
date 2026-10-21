package com.kh.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap02.model.dto.Message;

public class ObjectDao {

	public void outputFile() {
		Message m = new Message("말이안됨");

		try (ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("e.txt"))) {
			fos.writeObject(m);

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void inputfile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"))) {
			Message m = (Message)ois.readObject();
		
				System.out.println(m);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
}
