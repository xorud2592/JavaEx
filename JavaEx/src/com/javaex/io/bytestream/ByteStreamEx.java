package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteStreamEx {

	public static void main(String[] args) {
		byte input[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		byte output[] = null;

		System.out.println("원본: " + Arrays.toString(input));
		InputStream bis = null;
		OutputStream bos = null;

		try {
			bis = new ByteArrayInputStream(input);
			bos = new ByteArrayOutputStream();
			int data = 0;

			while ((data = bis.read()) != -1) {
				System.out.println("읽은 데이터: " + data);
				bos.write(data);
			}
			output  = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("출력: " + Arrays.toString(output));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			if (bos != null)
//				bos.close();
//			if (bis != null)
//				bis.close();
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
