package week12;

public class GradeTest {
	public static void main(String[] args) {
		int math = Integer.parseInt(args[0]);
	    int science = Integer.parseInt(args[1]);
	    int english = Integer.parseInt(args[2]);
		
	    Grade me = new Grade(math, science, english);
	    System.out.println("?????? " + me.average()); 
	  }
	}
