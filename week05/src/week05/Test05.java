package week05;

import java.util.Scanner;
public class Test05 {

	public static void main(String[] args) {
		String s;
	    Scanner stdIn = new Scanner(System.in);
	    char a;
			
	    System.out.print("하나의 문자를 입력하시오 : ");
	    s = stdIn.next();
	    a = s.charAt(0); // 문자열에서 첫 번째 문자를 추출
			
	    System.out.println("입력한 문자는 : " + a + " ("+ (int)a + ")"); // 입력된 문자 출력
			
	    stdIn.close();
	}

}
