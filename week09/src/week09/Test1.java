package week09;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		s1.setAge(20);
		s1.setName("�̼���");
		s1.setSex(true);
		s1.setStudentNumber(20181234);
		
		System.out.println("���̴� "+ s1.getAge());
		System.out.println("�̸��� "+ s1.getName());
		
		if(s1.isSex()) {
			System.out.println("������ ");
		}
		else {
			System.out.println("������ ");
		}
		System.out.println("�й��� "+s1.getStudentNumber());
	}

}
