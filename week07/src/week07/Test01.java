package week07;

public class Test01 {

	public static void main(String[] args) {
		int array[][] = {{78,48,78,98},{99,92,0,0},{29,64,84,0},{34,78,92,56}};
		for(int i=0; i<4; i++) {
			int sum=0;
			double count=0;
			for(int j=0; j<4; j++) {
				if(array[i][j] != 0) {
					System.out.print(array[i][j]+"  ");
					sum+=array[i][j];
					count++;
				}
			}
			System.out.println(sum +"  "+sum/count);
		}

	}

}