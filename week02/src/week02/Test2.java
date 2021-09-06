package week02;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("국적과 이름, 나이, 키를 공간(space)으로 구분하여 입력 : ");
		String nationality =stdIn.next();
		String name = stdIn.next();
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		System.out.println("나의 국적은 " + nationality + "이며 "+ "이름은 " + name + "입니다");
		System.out.println("나이는 " + i + "살이며 " + "키는 " + d +"cm 입니다");
		stdIn.close();
	}

}