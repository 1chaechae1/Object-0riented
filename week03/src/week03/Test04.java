package week03;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		int cm, feet;
		double inch;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("키를 입력하시오 (cm) : ");
		cm = input.nextInt();
		inch = cm/2.54;
		feet = (int)inch/12;
		inch = inch - feet * 12;
		System.out.printf("%dcm는 %d피트 %.0f인치입니다.", cm, feet, inch);
		
		input.close();
	}

}
