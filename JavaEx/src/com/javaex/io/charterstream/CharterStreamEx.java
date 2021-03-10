package com.javaex.io.charterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharterStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "myFile.txt";

	public static void main(String[] args) {
//		writeTextEx();
		readTextEx();
	}

	private static void readTextEx() {
		Reader reader = null;
		try {
			reader = new FileReader(filename);

			int data = 0;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 못찾았습니다.");
		} catch (IOException e) {

		} finally {
			try {
				reader.close();
			} catch (Exception e) {

			}
		}
	}

	private static void writeTextEx() {
		Writer writer = null;

		try {
			writer = new FileWriter(filename);

			System.out.println("파일을 열였습니다.");
			writer.write("Bit Computer\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2021. 03");
			System.out.println("파일을 기록헀습다.");

			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}

	}

}
