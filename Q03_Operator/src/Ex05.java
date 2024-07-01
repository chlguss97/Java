import java.util.Scanner;

public class Ex05 {
	
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int t, m, s;
		
		System.out.println("00시 00분 00초를 기준으로 몇 초가 흘렀는지 계산");
		
		System.out.print("시:");
		t= scan.nextInt();
		
		System.out.print("분:");
		m= scan.nextInt();
		
		System.out.print("초:");
		s= scan.nextInt();
		
		int result = 3600*t + 60*m + s;
		
		System.out.println("결과값=" + result);
	
	
	
	}
	
}
