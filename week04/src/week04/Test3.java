package week04;

public class Test3 {
//  ArithmeticOPTest1�� ����.
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
		
		int c = ++a; //int c = ++5; ���´� ��� �Ұ�
		System.out.println("c�� ���� ���� ����(prefix)="+c);
		System.out.println("a�� ������ �� : "+a);
		int d = b++;
		System.out.println("d�� ���� ���� ����(postfix)="+d);
		System.out.println("b�� ������ �� : "+b);


	}

}
