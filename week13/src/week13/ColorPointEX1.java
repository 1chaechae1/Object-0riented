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
	private String color;	//���� ��
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
		Point1 p = new Point1(1,2); // Point ��ü ����
		p.showPoint();

		ColorPoint1 cp = new ColorPoint1(3,4,"red"); // ColorPoint ��ü 
		cp.showColorPoint(); // �÷��� ��ǥ ���

	}
}
