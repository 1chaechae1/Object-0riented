package week02;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("2���� ������ �����ڸ� ����(space)���� �����Ͽ� �Է� : ");
		int i = stdIn.nextInt();
		int d = stdIn.nextInt();
		String operator = stdIn.next();
		System.out.println(i + operator + d + " �� ����� " + (i + operator + d)+ " �Դϴ�.");
		stdIn.close();
	}

}