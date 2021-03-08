package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//
//		String s1 = "Java";
//		String s2 = new String("Java");
//		String s3 = "Java";
//
//		System.out.println("s1, s2 같은 객체 ? " + (s1 == s2));
//		System.out.println("s1, s3 같은 객체 ? " + (s1 == s3));
//
//		char letters[] = {'J', 'a', 'v', 'a'};
//		String s4 = new String(letters);
//		
//		System.out.println(s4);
		usefulMethods();
	}

	private static void usefulMethods() {
		String source = "Java Programming, JavaScript Programming";
		System.out.println("원본: " + source);
		
		System.out.println("length: " + source.length());
		System.out.println("5번 인덱스의 글자: " + source.charAt(5));
		
		System.out.println("모두 소문자: " + source.toLowerCase());
		System.out.println("모두 문자: " + source.toUpperCase());
		
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("1st Serch: " + index);
		
		index += "Java".length();
		index = source.indexOf("Java", index);
		System.out.println("2nd Serch: " + index);
		
		index = source.indexOf("Java", index + "Java".length());
		System.out.println("3rd Search: " + index);
		
		index = source.lastIndexOf("Java");
		System.out.println("역방향 검색: " +  index);
		
		System.out.println("18번째 인덱스 ~: " + source.substring(18));
		System.out.println("18 ~ 21: " + source.substring(18, 22));
		
		System.out.println("Replace: " + source.replace("Java", "Python"));
		
		System.out.println("원본: " + source);
		
		String str = "           Hello         ";
		System.out.println("trim:[" + str.trim() + "]");
		
		String words[] = source.split(" ");
		
		for(String data:words)
		{
			System.out.println("chunk: " + data);
		}
		
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
		
	}
}
