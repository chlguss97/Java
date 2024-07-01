
public class Main {
	
	public static void main(String[] args) {
		
		
		//class를 설계하는 4가지 위치
		//1) 별도의 .java파일 만들기
		//2) 하나의 .java파일에 여러개의 class를 작성
		//3) 다른 class안에 class를 설계(작성) -inner class
		//4) 메소드(함수)안에서 class를 설계(작성) - local class
		
		
		//1)
		First f= new First();
		f.a=10;
		f.show();
		
		
		//2)
		Second s= new Second();
		s.a=20;
		s.show();
		
		
		//3) 이너클래스는 외부에서 직접 객체 생성이 불가능함.
		//First.Hello h= new First.Hello();
		//아웃터클래스가 이너클래스를 만들 수 있기에..
		//아웃터클래스안에 설계한 이너클래스 객체 생성기능을 요청!!
		First.Hello h= f.makeHelloObject();
		h.aaa();
		
		//이너클래스의 사용이유!!
		//아웃터클래스를 객체로 생성하지 않으면 이너클래스를 객체로 만들 수 없음.
		//이런 문법적 제약을 통해 .. 아웃터객체를 만들어야만 사용할 수 있는
		//객체를 만들어야 할 때... 적용할 수 있음.
	
	//static 이너클래스는 외부에서 직접 new가 가능한 클래스!
		Good.Test t= new Good.Test();
		t.show();
	
	
	}

}
