
public class Main {

	public static void main(String[] arg) {
		
		//Generic[제네릭] - 아직 명칭이 정해지지 않은...
		//class를 설계할때 멤버의 자료형을 결정하지 않고.. 사용(new) 할때 결정하도록 하는 문법
		
		//제네릭클래스를 객체로 생성해보기 - new 하면서 멤버의 자료형을 지정해줘야 함
		Box<String> box= new Box<String>();
		box.a="Hello";
		System.out.println(box.a);
		
		//제네릭<>안에 넣을 수 있는 자료형은 오직 참조형만 가능함. 즉, 기본형primitive는 사용이 불가
		//기본형 타입을 --> 참조형으로 감싸서 변경해주는 클래스가 존재함. (Integer. Double,Float,Boolean ..8개) 이런 클래스들을 Wrapper class라고 부름.
		Integer a= new Integer(10);
		System.out.println(a.toString());
		
		int n=10;
		Integer a2=n; // 자동 new Integer()로 감싸줌.. 이를 auto boxing 이라고 부름.
		System.out.println(a2);
		
		
		int nn=a2; //자동으로 Integer 객체의 값을 int형으로 변환하여 대입해줌 auto unboxing 이라고 부름
		
		
		//Box<int> box2; //제네릭에 기본형은 지정할 수 없음
		Box<Integer> box2= new Box<Integer>();
		//box2.a= new Integer(100); 
		box2.a=100; // auto boxing -- 자동 new Integer()	
		System.out.println(box.a);
		
		
		Box<Double> box3= new Box<Double>();
		box3.a=3.14;
		System.out.println(box3.a);
		
		box3.satA(5.55);
		System.out.println(box3.getA());
		
		
		//제네릭 타입이 2개 이상일수도 있음
		Box2<Integer, String> b= new Box2<Integer, String>();
		b.a=1000;
		b.b="Nice";
		System.out.println(b.a);
		System.out.println(b.b);
		
	}
	
}
