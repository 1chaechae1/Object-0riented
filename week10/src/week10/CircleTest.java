package week10;
class Circle {
	double radius;
	static double PI = 3.141592;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*radius * radius;
	}
	
	public double getLength() {
		return PI*radius * 2;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.8);
		System.out.println("원의 면적 = " + c1.getArea());
		System.out.println("원의 둘레 = " + c1.getLength());
	}

}
