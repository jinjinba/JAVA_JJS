package com.kh.javaQ_04_01;

public class Exercise_04_01 {
	public static void main(String [] args) {
//		1. int x 10 20 true �� ���� �� ���� ũ�� ���� ���� �� �� ���ǽ�
		int x = 14;
		if (x > 10 && x < 20) {
			System.out.println("����");
		}
		
//		2. char ch true �� ���� �� �����̳� ���� �ƴ� �� �� ���ǽ�
//		char ch = 'A';
//		if (ch != ' ' || ch != '\t') {
//			System.out.println("����");
//		}
		
//		3. char ch 'x' 'X' true �� ���� �� �Ǵ� �� �� �� ���ǽ�
//		char ch = 'x';
//		if(ch == 'x' || ch == 'X') {
//			System.out.println("����");
//		}
	
//		4. char ch �� ���� �� ����(��0��~��9��)�� �� �� ���ǽ�
//		char ch = '9';
//		if(ch >= '0' && ch <= '9') {
//			System.out.println("����");
//		}
		
//		5. char ch ( ) true �� ���� �� ������ �빮�� �Ǵ� �ҹ��� �� �� �� ���ǽ�
		char ch = 'a';
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("����");
		}
		
//		6. int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100����
//		������������ ���� �� �� ���ǽ� true
		int year = 400;
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("true"); // �̰� �ǳ�..?
		}
		
//		7. boolean�� ���� powerOn�� false�� �� true�� ���ǽ�
		boolean powerOn = false;
		if(!powerOn) {
			System.out.println("��");
		}
		
//		8. ���ڿ� �������� str�� ��yes���� �� true�� ���ǽ�
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println("��");
		}
	}
}
