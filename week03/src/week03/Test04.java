package week03;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		int cm, feet;
		double inch;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Ű�� �Է��Ͻÿ� (cm) : ");
		cm = input.nextInt();
		inch = cm/2.54;
		feet = (int)inch/12;
		inch = inch - feet * 12;
		System.out.printf("%dcm�� %d��Ʈ %.0f��ġ�Դϴ�.", cm, feet, inch);
		
		input.close();
	}

}