package week04;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초를 정수로 입력하세요: ");;
		int time = scanner.nextInt(); 	// 초단위 입력
		int second = time % 60;			// 60으로 나눈 나머지는 초
		int minute = (time /60) % 60;	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 몫
		int hour = (time / 60) /60;		// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간

		System.out.print(time + "초는 ");
		System.out.print(hour + "시간 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 입니다.");
		
		int h = time/3600;
		int m = (time - h*3600)/60;
		int s = (time - h*3600)%60;
		
		System.out.print(time + "초는 ");
		System.out.print(h + "시간 ");
		System.out.print(m + "분 ");
		System.out.print(s + "초 입니다.");
		
		scanner.close();
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("시간을 입력하시오(단위 : 초) : ");
		int s = input.nextInt();
		
		int hour = s/3600;
		int min = s%3600/60;
		int sec = s%3600%60;
		
		System.out.printf(s + " 초는 %d 시간 %d 분 %d 초 입니다.", hour,min,sec);
		
		input.close();*/
	}

}
