package week09;

public class PlusMinus {
	int plus, minus;	// 2개의 속성
	public String plus(int x, int y) {	// plus기능
		plus = x + y;
		return "두 수의 합은 " + plus;
	}
	public String minus(int x, int y) {	// minus 기능
		minus = x - y;
		return "두 수의 차는 " + minus;
	}
	
}
