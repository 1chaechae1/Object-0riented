package week12;
class TV {
	String brand;
	int year;
	int size;
	
	public TV(String b, int y, int s) {
		this.brand = b;
		this.year = y;
		this.size = s;
	}
	public void show() {
		System.out.println(this.brand+"에서 만든 "+this.year+"년형 "+this.size+"인치 TV");
	}
}
public class Test01 {
	public static void main(String[] args) {
		String s1 = args[0];
		int i1 = Integer.parseInt(args[1]);
		int i2 = Integer.parseInt(args[2]);
		
		TV myTV = new TV(s1, i1, i2);
		myTV.show();
		//System.out.println(myTV);

	}

}
