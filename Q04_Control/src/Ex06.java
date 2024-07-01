import java.util.Scanner;
public class Ex06 {
	
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		int i=0, t=0 , n;
		
		while(i<5) {
			System.out.print("정수입력: ");
			n= scan.nextInt();
			
			if(n<1) continue;
			
			t= t+n;
			
			i++;
		
			
	
	
	
			}
		
		System.out.println("총합:" + t);
		
		
		} 
}
		
	
