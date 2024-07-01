import java.util.Scanner;
public class Ex03 {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	int a ,b ,c ;
	
	System.out.println("3개의 정수의 합, 평균, 최대값, 최소값 ");
	
	System.out.print("입력값1: ");
	a= scan.nextInt();
	
	
	System.out.print("입력값2: ");
	b= scan.nextInt();
	
	
	System.out.print("입력값3: ");
	c= scan.nextInt();
	int sum;
	double avg;
	sum= a+b+c;
	
//	int total, a; 

//	//total= 0;
//	System.out.println("total: ");
//	a = scan.nextInt();
//	total= total+a;
	
//	//total= 0;
//	System.out.println("total: ");
//	a = scan.nextInt();
//	total= total+a;
	
//	//total= 0;
//	System.out.println("total: ");
//	a = scan.nextInt();
//	total= total+a;
	
	avg= (double)(a+b+c)/3;
			
	System.out.println();
	System.out.println("총합: " + sum);
	System.out.println("평균: " + avg);
	
	if ((a>b) && (a>c)) {System.out.println("최대값: " +a);}
	else if (b>c) {System.out.println("최대값: "+ b);}
	else {System.out.println("최대값: " + c);}
	
	
	
	

	}

}