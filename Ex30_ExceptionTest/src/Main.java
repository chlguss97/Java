import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
		
	
	public static void main(String[] args) {
				
		//1. Error (오류) :  실행불가!
		//2. Exception (예외) : 실행 중 (run time) 문제가 발생
		
		System.out.println("예외처리에 대해 알아봅니다.");
		
		//예외가 발생하는 상황
		//int k=0;
		//System.out.println( 10/k );
		
		//예외가 발생하면 발생한 지점 아래에 있는 코드는 모두 실행이 안됨.
		//즉, 실제 앱이었다면 앱이 다운됨(꺼짐)
		//그래서 예외가 발생하더라도 앱이 다운되지 않도록 하는 문법적 보완기법
		//예외처리
		
		//여러종류의 예외발생 상황이 있기에 ... 자주 발생하는 예외들을 알아보기
		//1) 0나눗셈
		int a= 0;
		
		try {
			System.out.println( 10/a); //예외가 발생할 여지가 있는 코드
		}catch(ArithmeticException e) {			
			//예외가 발생하면 실행되는 영역
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		//2) 배열의 인덱스 번호 사용 실수..
		int[] aaa= new int[5];
		
		try {
			for(int i=0; i<6; i++) {
				System.out.println(aaa[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		//3) null 참조변수로 객체의 메소드 사용을 시도..
		String s= null;
		
		try {
			System.out.println( s.length() );
		}catch(NullPointerException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		
		//4) 잘못된 데이터 타입을 입력
		Scanner scan= new Scanner(System.in);
		
//		try {
//			int n= scan.nextInt();
//			System.out.println("n: " + n);
//		}catch(InputMismatchException e) {
//			System.out.println("정수만 입력해!!");
//		}
		
		
		//5) 숫자로 바꿀 수 없는 데이터를 숫자로 바꾸고자 할때
//		String str= scan.next(); //문자열 입력받기
//		
//		try {
//			int num= Integer.parseInt(str);  //문자열을 정수로 변환
//			System.out.println( num + 3 );
//		}catch(NumberFormatException e) {
//			System.out.println("정수가 아닌 값 입력!!");
//		}
		
		
		//## 정리! 예외처리는 프로그램이 다운되지 않도록 하는 문법 ##
		
		
		//예외가 한번에 2가지 이상 발생하는 경우도 있음.
		//예) 두 수를 입력받아 나눗셈을 하는 프로그램
		int c, d;
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
			
			//중첩 예외처리 - 이 방식은 코드가 좀 지저분함.
//			try {
//				System.out.println( c/d );
//			}catch(ArithmeticException e) {
//				System.out.println("0나눗셈 예외발생");
//			}
			
//			System.out.println( c/d );
//			
//		}catch(InputMismatchException e) {
//			System.out.println("정수가 아닌값을 입력!");
//		}catch(ArithmeticException e) {
//			System.out.println("0나눗셈 예외발생");
//		}
		
		//다중 catch문을 몇개든 추가할 수 있음..
		//단, 너무 많으면 그 것도 약간 짜증
		//예외마다 대응한 내용이 같다면.. 굳이 다중 catch 보다는
		//예외객체를 업캐스팅으로 한방에 참조하기
		
		
		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			System.out.println(c/d );
		}catch(Exception e) {
			System.out.println("예외발생!!");
		}
		
		
		//예외 발생 여부와 상관없이 무조건 실행되는 영역
		int x= 5;
		try {
			System.out.println(10/x);
			System.out.println("계산 성공");
		}catch(ArithmeticException e) {
			System.out.println("계산 실패");
		}finally {
			//여기는 예외발생여부와 상관없이 무조건 실행되는 영역
			System.out.println("계산작업 종료!!");
		}
		
		// finally 영역이 있다면 catch문을 생략할 수 있음.
		try {
			
		}finally {
			
		}
		
		
		//Exception은 크게 2가지 종류로 구분됨
		//1. UnChecked Exception : 예외처리를 선택 구현 - 위 5가지 상황
		//2. Checked Exception   : 예외처리를 안하면 문법적 에러!!
		
		// Checked Exceptiom 대표적인 것들
		
		// Network 작업
		
		try {
			//URL url= new URL("http://www.naver.com");
			URL url= new URL("www.naver.com");
			
			System.out.println("접속 성공!!");
		} catch (MalformedURLException e) {
			System.out.println("서버주소가 이상합니다");
		}
		
		
		
			
		
		
		System.out.println();
		System.out.println("main 종료");		
	}

}
