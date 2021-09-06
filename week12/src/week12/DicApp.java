package week12;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String convert(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) 
				return eng[i]; // �߰��ϰ� �ε��� i�� ���� �ܾ� ����
			if(eng[i].equals(word)) 
				return kor[i]; // �߰��ϰ� �ε��� i�� �ѱ� �ܾ� ����
		}
		return null; // �߰��� �� ����
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ�, ���� �ܾ� �˻� ���α׷�(����� stop�Է�)");
		while(true) {
			System.out.print("ã�� �ܾ�? ");
			String kor = scanner.next();
			if(kor.equals("stop")) {
				System.out.println("���α׷��� �����մϴ� !");
				break;
			}
			String eng = Dictionary.convert(kor);
			if(eng == null)
				System.out.println(kor + "�� ���� ������ �����ϴ�.");
			else {
				System.out.println(kor + "�� " + eng);				
			}
		}
		
		scanner.close();
	}

}