package week07;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str[][] = {{"����","�б�", "���", "�ູ", "�ڹ�"},{"pencil","school","love","happy","java"}};
		System.out.println("�ܾ� ���� ���α׷�");
		aa:while(true) {
			int count=0;
			System.out.print("�ܾ �Է��ϼ��� >> ");
			String strr=input.next();
			for(int i=0;i<2;i++) {
				for(int j=0; j<5;j++) {
					if(strr.equals(str[i][j])) {
						System.out.println(str[(i+1)%2][j]);
						count++;
					}
					else if(strr.equals("exit"))
						break aa;
				}
			}
			if(count==0)
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ��� !!!");
		}
		input.close();
	}

}
