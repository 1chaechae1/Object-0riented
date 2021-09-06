package week06;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int sum=0;
		
		label1 : for(int i =1;i<=10;i++) {
			for(int j=10;j<10;j++)
			{
				if(j>2)
					break label1;
				System.out.println(j);
			}
		}*/
			// sum+=i;
		// System.out.println(sum);
		
		int sum=0;
		
		label1: for(int i =1;i<=10;i++) {
			for(int j=1;j<=10;j++)
			{
				if(j%2==0)
					continue label1;
				System.out.println(j);
			}
		}
	}

}
