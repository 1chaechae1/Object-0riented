package week05;

import java.util.Scanner;
public class Test05 {

	public static void main(String[] args) {
		String s;
	    Scanner stdIn = new Scanner(System.in);
	    char a;
			
	    System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
	    s = stdIn.next();
	    a = s.charAt(0); // ���ڿ����� ù ��° ���ڸ� ����
			
	    System.out.println("�Է��� ���ڴ� : " + a + " ("+ (int)a + ")"); // �Էµ� ���� ���
			
	    stdIn.close();
	}

}
