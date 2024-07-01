import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영단어 입력:" );
		String a = scan.next();

		int n;
		n = a.length();
	
		for(int i=0; i<n; i++) 
		
		System.out.println((char)(a.charAt(i)+1) );
	}
}
