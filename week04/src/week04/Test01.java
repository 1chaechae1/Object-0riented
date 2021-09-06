package week04;

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double widthTop;
		double widthLow;
		double height;
		
		System.out.print("위변 길이 : ");
		widthTop = input.nextDouble();
		System.out.print("아래변 길이 : ");
		widthLow = input.nextDouble();
		System.out.print("높이 : ");
		height = input.nextDouble();
		
		double TArea = (widthTop + widthLow) * height / 2;
		
		System.out.println(" 사다리꼴 넓이 : " + TArea + " 입니다.");
		
		input.close();
	}

}
