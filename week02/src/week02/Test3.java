package week02;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("2���� ������ �����ڸ� ����(space)���� �����Ͽ� �Է� : ");
		int i = input.nextInt();
		int d = input.nextInt();
		String operator = input.next();
		System.out.println(i + operator + d);
		input.close();
	}

}