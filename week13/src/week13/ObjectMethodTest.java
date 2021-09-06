package week13;
class Box10 {
	public int width;
	public int height;
	public int depth;
	public Box10(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	public boolean equals(Box10 b) {
		return(this.width == b.width);
	}
}
public class ObjectMethodTest {
	public static void main(String[] args) {
		int a1=10, a2=10;
		Box10 b1 = new Box10(10,200,30);
		Box10 b2 = new Box10(10,20,30);
		Box10 b3 = b2;
		// System.out.println(a1==a2 ? "a1과 a2는 같다" : "a1과 a2는 같지 않다");
		System.out.println(b1.equals(b3) ? "b1과 b2는 같다" : "b1과 b2는 같지 않다");
		System.out.println(b2.equals(b3) ? "b2과 b3는 같다" : "b2과 b3는 같지 않다");
	}
}