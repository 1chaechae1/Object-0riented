package week04;

public class Test3 {
//  ArithmeticOPTest1와 같다.
	public static void main(String[] args) {
		
		int a=5, b=3;
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " % " + b + " = " + mod);
		
		int c = ++a; //int c = ++5; 형태는 사용 불가
		System.out.println("c의 전위 증가 연산(prefix)="+c);
		System.out.println("a의 변수의 값 : "+a);
		int d = b++;
		System.out.println("d의 후위 증가 연산(postfix)="+d);
		System.out.println("b의 변수의 값 : "+b);


	}

}
