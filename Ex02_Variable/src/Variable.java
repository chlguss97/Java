
public class Variable {
	
	public static void main(String[] args) { 
		
		//변수에 대해 알아보기
		//변수란 데이터를 저장하는 메모리 공간 [비유. 음식을 담는 그릇]
		// 데이터의 5가지 유형에 따라 적합한 그릇의 종류가 있음. 이를 자료형이라고 부름
		
		// 그래서 변수를 만드는 문법!
		// 자료형 변수이름;
		
		//정수를 저장하는 변수를 만들어주세요.
		int a;
		//변수 a안에 10이라는 정수값을 대입해보기
		a= 10; // = 대입연산자, 오른쪽값을 왼쪽에 넣어주는 연산자 
		//변수 a안에 있는 값을 출력해보기
		System.out.println(a); //변수의 이름을 쓰면 그 안의 값이 출력됨
		
		//한문자를 저장하는 변수
		char b;
		b= 'G';
		System.out.println(b);
		
		int c;
		c= 20+5;
		System.out.println(c+3);
		
		int d;
		//System.out.println(d); //에러 : 변수 값 대입없이 출력을 시도..
		d=30; //대입
		
		int e=40; //변수 초기화 : 변수를 만들면서 값을 넣는 코드
		System.out.println(e);
		
		int f= d+e;
		System.out.println(f);
		
		boolean n1=true;
		System.out.println(n1);
		
		byte n2= 127;
		System.out.println(n2);
		
		short n3= -32000;
		System.out.println(n3);
		
		int n4= 2100000000;
		System.out.println(n4);
		
		long n5= 25000000000L;
		System.out.println(n5);
		
		float n6= 3.14F;
		System.out.println(n6);
		
		double n7= 3.14;
		System.out.println(n7);
		
		String s= "Hello";
		System.out.println(s);
		
		int num1= 100;
		System.out.println("num1 :"  + num1);
		
		num1= 200;
		System.out.println("num1 : " + num1);
		
		num1 = 300;
		System.out.println("num1 :" + num1);
		
		double num2= 3.14;
		System.out.println("num2 :" + num2);
		
		num2= 5.24;
		System.out.println("num2 : " + num2);
		
		char ch= 'A';
		System.out.println("한문자 :" + ch);
		
		boolean bb= true;
		System.out.println("bb : " + bb);
		
		bb= 5<3;
		System.out.println("bb : " + bb);
		
		
		//int nn=10.5; //error
		double nn= 30;
		//int nnn= true // error
		
		// 대입할때 왼쪽 변수의 크기가 오른족 값보다 크면 대입이 가능함
		//int nnn= 10L; //ERROR
		long nnn= 100;
		
		float nnnn= 10; // int --> float으로 변경되어 대입됨
		System.out.println(nnnn);
		
		//nnnn= 3.14; // double --> float으로 변경되어 대입됨
		
		//nnnn= 3.14; //double --> float에 넣으려 하면 에러..
		nnnn= 10L; //float이 long보다 큼
		
		//nnn- 3.14f; // 무조건 실수가 정수보다 큰값으로 인식함. 그래서 에러
		
		//변수를 여러개 만들때..
		int aa;
		int aaa;
		int aaaa;
		
		int x=6, y, z=10;
		double w, t=3.14, r;
		
	}

}
