import java.util.Scanner;
public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("input: " );
		
		String a = scan.next();
		char b=0;
		int n= a.length();
		for(int i=0 ; i<n; i++ ) {
			
		
			if (b < a.charAt(i))
				b= a.charAt(i);
				
			
			
		}System.out.println(b);
		
		 }
		
		
	}


