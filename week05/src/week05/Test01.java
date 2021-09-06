package week05;

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    System.out.print("금액을 입력하시오 : ");
	    int money = stdin.nextInt();
			
	    if(money>0) {
	      int result = money/50000;
	      int a = money % 50000;
	      System.out.println("오만원 권 :		" + result + "장");	
				
	      int result2 = a/10000;
	      int b = a % 10000;
	      System.out.println("일만원 권 :		" + result2 + "장");
				
	      int result3 = b/5000;
	      int c = b % 5000;
	      System.out.println("오천원 권 :		" + result3 + "장");
				
	      int result4 = c/1000;
	      int d = c % 1000;
	      System.out.println("천원 권  :		" + result4 + "장");
				
	      int result5 = d/500;
	      int e = d % 500;
	      System.out.println("오백원 동전 :		" + result5 + "개");
				
	      int result6 = e/100;
	      int f = e % 100;
	      System.out.println("백원 동전 :		" + result6 + "개");
				
	      int result7 = f/50;
	      int g = f % 50;
	      System.out.println("오십원 동전 :		" + result7 + "개");
				
	      int result8 = g/10;
	      int h = g % 10;
	      System.out.println("십원 동전 :		" + result8 + "개");
				
	      int result9 = h/5;
	      int i = h % 5;
	      System.out.println("오원 동전 :		" + result9 + "개");
				
	      int result10 = i/1;
	      System.out.println("일원 동전 :		" + result10 + "개");
	    }
	    stdin.close();
	}

}
