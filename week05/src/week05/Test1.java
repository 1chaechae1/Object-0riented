package week05;

import java.util.Scanner;

public class Test1 {
//DoubleIFTest1과 같다.
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
	    System.out.print("점수을 입력하세요 : ");
	    int score = stdin.nextInt();
	    if(score >= 70) {
	            System.out.println("축하합니다!");
	            System.out.println("합격입니다.");
	    }
	    else
	    {
	            System.out.println("불합격입니다.");
	            System.out.println("다음기회를 이용하세요.");
	    }
	    System.out.println("수고하셨습니다");
	    
	    stdin.close();
	}

}
