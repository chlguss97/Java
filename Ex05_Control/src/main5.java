import java.util.Scanner;
public class main5 {
		
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		int dan;
		
		do {
			System.out.println("단수입력: ");
			dan= scan.nextInt();
		}while (dan<2 || dan>9); 
		
		for(int i=1; i<10; i++) {
			System.out.println(dan +"*" +i+ "=" +dan*i);
			
		}
		
	}
}
