package week05;

import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    System.out.print("중간고사 점수(최대 30점) ? ");
	    int m = stdin.nextInt();
	    System.out.print("기말고사 점수(최대 30점) ? ");
	    int f = stdin.nextInt();
	    System.out.print("출석 점수(최대 20점) ? ");
	    int a = stdin.nextInt();
	    System.out.print("평소고사 점수(최대 20점) ? ");
	    int e = stdin.nextInt();
	    int sum = m + f + a + e;
			
	    if (sum >=90) {
	      if (sum >= 95)
		System.out.println("총점= " + sum + " , 평점= A+");
	      else System.out.println("총점= " + sum + " , 평점= A0");
	    }
	    else if (sum >=80) {
	      if(sum >=85)
		System.out.println("총점= "+ sum + " , 평점= B+");
	      else System.out.println("총점= "+ sum + " , 평점= B0");
	    }
	    else if (sum >=70) {
	      if(sum >=75)
		System.out.println("총점= "+ sum + " , 평점= C+");
	      else System.out.println("총점= "+ sum + " , 평점= C0");
	    }
	    else if (sum >=60) {
	      if(sum >=65)
		System.out.println("총점= "+ sum + " , 평점= D+");
	      else System.out.println("총점= "+ sum + " , 평점= D0");
	    }
	    else System.out.println("총점= " + sum + " , 평점= F");
			
	    stdin.close();
	}

}
