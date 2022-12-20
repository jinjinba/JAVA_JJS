package com.kh.javaQ_03_03;
/*
 * 아래는 변수 의 값에 따라 num ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다 삼항 연산 .
 * 자를 이용해서 에 알맞은 코드를 넣으시오 (1) .
 * !!삼항연산자를 두 번 사용
 */
public class Exercise3_3 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "어차피 양수"));
	}
	
}
