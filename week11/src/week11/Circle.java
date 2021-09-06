package week11;

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
