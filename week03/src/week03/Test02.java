package week03;

public class Test02 {
	public static void main(String[] args) {

		int i = 300000, j = 60, k = 8, m = 300, d = 24, y = 365, x, h;
		x = i * j * k;
		h = x / m / d / y;
		
		System.out.println("�������� �¾� ���� �Ÿ��� " + x +"km�̴�.");
		System.out.println("KTX(" + m + "km/h)�� Ÿ�� �¾���� �ɸ��� �ð��� " + h + "�� �ɸ���.");
		
	}

}