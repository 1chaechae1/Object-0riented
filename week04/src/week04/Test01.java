package week04;

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double widthTop;
		double widthLow;
		double height;
		
		System.out.print("���� ���� : ");
		widthTop = input.nextDouble();
		System.out.print("�Ʒ��� ���� : ");
		widthLow = input.nextDouble();
		System.out.print("���� : ");
		height = input.nextDouble();
		
		double TArea = (widthTop + widthLow) * height / 2;
		
		System.out.println(" ��ٸ��� ���� : " + TArea + " �Դϴ�.");
		
		input.close();
	}

}
