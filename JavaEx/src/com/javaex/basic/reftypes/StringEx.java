package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		//stringTest();
		stringFormatEx();
	}

	private static void stringFormatEx() {
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		System.out.println(total + "개의 " + fruit + "중에서 " + eat + "개를 먹었디.");
		
		String fmt = "%d개의 %s중에서 %d개를먹었다.\n";
		System.out.printf(fmt, total, fruit, eat);
		System.out.printf(fmt, 5, "오렌지", 2);
		
		System.out.printf("현재 이자율운 %f입니다.%n", 1.25f);
		fmt = "현재 이자율은 %.2f%%입니다.%n";
		System.out.printf(fmt, 1.25f);
	}

	private static void stringTest()
	{
		String str;
		str = "Java";
		System.out.println("str: " + str);
		String str2 = "Java";
		System.out.println("str2: " + str);
		String str3 = new String("Java");
		System.out.println("str3: " + str);
		
		System.out.println("str == str2 ? " + (str == str2));
		System.out.println("str == str3 ? " + (str == str3));
		
		System.out.println("str == str2 ? " + (str.equals(str3)));
		System.out.println("str == str3 ? " + (str.equals(str3)));
		
	}
}
