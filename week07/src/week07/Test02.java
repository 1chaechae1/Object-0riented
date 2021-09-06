package week07;

import java.util.Random;
public class Test02 {

	public static void main(String[] args) {
		Random ran = new Random();
		int array[][] = new int[4][4];
		int temp = 0;
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<4; j++) {
				array[i][j]=ran.nextInt(10);
				System.out.print(array[i][j]+" ");
				sum+=array[i][j];
			}
			System.out.println(" "+sum);
		}
		for(int k=0; k<4; k++) {
			int sum=0;
			for(int h=0; h<3;h++) {
				sum+=array[h][k];
				temp+=array[h][k];
			}
			System.out.print(sum+" ");
		}
		System.out.print("   "+temp);
	}

}
