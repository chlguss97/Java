package aaa;

public interface Simple {

	//추상메소드 : 이름만 있고 내용이 없는 메소드 - 오버라이드용
	abstract void show(); //자동 public 접근제한으로 적용됨.
	
	//인터페이스도 멤버변수를 만들 수는 있음. 단, public static final 만 가능함.
	public static final int NUM=10;
	int age=20; //자동으로 public static final 키워드 적용됨
	
	//인터페이스안에서는 추상메소드만 가질 수 있음. 다시말해. 일반메소드는 가질 수 없음
	void output(); //public abstract
	
	//자바 8버전부터 static 메소드도 가질 수 있게 됨
	static void ccc() {
		System.out.println("Simple 인터페이스의 static 메소드");
	}
	default void ddd() {
		System.out.println("인터페이스안에 기본 기능메소드 설계를 허용함");
	}

	//인터페이스안에도 이너클래스를 만들 수 있음, 단, 자동으로 public static임.
		class Good{
			void show() {
				System.out.println("Good show..");


			}

	}
}