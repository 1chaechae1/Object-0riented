package week12;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("3개의 원의 좌표와 반지름을 입력하시오.");
	    Circle c [] = new Circle [3];
	    for(int i=0; i<c.length; i++) {
	      System.out.print(i+1 +"번째 : x좌표, y좌표, 반지름 >> ");
	      double x = scanner.nextDouble();
	      double y = scanner.nextDouble();	 
	      int radius = scanner.nextInt();
	      c[i] = new Circle(x,y,radius);
	    }
	    for(int i=0; i<c.length; i++) c[i].show();
	    scanner.close();
	}
}
