package week03;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		int price, money, added_tax, change;
		
		Scanner input = new Scanner(System.in);
		System.out.print("��ǰ ���� : ");
		price = input.nextInt();
		System.out.print("���� �ݾ� : ");
		money = input.nextInt();
		
		added_tax = (int)(price*0.1);
		change = money - price;
		
		System.out.println("");
		System.out.println("���� �ݾ� : " + money + "��");
		System.out.println("��ǰ �Ѿ� : " + price + "��");
		System.out.println("�ΰ��� : " + added_tax + "��");
		System.out.println("�� �� : " + change + "��");
		
		input.close();

	}

}
