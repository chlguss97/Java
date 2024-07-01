
public class Main {
	
	public static void main(String[] args) {
		
		//메소드의 4가지 형태 확인해보기
		Test t= new Test(); //객체를 생성
		t.aaa(); //메소드를 호출
		t.bbb(10);
		double n= t.ccc();//메소드의 호출 후 리턴된 값을 받기
		System.out.println("n:" + n);
		
		int n2= t.ddd(5, 3);
		System.out.println("n2:" +n2);
		System.out.println();
		
		//객체 : Data + 기능(method)
		//하지만 기능만 있는 객체도 존재함.
		
		//두수에 대한 사칙연산기능을 가진 객체를 만들어 사용해보기
		int a=10;
		int b=4;
		
		Calculator cal= new Calculator();
		
		int sum= cal.sum(a,b);
		System.out.println(sum);
		
		int sub= cal.subtract(a, b);
		System.out.println(sub);
		
		int mul= cal.multuply(a, b);
		System.out.println(mul);
		
		int div= cal.divide(a, b);
		System.out.println(div);
		System.out.println();
		
		
		
		//사용자가 두 수를 정수가 아닌, 실수를 주고 싶다면?
		System.out.println(cal.sum(3.14,5.55));
	
		
		VariableTest vt= new VariableTest();
		vt.a= 100;
		//vt.k= 200; //error
		
		
		
	}

}
