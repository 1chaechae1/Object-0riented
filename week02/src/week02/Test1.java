package week02;

import java.util.Scanner;
	
public class Test1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("2개의 정수를 공간(space)으로 구분하여 입력 : ");
		int i = stdIn.nextInt();
		int d = stdIn.nextInt();
		System.out.println(i + " + " + d + "의 결과는 " + (i + d) + " 입니다."); 
		System.out.println(i + " - " + d + "의 결과는 " + (i - d) + " 입니다."); 
		System.out.println(i + " * " + d + "의 결과는 " + (i * d) + " 입니다.");
		System.out.println(i + " / " + d + "의 결과는 " + (i / d) + " 입니다.");
		stdIn.close();
	}

}