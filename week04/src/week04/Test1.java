package week04;

public class Test1 {

	public static void main(String[] args) {
		
		/*System.out.println(5&7);
		System.out.println(5|7);
		System.out.println(5^7);
		System.out.println(~5);*/
		
		/*int a=10, b=20;
		System.out.println((5<3)&(a<b++));
		System.out.println(b);
		a=10; b=20;
		System.out.println((5<3)&&(a<b++));
		System.out.println(b);*/
		
		int a=10, b=20;
		System.out.println((5<3)|(a<b++));
		System.out.println(b);
		a=10; b=20;
		System.out.println((5<3)||(a<b++));
		System.out.println(b);
	}

}
