package week09;

public class Dice {
	private int face;
	void roll() {
		face = (int)(Math.random()*6) +1;
	}
	void check() {
		System.out.println("�ֻ��� �� : " + face);
	}

}
