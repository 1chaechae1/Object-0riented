package week09;

public class Test01 {

	public static void main(String[] args) {

		Movie s1 = new Movie();
		
		s1.setTitle("�����");
		s1.setDirector("����ȣ");
		s1.setActor("�۰�ȣ");
		s1.setYear(2019);
		
		System.out.println("��ȭ�̸��� "+ s1.getTitle());
		System.out.println("������ "+ s1.getDirector());
		System.out.println("���ΰ��� "+ s1.getActor());
		System.out.println("���۳⵵�� "+ s1.getYear() + "��");
		System.out.println("");
		
		s1.setTitle("��󷣵�");
		s1.setDirector("���̹̾�");
		s1.setActor("���̾�");
		s1.setYear(2016);
		
		System.out.println("��ȭ�̸��� "+ s1.getTitle());
		System.out.println("������ "+ s1.getDirector());
		System.out.println("���ΰ��� "+ s1.getActor());
		System.out.println("���۳⵵�� "+ s1.getYear() + "��");
		System.out.println("");
		
		s1.setTitle("�����");
		s1.setDirector("���� ����");
		s1.setActor("�ι�Ʈ �ٿ��");
		s1.setYear(2012);
		
		System.out.println("��ȭ�̸��� "+ s1.getTitle());
		System.out.println("������ "+ s1.getDirector());
		System.out.println("���ΰ��� "+ s1.getActor());
		System.out.println("���۳⵵�� "+ s1.getYear() + "��");
		System.out.println("");
		
	}

}
