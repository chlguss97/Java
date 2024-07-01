import java.util.Scanner;
public class main4 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++ ) {
			
			if(i==5) {
				break;
						}
			
			System.out.println(i);
		
		
		
		}
	
		System.out.println("종료");
		
		
		Scanner scan = new Scanner(System.in);
		
		int total=0;
		int num;
		while(true) {
			
			System.out.print("input: ");
			num= scan.nextInt();
			if(num==-1) {break;
			
			}
			total = total + num;
		}
		
		System.out.println("입력된 값들의 총합"+ total);
		
	}
}
