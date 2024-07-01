import java.util.Scanner;
public class Ex02 {

	
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		int a;
		
		System.out.print("입력값: ");
		a= scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.print(3*i+" ");
			
		}
		
		
	}
}
