package week05;

import java.util.Scanner;

public class Test2 {
// MultiIFTest1과 같다.
	public static void main(String[] args) {
		char grade;
		Scanner stdin = new Scanner(System.in);
		
	    System.out.print("성적을 입력하세요 : ");
	    int score = stdin.nextInt();
	    if(score >= 90)
	        grade = 'A';
	    else if(score >= 80)
	    	grade = 'B';
	    else if(score >= 70)
	    	grade = 'C';
	    else if(score >= 60)
	    	grade = 'D';
	    else 
	    	grade = 'F';
	    System.out.println("학점은"+ grade + "입니다.");

	   stdin.close();
	}

}
