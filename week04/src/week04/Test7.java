package week04;

public class Test7 {
// StringTest1와 같다.
	public static void main(String[] args) {
		String str1 = "아! 대한민국";
		String str2 = "Korea";
		System.out.println(str1 + str2);
		System.out.println("아! 대한민국 \nKorea");
		int a = 1000;
		int b = 2000;
		System.out.println(str1 + a + b + "리 금수강산");
		System.out.println(str1 + (a + b) + "리 금수강산");
		System.out.println(a + b + "리 금수강산");
		System.out.println('3' + "천리 금수강산");
		System.out.println('3' + 2997 + "리 금수강산"); // 문자가 정수와 덧셈으로 연결되면 문자에 해당하는 유니코드 값(3은 51) 정수에 더해진다.
		System.out.println("3의 유니코드 값은 ? " + (int)'3');
		System.out.println((3>5) ^ (2<7));
		System.out.println(8>>2);
		System.out.println(-16>>2);
		int i = 4;
		System.out.println(i++);
	}

}