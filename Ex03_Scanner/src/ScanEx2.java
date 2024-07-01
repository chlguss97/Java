import java.util.Scanner;

public class ScanEx2 {
	
	public static void main(String[] args) {
		
		//키보드의 입력값을 원하는 자료형으로 변환해주는 능력을 가진 객체 Scanner 
	  Scanner scan = new Scanner(System.in);
		
//		int a;
//		a= scan.nextInt();
//		System.out.println(a);
	  
//	  double b;
//	  b= scan.nextDouble();
//	  System.out.println(b);
	  
//	  boolean c;
//	  c= scan.nextBoolean();
//	  System.out.println(c);
	  
//	  char d;
	  //d= scan.nextChar(); //한문자 변환은 없음
	  
//	  String s;
//	  s= scan.next(); //문자열 -띄어쓰기 입력 안됨
//	  System.out.println(s);
	  
//	  String s2;
//	  s2= scan.nextLine(); // 문자열 - 띄어쓰기 포함
//	  System.out.println(s2);
	  
//	  int x, y;
//	  x= scan.nextInt();
//	  System.out.println("x:" + x);
//	  
//	  y= scan.nextInt();
//	  System.out.println("y:" + y);
	  
	 //예제1] 사용자로부터 원하는 구구단의 단수를 입력받아 출력해주는 프로그램 
//	  System.out.println("원하는 구구단을 입력하면 출력해 주는 프로그램입니다.");
//	  
//	  System.out.print("단수 입력 : ");
//	  int dan= scan.nextInt();
//	  
//	  System.out.println();
//	  System.out.println(dan + " * " + 1 + " = " + dan*1);
//	  System.out.println(dan + " * " + 2 + " = " + dan*2);
//	  System.out.println(dan + " * " + 3 + " = " + dan*3);
//	  System.out.println(dan + " * " + 4 + " = " + dan*4);
//	  System.out.println(dan + " * " + 5 + " = " + dan*5);
//	  System.out.println(dan + " * " + 6 + " = " + dan*6);
//	  System.out.println(dan + " * " + 7 + " = " + dan*7);
//	  System.out.println(dan + " * " + 8 + " = " + dan*8);
//	  System.out.println(dan + " * " + 9 + " = " + dan*9);
	  
	  //예제2] 사용자로부터 2개의 정수를 입력받아 덧셈한 결과를 출력해주는 프로그램
	  System.out.println("두 정수를 입력하면 덧셈결과를 출력해 줄게요~");
	  
	  int num1, num2;
	  
	  System.out.print("정수 입력 : ");
	  num1= scan.nextInt();
	  
	  System.out.print("정수 입력 : ");
	  num2= scan.nextInt();
	  
	  int result= num1 + num2;
	  
	  System.out.println();
	  System.out.println(num1+" + "+num2+" = " + result);
	  
	}

}
