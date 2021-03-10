package com.javaex.io.charterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "last-leaf-filtered.txt";

	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);

			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);

			String line = null;

			while ((line = br.readLine()) != null) {
				if (line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				}
			}
			
			System.out.println("필터링 완료");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e) {

			}
		}

	}

}
