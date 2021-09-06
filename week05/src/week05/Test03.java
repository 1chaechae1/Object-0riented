package week05;

import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    System.out.println("키를 입력하세요");
	    int height = stdin.nextInt();
	    System.out.println("몸무게를 입력하세요");
	    int weight = stdin.nextInt();
	    double std_weight=(height-100)*0.9;
			
	    if(weight < std_weight) {
	      System.out.println("저체중입니다.");
	    }
	    else if (weight > std_weight) {
	      System.out.println("과체중입니다.");
	    }
	    else System.out.println("표준입니다.");
			
	    stdin.close();
	}

}
