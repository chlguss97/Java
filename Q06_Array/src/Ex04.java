import java.util.Scanner;

public class Ex04 {
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("입력값: " );
		int n= scan.nextInt();
		String[] str = new String[n];
		
		for(int i=0; i<str.length; i++) {
			System.out.println("문자열");
			str[i]= scan.next();
			
			
		}
		for(int i=0; i<str.length; i++) {
			
			System.out.println(str[i]);}
		
		
	}
}
