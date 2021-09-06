package week06;

public class Test3 {
// NestedLoopTest2와 같다.
	public static void main(String[] args) {
		int num = 10;
		int i=1;
		while(i <= num)	// 줄의 번호 
		{
			/*int k = num;
			
			while(k > i)
			{
				System.out.print(" ");
				k--;
			}*/
			
			int j=1;
			while (j <= i) // 별표의 갯수
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}