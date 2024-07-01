import java.util.Scanner;


public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("입력받은 3개 정수의 num1*num2+num3 연산입니다.");
		int n1, n2, n3;
		
		System.out.print("num1: ");
		n1=scan.nextInt();
		
		System.out.print("num2: ");
		n2=scan.nextInt();
		
		System.out.print("num3: ");
		n3=scan.nextInt();
		
		int result= n1*n2+n3;
		
		System.out.println();
		System.out.println(n1 + "*" + n2 + "+" + n3 + "=" + result);
		
		
	}

}
