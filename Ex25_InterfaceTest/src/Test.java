
//인터페이스를 정의하는 모습 : 클래스를 정의하는 모습과 흡사함
//interface == abstract class와 비슷한 문법
//인터페이스는 곧바로 객체생성이 불가능함
public interface Test {
	
	//인터페이스는 완전체 추상클래스를 지향함. 즉 멤버로는 추상만 있어야함
	
	//멤버변수 선언 불가능
	//int a;
	//일반 메소드 정의 불가능
//	void aaa() {		
//	}
	
	//즉, 추상메소드만 멤버로 가지는 abstract class라고 생각하면 됨
	abstract void aaa();
	abstract void bbb();

}
