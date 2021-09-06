package week04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##");
		
		System.out.print("첫 번째 점의 위치 (x1, y1) 입력 : ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		System.out.print("두 번째 점의 위치 (x2, y2) 입력 : ");
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		// Math.pow : 제곱연산
		double result = Math.sqrt((Math.pow(x1-x2,2))+(Math.pow(y1-y2,2)));
		System.out.println("두 점 간의 거리는 " + form.format(result) + " 입니다.");
		
		input.close();
	}

}
