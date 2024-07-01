import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int[] aa = new int[5];
	int max = 0;
	int small= 0;
	int total=0;
	for(int i=0; i<aa.length; i++ ) {
		System.out.print("입력값: ");
		aa[i]=scan.nextInt();
		max= aa[0];
		small=aa[0];
		if(aa[i] > max ) max= aa[i]; 
		if(aa[i] < small ) small= aa[i];
		
		total= total +aa[i];
		
	}
	System.out.println("최댓값: " + max);
	System.out.println("최소값: " + small);
	System.out.println("총합: " + total);
	
		
		
		
	}
}
