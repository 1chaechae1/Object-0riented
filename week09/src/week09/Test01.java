package week09;

public class Test01 {

	public static void main(String[] args) {

		Movie s1 = new Movie();
		
		s1.setTitle("기생충");
		s1.setDirector("봉준호");
		s1.setActor("송강호");
		s1.setYear(2019);
		
		System.out.println("영화이름은 "+ s1.getTitle());
		System.out.println("감독은 "+ s1.getDirector());
		System.out.println("주인공은 "+ s1.getActor());
		System.out.println("제작년도는 "+ s1.getYear() + "년");
		System.out.println("");
		
		s1.setTitle("라라랜드");
		s1.setDirector("데이미언");
		s1.setActor("라이언");
		s1.setYear(2016);
		
		System.out.println("영화이름은 "+ s1.getTitle());
		System.out.println("감독은 "+ s1.getDirector());
		System.out.println("주인공은 "+ s1.getActor());
		System.out.println("제작년도는 "+ s1.getYear() + "년");
		System.out.println("");
		
		s1.setTitle("어벤져스");
		s1.setDirector("조스 웨던");
		s1.setActor("로버트 다우니");
		s1.setYear(2012);
		
		System.out.println("영화이름은 "+ s1.getTitle());
		System.out.println("감독은 "+ s1.getDirector());
		System.out.println("주인공은 "+ s1.getActor());
		System.out.println("제작년도는 "+ s1.getYear() + "년");
		System.out.println("");
		
	}

}
