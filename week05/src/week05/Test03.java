package week05;

import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	    System.out.println("Ű�� �Է��ϼ���");
	    int height = stdin.nextInt();
	    System.out.println("�����Ը� �Է��ϼ���");
	    int weight = stdin.nextInt();
	    double std_weight=(height-100)*0.9;
			
	    if(weight < std_weight) {
	      System.out.println("��ü���Դϴ�.");
	    }
	    else if (weight > std_weight) {
	      System.out.println("��ü���Դϴ�.");
	    }
	    else System.out.println("ǥ���Դϴ�.");
			
	    stdin.close();
	}

}
