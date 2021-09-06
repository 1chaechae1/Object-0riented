package week04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##"); // 소수점 특정 자리수까지만 표현
		
		System.out.print("구의 반지름 입력 : ");
		double radius = input.nextDouble();
		
		// 구의 부피
		double volume = 4/3d*radius*radius*radius; 
		System.out.println("부피는 : " + form.format(volume) + " 입니다.");
		
		input.close();
	}

}
