
//inner class를 가진 클래스를 outer class라고 부름
public class First {
	
	int a; //멤버변수
	
	void show() {   //메소드
		System.out.println("First show...");
	
		//k=100; //error -- inner의 멤버는 아웃터에서 마음대로 사용불가
		
		int m; //지역변수 - local variable
		m=10;
		
		
		
		//메소드 안에 class를 설계 - local class 라고 부름
		class Nice{
			void show() {
				System.out.println("Nice class... show");
			}
		}
		
		Nice n= new Nice();
		n.show();
		
		//지역클래스의 활용은 이런 모습보다는 추후에 학습할 
		//"익명 클래스"라는 수업에서 다시 소개될 예정임.
		
		
	}//show method

	void out() {
		//m=1000; //다른 지역변수는 인식이 불가능
	
		//Nice n= new Nice(); //error - 다른 지역에서는 지역클래스 사용불가
	
	}
	
	
	
	
	
	
	//이너 클래스를 객체로 생성하여 리턴해주는 기능 메소드
	Hello makeHelloObject() {
		Hello h = new Hello();
		return h;
	}
	
	
	
	//class안에 다른 class를 설계(작성) -- inner class라고 부름
	//이너클래스의 특징
	//1.외부에서 아웃터클래스명이 없으면 인식이 안됨.
	//2.외부에서 아웃터명으로 인식을 했더라도 객체 생성을 불가능
	//3.이너클래스는 오직 아웃터클래스영역 안에서만 만들수 있음.
	//4.이너클래스안에서는 아웃터의 멤버를 내것인양 사용할 수 있음.
	class Hello{
		int k;
		void aaa() {
			System.out.println("Hello show~~");
		a=50; //아웃터의 멤버를 내것인양 
		System.out.println(a);
		
		show(); //아웃터의 메소드도 내것인양.. 호출가능
		
		
		}
		
		
	}
	
}//First class..


//하나의 java안에 또다른 class를 정의할 수 있음.
class Second{
	int a;
	void show() {
		System.out.println("second show...");
	}
	
	
	
}

//하나의 .java파일 안에서 여러개의 class를 사용한다면 그 중 1개만 
//public 접근제한을 적용하고 그 class의 이름으로 . java파일을 만들어야 함.
//그래서 public이 아닌 클래스는 (default)접근제한이 되어
// 같은 패키지에서만 사용이 가능한 클래스로 제한됨