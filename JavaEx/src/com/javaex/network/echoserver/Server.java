package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0", 10000);
			serverSocket.bind(ips);
			
			System.out.println("<서버 시작>");
			System.out.println("SERVER: [연결을 기다립니다.]");
			
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
//			InetSocketAddress socketaddress = (InetSocketAddress)socket.getRemoteSocketAddress();
//			System.out.println("SERVER: [클라이언트가 연결되었습니다]");
//			System.out.println("	클라이언트: "+ socketaddress.getAddress() + ":" + socketaddress.getPort());
//			
//			InputStream is = socket.getInputStream();
//			Reader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			
//			
//			OutputStream os = socket.getOutputStream();
//			Writer osw =  new OutputStreamWriter(os, "UTF-8");
//			BufferedWriter bw = new BufferedWriter(osw);
//			
//			
//			String message;
//			
//			while(true) {
//				message = br.readLine();
//				
//				if(message == null) {
//					System.out.println("SERVER: 접속을 종료합니다");
//					break;
//				}
//				System.out.println("SERVER: [수신 메시지]" + message);
//				
//				message = "Echo back - " + message;
//				System.out.println("SERVER: [Echo back] : " +message);
//				bw.write(message);
//				bw.newLine();
//				bw.flush();
//			}
//			
//			bw.close();
//			br.close();
//			
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
			serverSocket.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
