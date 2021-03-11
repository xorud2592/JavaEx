package com.javaex.network.echoserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Clinet {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<클라이언트 시작>");
			System.out.println("CLIENT: [연결을 요청합니다]");
			
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);
			
			System.out.println("CLIENT: [서버에 연결되었습니다]");
			
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String message = "테스트 메시지";
			bw.write(message);
			System.out.println("CLIENT:[전송 메시지]: " + message);
			
			bw.close();
			
			System.out.println("<클라이언트 종료>");
		}catch (ConnectException e) {
			System.out.println("[접속이 거부되었습니다]");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
