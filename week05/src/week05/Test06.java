package week05;

import java.util.Scanner;
public class Test06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("문자 입력 : ");
	    String s = input.next();
	    char a = s.charAt(0);
			
	    if (97 <= a&&a <= 122) {
	      char t = (char)(a - ('a' - 'A'));
	      System.out.println("변환 문자= " + t);
	    }
	    else if (65 <= (int)a&&(int)a <= 90) {
	      char j = (char)(a + ('a' - 'A'));
	      System.out.println("변환 문자= " + j);
	    }
	    input.close();
	}
}