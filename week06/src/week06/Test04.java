package week06;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int max = 99;
		int min=0;
		Scanner stdin = new Scanner(System.in);
		int j = (int)(Math.random()*100);
		System.out.println("컴퓨터가 수를 정했습니다. 시작합니다");
		System.out.println("0-99 사이의 값을 입력하세요.");
		int i=1;
		while(true) {
			System.out.print(i + " >> ");
			int num=stdin.nextInt();
			if(num>j) {
				max=num-1;
				System.out.println("더 낮은 값을 입력하세요.");
				System.out.println("");
				System.out.println(min+"-"+max+"사이의 값을 입력하세요.");
			} else if(num<j) {
				min=num+1;
				System.out.println("더 높게 정하시죠.");
				System.out.println("");
				System.out.println(min+"-"+max+"사이의 값을 입력하세요.");
			} else {
				System.out.println(i+"번 만에 숫자"+j+"를 맞추었습니다!!!");
				break;
			}
			i++;
		}
		stdin.close();
	}
}