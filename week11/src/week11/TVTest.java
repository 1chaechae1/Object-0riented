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
		System.out.println(this.brand+"���� ���� "+this.year+"���� "+this.size+"��ġ TV");
	}
}

public class TVTest {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2019, 50);
		myTV.show();
		myTV = new TV("�Ｚ", 2018, 55);
		myTV.show();
	}

}
