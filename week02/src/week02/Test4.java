package week02;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("2개의 정수와 연산자를 공간(space)으로 구분하여 입력 : ");
		int i = stdIn.nextInt();
		int d = stdIn.nextInt();
		String operator = stdIn.next();
		System.out.println(i + operator + d + " 의 결과는 " + (i + operator + d)+ " 입니다.");
		stdIn.close();
	}

}