package week10;
class Point {
	int x, y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(0,0);
	}
	
	public void print()
	{
		System.out.println("("+x+", "+y+")");
	}
	
}
