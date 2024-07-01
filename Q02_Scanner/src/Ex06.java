import java.util.Scanner;
		
public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int a, b, c ;
		
		System.out.print("num1:");
		a= scan.nextInt();
		System.out.print("num2:");
		b= scan.nextInt();
		System.out.print("num3:");
		c= scan.nextInt();
		
		int result= (a-b)*(b+c)*(c-a);
		
		System.out.println();
		System.out.println("(" + a +"-" +b+ ")" + "*"+ "("+ b+ "+" + c+ ")" +"*"+"("+ c+"-"+a+")= " + result);
		
	
	}
	
	

}
