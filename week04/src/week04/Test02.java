package week04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##"); // �Ҽ��� Ư�� �ڸ��������� ǥ��
		
		System.out.print("���� ������ �Է� : ");
		double radius = input.nextDouble();
		
		// ���� ����
		double volume = 4/3d*radius*radius*radius; 
		System.out.println("���Ǵ� : " + form.format(volume) + " �Դϴ�.");
		
		input.close();
	}

}
