package week12;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String convert(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) 
				return eng[i]; // 발견하고 인덱스 i의 영어 단어 리턴
			if(eng[i].equals(word)) 
				return kor[i]; // 발견하고 인덱스 i의 한글 단어 리턴
		}
		return null; // 발견할 수 없음
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영, 영한 단어 검색 프로그램(종료시 stop입력)");
		while(true) {
			System.out.print("찾을 단어? ");
			String kor = scanner.next();
			if(kor.equals("stop")) {
				System.out.println("프로그램을 종료합니다 !");
				break;
			}
			String eng = Dictionary.convert(kor);
			if(eng == null)
				System.out.println(kor + "는 저의 사전에 없습니다.");
			else {
				System.out.println(kor + "은 " + eng);				
			}
		}
		
		scanner.close();
	}

}
