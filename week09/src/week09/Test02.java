package week09;

public class Test02 {
	public static void main(String[] args) {
		Book s1 = new Book();
		
		s1.setTitle("나미야 잡화점의 기적");
		s1.setAuthor("히가시노 게이고");
		
		System.out.println("제목은 "+ s1.getTitle());
		System.out.println("저자는 "+ s1.getAuthor());
	}

}
