package week09;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		s1.setAge(20);
		s1.setName("이순신");
		s1.setSex(true);
		s1.setStudentNumber(20181234);
		
		System.out.println("나이는 "+ s1.getAge());
		System.out.println("이름은 "+ s1.getName());
		
		if(s1.isSex()) {
			System.out.println("남자임 ");
		}
		else {
			System.out.println("여자임 ");
		}
		System.out.println("학번은 "+s1.getStudentNumber());
	}

}
