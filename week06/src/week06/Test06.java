package week06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금  | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			int choose = scan.nextInt();
			
			switch(choose) {
			case 1:
				System.out.print("예금액 > ");
				int save = scan.nextInt();
				balance += save;	
				break;
			case 2:
				System.out.print("출금액 > ");
				int withdraw = scan.nextInt();
				balance -= withdraw;
				break;
			case 3:
				System.out.println("현재 잔고는 > " + balance);
				break;
			case 4:
				run=false;
				break;
			}
		}
			System.out.println("종료!");
			scan.close();
		}
	}