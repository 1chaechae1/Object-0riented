package week13;

class Point1 {
	 private int x, y;
	 Point1() {
		 this.x = this.y = 0;
	 }
	 Point1(int x, int y) {
		 this.x = x; this.y = y;
	 }
	 public void showPoint() {
		 System.out.println("("+x+","+y+")");
	 }
}

class ColorPoint1 extends Point1 {
	private String color;	//점의 색
	ColorPoint1(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEX1 {
	public static void main(String[] args) {
		Point1 p = new Point1(1,2); // Point 객체 생성
		p.showPoint();

		ColorPoint1 cp = new ColorPoint1(3,4,"red"); // ColorPoint 객체 
		cp.showColorPoint(); // 컬러와 좌표 출력

	}
}
