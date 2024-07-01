import java.util.Scanner;
	public class Ex01 {
	
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
	
			int a, b;
			System.out.print("받은 돈: ");
			a= scan.nextInt();
	
			System.out.print("상품 가격: ");
			b= scan.nextInt();
			
			
	
			System.out.println();
			System.out.println("부과세: " +(int)(b*0.1));
			System.out.println("잔돈: " + (a-b));
	
		
	}

}
