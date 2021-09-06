package week06;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		int n;
		int f0=0, f1=1, f2;
		Scanner s = new Scanner(System.in);
		System.out.println("출력할 숫자 개수");
		n = s.nextInt();
		System.out.print("0 1");
		for(int i=0; i<n-2; i++) {
			f2=f1+f0;
			System.out.print(f2+" ");
			f0=f1;
			f1=f2;
		}
		s.close();
	}
}