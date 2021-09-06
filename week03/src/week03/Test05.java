package week03;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		int price, money, added_tax, change;
		
		Scanner input = new Scanner(System.in);
		System.out.print("상품 가격 : ");
		price = input.nextInt();
		System.out.print("받은 금액 : ");
		money = input.nextInt();
		
		added_tax = (int)(price*0.1);
		change = money - price;
		
		System.out.println("");
		System.out.println("받은 금액 : " + money + "원");
		System.out.println("상품 총액 : " + price + "원");
		System.out.println("부가세 : " + added_tax + "원");
		System.out.println("잔 돈 : " + change + "원");
		
		input.close();

	}

}
