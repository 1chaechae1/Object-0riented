package week06;

public class Test3 {
// NestedLoopTest2�� ����.
	public static void main(String[] args) {
		int num = 10;
		int i=1;
		while(i <= num)	// ���� ��ȣ 
		{
			/*int k = num;
			
			while(k > i)
			{
				System.out.print(" ");
				k--;
			}*/
			
			int j=1;
			while (j <= i) // ��ǥ�� ����
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}