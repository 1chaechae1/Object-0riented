package week11;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.8);
		System.out.println("반지름 = "+ c1.radius);
		System.out.println("원의 면적 = " + c1.getArea());
		System.out.println("원의 둘레 = " + c1.getLength());
	}

}
