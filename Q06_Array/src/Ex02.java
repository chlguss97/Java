import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("학생수:");
		int n = scan.nextInt();
		int[] aa= new int[n];
		int total=0;
		for(int i=0; i<aa.length; i++) {
			System.out.println("학생"+(i+1)+"의 성적을 입력하세요.");
			aa[i] = scan.nextInt();
			if (aa[i]>100) {i--;
			System.out.println("잘못된 성적입니다. 다시 입력하시오.");}
			total= total + aa[i];	
			}
		System.out.println("성적 평균은:"+ (double)total/aa.length + "입니다");
		
		
		
		}
		
		
		
		
		
		
	}


