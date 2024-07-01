import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		int x1, y1, x2, y2;
		
		System.out.println("두점을 이용한 직사각형의 넓이 (x1<x2, y1<y2) ");
		
		System.out.print("x1: ");
		x1 = scan.nextInt();
		
		System.out.print("y1: ");
		y1 = scan.nextInt();
		
		System.out.print("x2: ");
		x2 = scan.nextInt();
		
		System.out.print("y2: ");
		y2 = scan.nextInt();
		
		System.out.println("결과값: "+ (x2-x1)*(y2-y1));
	}

}

