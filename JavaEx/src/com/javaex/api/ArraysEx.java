package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//	배열을 조작하는데 도움을 주는 클래스
public class ArraysEx {

	public static void main(String[] args) {
		// arrayCopyEx();
		// basicSortAsc();
		// basicSortDesc();
//		customClassSort();
		//basicSerch();
		customClassSerch();
	}

	private static void customClassSerch() {
		Member[] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new Member("전후치")
		};
		
		Arrays.sort(members);
		System.out.println("원본: " + Arrays.toString(members));
		int index = Arrays.binarySearch(members, new Member("홍길동"), new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println("홍길동 검색 : " + index);
	}

	private static void basicSerch() {
		int[] nums = { 5, 8, 1, 3, 6, 9, 10, 5, 8, 2 };
		
		System.out.println("원본: " + Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println("정렬: " + Arrays.toString(nums));
		int index = Arrays.binarySearch(nums, 9);
		System.out.println("9의 인덱스: " + index);

		String[] words = { "Java", "C", "C++", "Python", "Linux" };
		System.out.println("원본: " + Arrays.toString(words));
		Arrays.sort(words);
		System.out.println("정렬: " + Arrays.toString(words));
		index = Arrays.binarySearch(words, "Java");
		System.out.println("Java의 인덱스: " + index);

	}

	private static void customClassSort() {
		Member[] members = { new Member("홍길동"), new Member("장길산"), new Member("전우치") };
		System.out.println("원본 배열: " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬 배열: " + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("역순 배열: " + Arrays.toString(members));

	}

	private static void basicSortAsc() {
		int[] socres = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("원본: " + Arrays.toString(socres));
		Arrays.sort(socres);
		System.out.println("오름차순 정렬: " + Arrays.toString(socres));
	}

	private static void basicSortDesc() {
		Integer[] socres = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("원본: " + Arrays.toString(socres));
		Arrays.sort(socres, Collections.reverseOrder());
		System.out.println("내림차순 정렬: " + Arrays.toString(socres));
	}

	// 배열 복사
	private static void arrayCopyEx() {
		// 회고
		char[] src = "Java Programming".toCharArray();
		System.out.println("원본: " + Arrays.toString(src));

		// System을 이용한 복사
		char target[] = new char[src.length];
		System.arraycopy(src, // 원본배열의
				0, // 시작 인덱스
				target, // 타겟 배열
				0, // 복사 시작 위치
				src.length); // 복사할 길이
		System.out.println("System을 이용한 배열 복사:" + Arrays.toString(target));

		// Arrays 클래스를 이용한 배열의 복제
		target = Arrays.copyOf(src, src.length); // src 배열을 길이만큼 복제
		System.out.println("copyOf: " + Arrays.toString(target));

		// 배열의 일부 복제
		target = Arrays.copyOfRange(src, 5, // 복사 시작 인덱스
				12); // 복사 끝 인덱스
		System.out.println("copyOfRange:" + Arrays.toString(target));
	}

}
