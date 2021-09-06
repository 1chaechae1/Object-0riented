package week12;

import java.util.Scanner;

public class CircleTest1 {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Circle c [] = new Circle [3];
	    for(int i=0; i<c.length; i++) {
	      System.out.print("x, y, radius >>");
	      double x = scanner.nextDouble();
	      double y = scanner.nextDouble();	 
	      int radius = scanner.nextInt();
	      c[i] = new Circle(x,y,radius);
	    }
	    int biggestIndex=0;
	    for(int i=1; i<c.length; i++) {
	      if(c[biggestIndex].getArea() < c[i].getArea())
	        biggestIndex = i;
	    }
	    System.out.print("가장 면적인 큰 원은 ");
	    c[biggestIndex].show();
	    scanner.close();
	  }
	}