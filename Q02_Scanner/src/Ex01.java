import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("두 정수를 입력하면 두수의 뺄셈과 곱셈의 결과를 각각 출력해드립니다");
		
		int num1, num2;
		
		System.out.print("정수 입력 : ");
		num1= scan.nextInt();
		
		System.out.print("정수 입력 : ");
		num2= scan.nextInt();
		
		System.out.println();
		int result1= num1-num2;
		System.out.println("두 정수의 뺄셈값 : " + result1);
		
		int result2= num1*num2;
		System.out.println("두 정수의 곱셈값 : " + result2);
		

		
		
		
	}
	
}
