package com.javaex.io;

import java.io.File;
import java.io.IOException;

public class FileClassEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";

	public static void main(String[] args) {
		File root = new File(rootPath);

		System.out.println(rootPath + ":" + root.exists());

		if (!root.exists()) {
			root.mkdirs();
		}

		printInfo(root);
		System.out.println();
		
		File file = new File(rootPath + "\\myFile.txt");
		System.out.println("-> myFile.txt 생성");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했습니다!");
			}
			
		}
		printInfo(root);
		System.out.println();
			
		System.out.println("-> myFile.txt 삭제");
		file.delete();
		
		printInfo(root);
	}

	private static void printInfo(File file) {
		System.out.println("==============");

		if (file.isDirectory()) {
			System.out.println("Directory: " + file.getName());
			
			File[] files = file.listFiles();
			
			for(File f : files) {
				System.out.print(f.isDirectory() ? "d " : "f ");
				System.out.println(f.getName() + ":" + f.length());
			}
		}
	}
}
