package week06;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int max = 99;
		int min=0;
		Scanner stdin = new Scanner(System.in);
		int j = (int)(Math.random()*100);
		System.out.println("��ǻ�Ͱ� ���� ���߽��ϴ�. �����մϴ�");
		System.out.println("0-99 ������ ���� �Է��ϼ���.");
		int i=1;
		while(true) {
			System.out.print(i + " >> ");
			int num=stdin.nextInt();
			if(num>j) {
				max=num-1;
				System.out.println("�� ���� ���� �Է��ϼ���.");
				System.out.println("");
				System.out.println(min+"-"+max+"������ ���� �Է��ϼ���.");
			} else if(num<j) {
				min=num+1;
				System.out.println("�� ���� ���Ͻ���.");
				System.out.println("");
				System.out.println(min+"-"+max+"������ ���� �Է��ϼ���.");
			} else {
				System.out.println(i+"�� ���� ����"+j+"�� ���߾����ϴ�!!!");
				break;
			}
			i++;
		}
		stdin.close();
	}
}