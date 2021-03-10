package com.javaex.io.charterstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";

	public static void main(String args[]) {
		Scanner scanner = null;
		File f = new File(filename);
		try {
			scanner = new Scanner(f);
			String name;
			float height;
			float weight;

			while (scanner.hasNext()) {
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();

				System.out.printf("%s, 키:%f, 체중:%f%n", name, height, weight);
				scanner.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못함");
		} catch (Exception e) {
		} finally {
			try {
				scanner.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
