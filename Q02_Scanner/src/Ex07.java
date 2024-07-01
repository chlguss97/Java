import java.util.Scanner;


public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		double a;
	
		System.out.println("마일을 키로수로 변환");
		System.out.print("마일을 입력하시오:");
		a= scan.nextDouble();
		
		System.out.println();
		System.out.println(a+ "마일은 "+a*1.609 + "킬로미터입니다.");
	}

}
