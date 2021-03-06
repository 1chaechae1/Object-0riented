package week10;

class Rectangle {
	  Point p1,p2;

	  public Rectangle(Point p1, Point p2) {
		    super();
		    this.p1 = p1;
		    this.p2 = p2;
		  }
		  public int square() {
		    return (p2.x -p1.x) * (p2.y-p1.y);
		  }
		  public void show() {
		    p1.print();
		    p2.print();
		    System.out.println("넓이는 "+ square());
		  }
		  public boolean equals(Rectangle r) {
		    if(this.square() == r.square()) 
		      return true;
		    else return false;
		  }
		}

	public class RectangleTest {
	  public static void main(String[] args) {
		  Point p1 = new Point(10, 20);
		    Point p2 = new Point(20, 35);
			
		    Rectangle r = new Rectangle(p1, p2);
		    r.show();
		    System.out.println("");
			
		    Point p3 = new Point(15, 20);
		    Point p4 = new Point(24, 35);
		    Rectangle s = new Rectangle(p3, p4);
		    s.show();
		    System.out.println("");
			
		    if(r.equals(s)) 
		      System.out.println("사각형의 면적이 같다!!  ");
		    else 
		      System.out.println("사각형의 면적이 다르다!! ");

		}

	}
