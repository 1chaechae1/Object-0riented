package week03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("ù ??° ???? ?Է? : ");
		double i = stdIn.nextDouble();
		
		System.out.print("?? ??° ???? ?Է? : ");
		double d = stdIn.nextDouble();
		
		System.out.println("???? : " + i + "+" + d + "=" + (i + d) + " ?Դϴ?."); 
		System.out.println("???? : " + i + "-" + d + "=" + (i - d) + " ?Դϴ?."); 
		System.out.println("???? : " + i + "*" + d + "=" + (i * d) + " ?Դϴ?.");
		System.out.println("?????? : " + i + "/" + d + "=" + (i / d) + " ?Դϴ?.");
		System.out.println("???հ? : " + ((i + d)/2) + " ?Դϴ?.");
		stdIn.close();

	}

}