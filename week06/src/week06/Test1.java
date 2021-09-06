package week06;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = true;
		int count =0;
		while(flag) {
			
			if(++count>=10)
				flag = false;
			System.out.println(count+"Testing");
			
		}
	}

}
