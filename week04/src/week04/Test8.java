package week04;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ʸ� ������ �Է��ϼ���: ");;
		int time = scanner.nextInt(); 	// �ʴ��� �Է�
		int second = time % 60;			// 60���� ���� �������� ��
		int minute = (time /60) % 60;	// 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) /60;		// 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�

		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� �Դϴ�.");
		
		int h = time/3600;
		int m = (time - h*3600)/60;
		int s = (time - h*3600)%60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(h + "�ð� ");
		System.out.print(m + "�� ");
		System.out.print(s + "�� �Դϴ�.");
		
		scanner.close();
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("�ð��� �Է��Ͻÿ�(���� : ��) : ");
		int s = input.nextInt();
		
		int hour = s/3600;
		int min = s%3600/60;
		int sec = s%3600%60;
		
		System.out.printf(s + " �ʴ� %d �ð� %d �� %d �� �Դϴ�.", hour,min,sec);
		
		input.close();*/
	}

}
