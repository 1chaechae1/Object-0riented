package week07;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String str[]= {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �����մϴ�");
		while(true) {
			System.out.print("���� ���� ��!>> ");
			String user = sc.next();
			int n = ran.nextInt(3);
			System.out.println("����� = " + user + " , ��ǻ�� = "+ str[n]);
			if (user.equals("����")) {
				
				if(n==0) System.out.println("���º�");
				if(n==1) System.out.println("��ǻ�� ��");
				if(n==2) System.out.println("����� ��");
			}
			else if(user.equals("����")) {
				
				if(n==0) System.out.println("����� ��");
				if(n==1) System.out.println("���º�");
				if(n==2) System.out.println("��ǻ�� ��");
			}
			else if(user.equals("��")) {
				
				if(n==0) System.out.println("��ǻ�� ��");
				if(n==1) System.out.println("����� ��");
				if(n==2) System.out.println("���º�");
			}
			else if(user.equals("�׸�")) {
				System.out.println("������ ��Ĩ�ϴ�.");
			    break;
			}
			else
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� !!!");		
			}
			sc.close();
	}
}