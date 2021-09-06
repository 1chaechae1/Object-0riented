package week10;

class Sta{
	int a = 20;
	static int c;
}
public class StaticTest {
	public static void main(String[] args) {
		int a = 10;
		Sta.c = a;
		Sta st = new Sta();
		
		System.out.println((Sta.c)++);
		System.out.println(st.c);
		System.out.println(a);
		System.out.println(st.a);

	}

}
