package week05;

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    System.out.print("�ݾ��� �Է��Ͻÿ� : ");
	    int money = stdin.nextInt();
			
	    if(money>0) {
	      int result = money/50000;
	      int a = money % 50000;
	      System.out.println("������ �� :		" + result + "��");	
				
	      int result2 = a/10000;
	      int b = a % 10000;
	      System.out.println("�ϸ��� �� :		" + result2 + "��");
				
	      int result3 = b/5000;
	      int c = b % 5000;
	      System.out.println("��õ�� �� :		" + result3 + "��");
				
	      int result4 = c/1000;
	      int d = c % 1000;
	      System.out.println("õ�� ��  :		" + result4 + "��");
				
	      int result5 = d/500;
	      int e = d % 500;
	      System.out.println("����� ���� :		" + result5 + "��");
				
	      int result6 = e/100;
	      int f = e % 100;
	      System.out.println("��� ���� :		" + result6 + "��");
				
	      int result7 = f/50;
	      int g = f % 50;
	      System.out.println("���ʿ� ���� :		" + result7 + "��");
				
	      int result8 = g/10;
	      int h = g % 10;
	      System.out.println("�ʿ� ���� :		" + result8 + "��");
				
	      int result9 = h/5;
	      int i = h % 5;
	      System.out.println("���� ���� :		" + result9 + "��");
				
	      int result10 = i/1;
	      System.out.println("�Ͽ� ���� :		" + result10 + "��");
	    }
	    stdin.close();
	}

}
