package com.kh.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;

		int portNumber = 3005;

		try {
			server = new ServerSocket(portNumber);

			System.out.println("요청은 언제오지");

			Socket socket = server.accept();
			System.out.println("클라이언트와 연결 성공");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());

			String msg = br.readLine();
			System.out.println("클라이언트가 보낸 메세지 : " + msg);

			if ("안녕".equals(msg)) {
				pw.println("안녕");

			} else {
				pw.println("잘가");
			}
			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
