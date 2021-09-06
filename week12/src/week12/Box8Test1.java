package week12;
class Box8 {
	int width;
	int height;
	int depth;
	public Box8(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	int volume()	// 부피를 구하는 메소드 생성
	{
		int vol = width * height * depth;
		return vol;
	}
}
public class Box8Test1 {
	public static void main(String[] args) {
		Box8 mybox1 = new Box8(10,20,30);
		//mybox1.width = 20;
		int vol1 = mybox1.volume(); // 메소드를 호출해 부피를 구한다.
		System.out.println("정수 박스의 부피: " + vol1);
	}
}