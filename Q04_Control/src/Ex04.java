import java.util.Scanner;
public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, dan;
		System.out.print("입력값: ");
		dan= scan.nextInt();
		
		for(int i=9; i>0; i--) {
			System.out.println(dan+" * " + i + " = " + i*dan);
		}
	}

}
