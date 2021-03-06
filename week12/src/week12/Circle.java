package week12;

class Circle {
	  private double x, y;	
	  private int radius;
	  static double PI = 3.141592;
		
	  public Circle(double x, double y, int radius) {
	    this.x = x; this.y = y; this.radius = radius;
	  }
	  public void show() {
	    System.out.println("(" + x + "," + y + ")"+ radius);
	  }
	public double getArea() {
		return PI*radius * radius;
	}
}