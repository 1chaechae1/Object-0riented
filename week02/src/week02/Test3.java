package week02;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("2개의 정수와 연산자를 공간(space)으로 구분하여 입력 : ");
		int i = input.nextInt();
		int d = input.nextInt();
		String operator = input.next();
		System.out.println(i + operator + d);
		input.close();
	}

}