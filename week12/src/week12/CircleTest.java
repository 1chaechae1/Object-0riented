package week12;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("3���� ���� ��ǥ�� �������� �Է��Ͻÿ�.");
	    Circle c [] = new Circle [3];
	    for(int i=0; i<c.length; i++) {
	      System.out.print(i+1 +"��° : x��ǥ, y��ǥ, ������ >> ");
	      double x = scanner.nextDouble();
	      double y = scanner.nextDouble();	 
	      int radius = scanner.nextInt();
	      c[i] = new Circle(x,y,radius);
	    }
	    for(int i=0; i<c.length; i++) c[i].show();
	    scanner.close();
	}
}
