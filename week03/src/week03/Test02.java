package week03;

public class Test02 {
	public static void main(String[] args) {

		int i = 300000, j = 60, k = 8, m = 300, d = 24, y = 365, x, h;
		x = i * j * k;
		h = x / m / d / y;
		
		System.out.println("지구에서 태양 까지 거리는 " + x +"km이다.");
		System.out.println("KTX(" + m + "km/h)를 타고 태양까지 걸리는 시간은 " + h + "년 걸린다.");
		
	}

}