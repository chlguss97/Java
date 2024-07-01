import java.util.Scanner;
public class Ex03 {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
			int a, sum=0;
		
			while(true) 
				{System.out.print("입력값: ");
				a=scan.nextInt();
			
			
			if(a==0) break;
			
			sum=sum+a; }			
			
			System.out.println();
			System.out.println("누적합계: "+ sum);	
		
		
		
		
		
	}
}
