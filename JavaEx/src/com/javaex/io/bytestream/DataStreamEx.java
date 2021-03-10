package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "primitives.txt";

	public static void main(String[] args) {
//		exportPrimitives();
		importPrimitives();
	}

	private static void importPrimitives() {
		InputStream is = null;
		DataInputStream dis = null;

		try {
			is = new FileInputStream(filename);
			dis = new DataInputStream(is);

			for (int i = 0; i < 2; i++) {
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();

				System.out.printf("%s, %b, %d, %f%n", s, b, val, f);
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을수 없습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				dis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	private static void exportPrimitives() {
		OutputStream os = null;

		DataOutputStream dos = null;

		try {
			os = new FileOutputStream(filename);

			dos = new DataOutputStream(os);

			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.3f);

			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} finally {
			try {

				dos.close();
			} catch (Exception e) {
			}
		}
	}

}
