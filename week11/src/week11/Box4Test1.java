package week11;
class  Box4{
	int width;
	int height;
	int depth;
	public Box4(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
}
public class Box4Test1 {
	public static void main(String[] args) {
		Box4 mybox1 = new Box4(10, 20, 30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피 : " + vol);
		
		// 아래와 같이 객체 생성시 묵시적 생성자 호출 ----> 실행X
		/*Box4 mybox1 = new Box4();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
    	System.out.println("박스의 부피 : " + vol);*/
	}
}