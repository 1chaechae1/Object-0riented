package week11;

public class Cylinder {
	double height;
	Circle c1;
	public Cylinder(Circle c , double h) {
		this.height = h;
		this.c1 = c;
	}
	
	public double getVolume() {
		return c1.getArea()*height;
	}

	public static void main(String[] args) {
		Circle s1 = new Circle(2.8);
		Cylinder s2 = new Cylinder(s1, 5.6);
		System.out.println("원통의 체적은 = " + s2.getVolume());	
	}

}

