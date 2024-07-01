import java.util.Scanner;
public class Ex06 {
	
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
//		int a;
//		int b;
//		System.out.print("input: ");
//		a= scan.nextInt();
//		
//		b= a>0 ? a : -a;
//		
//		System.out.println("출력값:"+ b);
		int a;
		System.out.print("출력값: ");
		a= scan.nextInt();
		
		if (a>0) {
			System.out.println(a);
		}else {
			System.out.println(-a);
			}
		
		
	}

}
