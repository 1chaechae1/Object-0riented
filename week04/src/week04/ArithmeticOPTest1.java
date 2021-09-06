package week04;

public class ArithmeticOPTest1 {

	public static void main(String[] args) {
		int a=5, b=2;
		int sum=a+b;
		System.out.println("a+b=" + sum);
		int sub=a-b;
		System.out.println("a-b=" + sub);
		int mul=a*b;
		System.out.println("a*b=" + mul);
		int div=a/b;
		System.out.println("a/b=" + div);
		int mod=a%b;
		System.out.println("a%b=" + mod);
		int c = ++a; //int c = ++5; 형태는 사용 불가
		System.out.println("c의 전위 증가 연산(prefix)="+c);
		System.out.println("a의 변수의 값 : "+a);
		int d = b++;
		System.out.println("d의 후위 증가 연산(postfix)="+d);
		System.out.println("b의 변수의 값 : "+b);

	}

}
