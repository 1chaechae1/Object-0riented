package week04;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ð��� �Է��Ͻÿ�(���� : ��) : ");;
		int time = scanner.nextInt(); 	// �ʴ��� �Է�
		int second = time % 60;			// 60���� ���� �������� ��
		int minute = (time /60) % 60;	// 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) /60;		// 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�

		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� �Դϴ�.");
		
		scanner.close();
	}

}
