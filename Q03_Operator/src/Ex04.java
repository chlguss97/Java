import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a; 
		double b;
		
		b = 1294.50;
		
		System.out.println("달러 -> 원화");
		
		System.out.print("달러: ");
		a= scan.nextDouble();
		
		System.out.println();
		System.out.println("원화= " +a*b + "원");
		
		
		
		
	}

}
