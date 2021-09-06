package week05;

import java.util.Scanner;
public class SimpleIFTest1 {

	public static void main(String[] args) {
		{
            Scanner stdin = new Scanner(System.in);
            System.out.print("한 개의 숫자를 입력 : ");
			
            /*
	    * int count = stdin.nextInt();
	      if (count < 0)
		System.out.println(count + "은(는) 음수입니다 ");
	      else 
		System.out.println(count + "은(는) 양수입니다 ");
	   */
			
	    System.out.println((stdin.nextInt() < 0) ? "은(는) 음수입니다 ":"은(는) 양수입니다 ");
			
	    stdin.close();
		}
	}
}
