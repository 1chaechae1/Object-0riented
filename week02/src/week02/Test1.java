package week02;

import java.util.Scanner;
	
public class Test1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("2���� ������ ����(space)���� �����Ͽ� �Է� : ");
		int i = stdIn.nextInt();
		int d = stdIn.nextInt();
		System.out.println(i + " + " + d + "�� ����� " + (i + d) + " �Դϴ�."); 
		System.out.println(i + " - " + d + "�� ����� " + (i - d) + " �Դϴ�."); 
		System.out.println(i + " * " + d + "�� ����� " + (i * d) + " �Դϴ�.");
		System.out.println(i + " / " + d + "�� ����� " + (i / d) + " �Դϴ�.");
		stdIn.close();
	}

}