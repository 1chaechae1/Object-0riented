package week05;

import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    System.out.print("�߰����� ����(�ִ� 30��) ? ");
	    int m = stdin.nextInt();
	    System.out.print("�⸻���� ����(�ִ� 30��) ? ");
	    int f = stdin.nextInt();
	    System.out.print("�⼮ ����(�ִ� 20��) ? ");
	    int a = stdin.nextInt();
	    System.out.print("��Ұ��� ����(�ִ� 20��) ? ");
	    int e = stdin.nextInt();
	    int sum = m + f + a + e;
			
	    if (sum >=90) {
	      if (sum >= 95)
		System.out.println("����= " + sum + " , ����= A+");
	      else System.out.println("����= " + sum + " , ����= A0");
	    }
	    else if (sum >=80) {
	      if(sum >=85)
		System.out.println("����= "+ sum + " , ����= B+");
	      else System.out.println("����= "+ sum + " , ����= B0");
	    }
	    else if (sum >=70) {
	      if(sum >=75)
		System.out.println("����= "+ sum + " , ����= C+");
	      else System.out.println("����= "+ sum + " , ����= C0");
	    }
	    else if (sum >=60) {
	      if(sum >=65)
		System.out.println("����= "+ sum + " , ����= D+");
	      else System.out.println("����= "+ sum + " , ����= D0");
	    }
	    else System.out.println("����= " + sum + " , ����= F");
			
	    stdin.close();
	}

}