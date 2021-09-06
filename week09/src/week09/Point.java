package week09;

public class Point {
	private int x;
	private int y;
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		System.out.printf("현재 좌표는 %d, %d이다.", x,y);
	}
}
