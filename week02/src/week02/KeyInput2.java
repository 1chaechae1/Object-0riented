package week02;

import java.util.Scanner;

public class KeyInput2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please input? ");
		
		String name = input.next();
		System.out.println("result = " + name);
		
		input.close();

	}

}
