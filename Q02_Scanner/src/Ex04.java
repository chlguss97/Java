import java.util.Scanner;

public class Ex04 {
	
		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			
			System.out.println("두개의 실수를 입력하면 해당 실수의 사칙연산 값이 나옵니다");
			
			double a, b;
			System.out.print("실수1: ");
			a= scan.nextDouble();
			
			System.out.print("실수2: ");		
			b= scan.nextDouble();
			
			System.out.println();
			System.out.println("값");
			System.out.println("+ : " + (a+b));
			System.out.println("- : " + (a-b));
			System.out.println("* : " + (a*b));
			System.out.println("/ : " + (a/b));
			
		}

}
