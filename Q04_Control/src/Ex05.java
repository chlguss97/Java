import java.util.Scanner;
public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		 int c, a; 
		 double avg;
	     int sum = 0;
		 System.out.print("개수: ");
			c= scan.nextInt();	
		 
		for(int i=0; i<c; i++ ) {
			System.out.print("정수: ");
			a= scan.nextInt();
			
			sum=sum+a;
		}	
		   	avg=(double)sum/c;
		
			System.out.println("평균: " + avg);
		
	}
}	