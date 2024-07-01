
//추상클래스의 문법적 특징 알아보기
//추상클래스: 곧바로 객체를 생성하지 않고 상속해서 사용하는 클래스
public abstract class Test {

	int a; //일반 인스턴스 변수
	static int v=10; //static 변수 [클래스 변수]
	
	//생성자 메소드도 존재함
	public Test() {
		System.out.println("Test 추상클래스 생성자");
	}
	
	
	//일반 메소드
	void show() {
		System.out.println("Test show..");
	}
	
	//추상 메소드 : 이름만 있고, 내용이 없는 메소드 [상속한 클래스에서 반드시 오버라이드를 해야함]
	abstract void aaa();
	
}
