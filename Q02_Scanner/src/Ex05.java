import java.util.Scanner;

		
public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("정수입력:");
		a= scan.nextInt();
		System.out.print("정수입력:");
		b= scan.nextInt();
		
		//나눗셈의 몫
		int quotient= a/b;
		int remainder= a - (b*quotient);
		
		System.out.println();
		System.out.println("나눗셈의 몫:" + quotient);
		System.out.println("나눗셈의 나머지" + remainder);
		
	}

}
