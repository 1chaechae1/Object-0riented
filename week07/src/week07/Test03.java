package week07;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str[][] = {{"연필","학교", "사랑", "행복", "자바"},{"pencil","school","love","happy","java"}};
		System.out.println("단어 사전 프로그램");
		aa:while(true) {
			int count=0;
			System.out.print("단어를 입력하세요 >> ");
			String strr=input.next();
			for(int i=0;i<2;i++) {
				for(int j=0; j<5;j++) {
					if(strr.equals(str[i][j])) {
						System.out.println(str[(i+1)%2][j]);
						count++;
					}
					else if(strr.equals("exit"))
						break aa;
				}
			}
			if(count==0)
				System.out.println("잘못 입력했습니다. 다시 입력해주세요 !!!");
		}
		input.close();
	}

}
