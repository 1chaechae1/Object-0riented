package week06;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("하나의 문자를 입력하시오 : ");
		String s = stdin.next();
		char a = s.charAt(0);
		if((int)'a'<=a&&a<=(int)'z') {
			for(char j =(int)'a'; j<=a; j++) {
				for(int i = (int)'a'; i<=j; i++) {
					System.out.print((char)i+" ");
				}
			System.out.println();
			}
		}
		stdin.close();
	}
}