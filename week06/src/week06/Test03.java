package week06;

public class Test03 {

	public static void main(String[] args) {
		System.out.print("2���� 100���� ��� �Ҽ�: ");
		for(int i=2; i<=100; i++) {
			boolean pn = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					pn = false;
					break;
				}
			}
			if(pn==true) System.out.print(i+" ");
		}
	}
}