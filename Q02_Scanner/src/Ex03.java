import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하면 제곱의 값이 출력됩니다");
		
		System.out.print("입력값: ");
		int a;
		a= scan.nextInt();
		
		int result;
		result= a*a;
		
		System.out.println();
		System.out.println("결과값: " + result);
		
		
	}

}
