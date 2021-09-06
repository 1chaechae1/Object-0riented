package week11;

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

public class TVTest {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2019, 50);
		myTV.show();
		myTV = new TV("삼성", 2018, 55);
		myTV.show();
	}

}
