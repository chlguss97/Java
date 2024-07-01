import java.util.Scanner;
public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a,b,c= new String();
		
		while(true) {
		 System.out.print("첫번째 입력: ");
		  a = scan.next();
		 if (a.length() == 3) break; 
		 
		 System.out.println();
		 System.out.println("다시입력");
		}
		while(true) {
			System.out.print("두번째 입력: ");
			b= scan.next();
			if (b.length() == 4 ) break;
			if (b.length() == 3 ) break;
			System.out.println();
			System.out.println("다시입력");
		}
		while(true) {
			System.out.print("세번째 입력: ");
			c= scan.next();
			if (c.length() == 4 ) break;
			
			System.out.println();
			System.out.println("다시입력");
		
		}
		
		System.out.println("입력받은 전화번호는  "+a +"-"+ b+"-" +"-"+ c+"입니다" );
		
	}
		
}		
		
		
	
	
	
	
	


