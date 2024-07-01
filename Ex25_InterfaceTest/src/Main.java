import aaa.Simple;

public class Main {
	
	public static void main(String[] args) {
		
		//인터페이스의 문법적 특징 알아보기
		
		//인터페이스는 직접 new로 객체생성이 불가능
		//Test t= new Test(); //error
		
		
		//인터페이스를 상속하여 추상메소드를 구현하는 클래스를 설계하여
		//이 클래스를 객체로 만들어 사용하는 기법
		
		
		First f= new First();
		f.aaa();
		f.bbb();
		
		
		//Test 인터페이스를 구현한 또다른 Second 클래스가 있다면..
		//aaa(), bbb()메소드가 구현되어 있을 것을 확신할 수 있음
		Second s= new Second();
		s.aaa();
		s.bbb();
	
	
	//Test 인터페이스를 구현하는 것도 사실 상속의 일정이어서..
	//부모-자식의 관계는 형성됨
	Test t; //부모참조변수
	t=new First(); //업 캐스팅
	t.aaa();
	t.bbb();
	
	t= new Second(); //업캐스팅
	t.aaa();
	t.bbb();
	
	t= new Test() {
		public void aaa() {
			System.out.println("익명클래스의 aaa");
		}
		public void bbb() {
			System.out.println("익명클래스의 bbb");
	
		}
					
	};
	
	t.aaa();
	t.bbb();

	
	//클래스는 다중상속이 불가능함.
	//인터페이스는 다중구현이 허용됨
	//AAA,BBB 인터페이스를 구현한 Hello class
	
	//인터페이스를 설계할 때 다른 인터페이스를 상속받을 수 있음.
	//Test 인터페이스를 상속하는 SSS인터페이스
	
	//인터페이스의 멤버는 무조건 public 접근제한임.
	
	System.out.println(Simple.NUM); // static variable
	Simple.ccc(); //static method
	
	
	//원래 inner class를 외부에서 아웃터명.으로 인식해야함.
	//또한 인식하더라도 new로 객체생성이 불가함. 아웃터객체만이 생성할 수 있기에..
	//단, inner class가 static이라면 new가 가능함.
	Simple.Good g=new Simple.Good();
	}
}

