package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		printLocalIp();
		printServerIp("www.naver.com");
		printServerIp("www.google.com");
	}

	private static void printServerIp(String hostname) {
		try {
			InetAddress[] adrs = InetAddress.getAllByName(hostname);
			for(InetAddress remote: adrs) {
				System.out.println(hostname + ": IP" + remote.getHostAddress());
			}
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	private static void printLocalIp() {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP: " + local.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
