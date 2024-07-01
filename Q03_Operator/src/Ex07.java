import java.util.Scanner;
public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b, c , max;
		
		System.out.print("출력값: ");
		a= scan.nextInt();
		
		System.out.print("출력값: ");
        b= scan.nextInt();
		
		System.out.print("출력값: ");
		c= scan.nextInt();
//		
//		max=(a>b && a>c) ? a :(b>c) ? b:c;
//		
//		System.out.println("출력값:" + max);
		
		
		if (a>b && a>c) {System.out.println(a);
		}else if (b>c) {System.out.println(b);
	}else {System.out.println(c);
		
	}
}
}