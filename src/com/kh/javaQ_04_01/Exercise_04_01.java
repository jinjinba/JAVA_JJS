package com.kh.javaQ_04_01;

public class Exercise_04_01 {
	public static void main(String [] args) {
//		1. int x 10 20 true 형 변수 가 보다 크고 보다 작을 때 인 조건식
		int x = 14;
		if (x > 10 && x < 20) {
			System.out.println("성공");
		}
		
//		2. char ch true 형 변수 가 공백이나 탭이 아닐 때 인 조건식
//		char ch = 'A';
//		if (ch != ' ' || ch != '\t') {
//			System.out.println("성공");
//		}
		
//		3. char ch 'x' 'X' true 형 변수 가 또는 일 때 인 조건식
//		char ch = 'x';
//		if(ch == 'x' || ch == 'X') {
//			System.out.println("성공");
//		}
	
//		4. char ch 형 변수 가 숫자(‘0’~‘9’)일 때 인 조건식
//		char ch = '9';
//		if(ch >= '0' && ch <= '9') {
//			System.out.println("성공");
//		}
		
//		5. char ch ( ) true 형 변수 가 영문자 대문자 또는 소문자 일 때 인 조건식
		char ch = 'a';
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("성공");
		}
		
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
//		나눠떨어지지 않을 때 인 조건식 true
		int year = 400;
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("true"); // 이게 되나..?
		}
		
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn = false;
		if(!powerOn) {
			System.out.println("굿");
		}
		
//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println("끝");
		}
	}
}
