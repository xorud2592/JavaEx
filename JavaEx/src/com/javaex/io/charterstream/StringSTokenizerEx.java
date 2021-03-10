package com.javaex.io.charterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringSTokenizerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";

	public static void main(String[] args) {
		Reader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token + " ");
				}
				System.out.println();
			}
		}catch(FileNotFoundException e) {
		}catch (Exception e) {
		}finally {
			try {
				br.close();
			}catch (Exception e) {
			}
		}
		
	}

}
