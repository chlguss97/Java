
public class PrintEx {
	
	public static void main(String[] args) {
		//화면출력에 대해 실습해보기..
		
		// 화면출력기능을 가진 녀석을 이용하기..System.out
		System.out.print(10) ;  //정수
		System.out.print('\n');
		
		System.out.print(3.14); // 실수
		System.out.print('\n');
		
		System.out.print('A');  //문자
		System.out.print('\n');
	
		System.out.print("Hello\n");  //문자열
		System.out.print(true);
		
		//줄바꿈 문자를 매번 요청하는 것이 짜증!! .. println()
	    System.out.println(100);
	    System.out.println(5.17);
	    System.out.println('G');
	    System.out.println("Nice    java");
	    System.out.println(false);
	    
	    // 출력 Data를 써야하는 자리에 계산식을 써도 됨. 계산결과가 출력됨
	    System.out.println(10+20);
	    System.out.println(10+20+30);
	    
	    System.out.print(3.14+2.12);
	    System.out.println('A'+'B'); //ASCII코드번호로 한문자를 인식 65+66
	    // System.out.println(true+false);  문법적 에러
	
	    //자바에서 문자열끼리의 덧셈은 산술덧셈이 아니라.. 결합연산임. 즉, 굴자가 붙어버림
	    System.out.println("aaa"+"bbb"); 
	    System.out.println("Hello"+"world");
	    
	    //서로 다른 유형의 Data끼리도 일부 덧셈이 가능함
	    System.out.println(10+3.14);
	    System.out.println(10+'A');
	    //System.out.println(10+true); error
	    
	    System.out.println("aaa"+10); //문자열+숫자.. 자바에서 자동으로 숫자를 문자로 바꿈
	    System.out.println(10+"aaa");
	    
	    System.out.println(10+20+"aaa");
	    System.out.println("aaa"+10+20);
	    
	    System.out.println(10+" + "+ 20 + " = " + (10+20));
	    
	    System.out.println();
	    
	    //2단 구구단을 보여주는 프로그램 만들기..
	    System.out.println("2단 구구단을 출력하는 프로그램 입니다.");
	    System.out.println();
	    
	    System.out.println("2 * 1 = " + 2*1);
	    System.out.println("2 * 2 = " + 2*2);
	    System.out.println("2 * 3 = " + 2*3);
	    System.out.println("2 * 4 = " + 2*4);
	    System.out.println("2 * 5 = " + 2*5);
	    
	    System.out.println(2 + " * " + 1 + " = " + 2*1);
	    System.out.println("2 * 2 = " + 2*2);
	    System.out.println("2 * 3 = " + 2*3);
	    System.out.println("2 * 4 = " + 2*4);
	    System.out.println("2 * 5 = " + 2*5);
	    
	    System.out.println("당신의 나이는 (20+1) 살입니다");
	    System.out.println("당신의 나이는"+ (20+1) + "살입니다");
	    
	    // 특정한 형식(포맷)문자열을 만들고 싶을때..를 위한 출력기능 : printf()
	    System.out.printf(" %03d * %03d = %03d\n ", 10,20,10*20);
	    System.out.printf(" %03d * %03d = %04d\n ", 10,220,10*220);
	    
	    System.out.printf("%d \n", 10);
	    System.out.printf("%o \n", 10);
	    System.out.printf("%x \n", 10);
	    
	    System.out.printf("%f \n", 3.14);
	    System.out.printf("%c \n", 'A');
	    System.out.printf("%s \n", "Hello");
	    
	    
	    System.out.println('A'+1);
}
	
}
