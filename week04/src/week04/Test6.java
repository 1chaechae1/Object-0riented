package week04;

public class Test6 {
// BitOPTest1와 같다.
	public static void main(String[] args) {
		int a = 17;
		int b = 30;
		System.out.println("  a = " +a+"("+Integer.toBinaryString(a)+")");
		System.out.println("  b = " +b+"("+Integer.toBinaryString(b)+")");
		System.out.println("a&b = " +(a&b)+"("+Integer.toBinaryString(a&b)+")");  // &&는 오류다.
		System.out.println("a|b = " +(a|b)+"("+Integer.toBinaryString(a|b)+")");
		System.out.println("a^b = " +(a^b)+"("+Integer.toBinaryString(a^b)+")");
	}

}
