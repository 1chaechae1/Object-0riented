package week04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##");
		
		System.out.print("ù ��° ���� ��ġ (x1, y1) �Է� : ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		System.out.print("�� ��° ���� ��ġ (x2, y2) �Է� : ");
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		// Math.pow : ��������
		double result = Math.sqrt((Math.pow(x1-x2,2))+(Math.pow(y1-y2,2)));
		System.out.println("�� �� ���� �Ÿ��� " + form.format(result) + " �Դϴ�.");
		
		input.close();
	}

}
