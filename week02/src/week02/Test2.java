package week02;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ �̸�, ����, Ű�� ����(space)���� �����Ͽ� �Է� : ");
		String nationality =stdIn.next();
		String name = stdIn.next();
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		System.out.println("���� ������ " + nationality + "�̸� "+ "�̸��� " + name + "�Դϴ�");
		System.out.println("���̴� " + i + "���̸� " + "Ű�� " + d +"cm �Դϴ�");
		stdIn.close();
	}

}