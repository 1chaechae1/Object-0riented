package week04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �߽�(x0,y0)�� ������ �Է� : ");
		int x0 = input.nextInt();
		int y0 = input.nextInt();
		int radius = input.nextInt();
		System.out.print("���� �� ��ġ (x1,y1) �Է� : ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		double d = Math.sqrt((Math.pow(x0-x1,2))+(Math.pow(y0-y1,2)));
		if(d>=radius) {
			System.out.println("�� �ۿ� ����(outside)");
		}
			System.out.println("�� �ȿ� ����(inside point)");
		
		input.close();
	}
}
