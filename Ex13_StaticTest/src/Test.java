
public class Test {
	
	public int a; //멤버변수                   -- 인스턴스 변수라고 부름 - 객체(인스턴스)마다 존재하는 변수라서
	public static int b; //정적(static) 멤버변수 -- 클래스 변수라고 부름 - 클래스에 1개 뿐인 변수라서



	//일반 메소드 -객체가 생성되면 사용이 가능한 메소드
	void aaa() {
	System.out.println("aaa");
	
	a= 100;
	b= 200;
}


	//정적(static) 메소드 - 객체 생성과 상관없이 사용이 가능한 메소드
	static void bbb() {
	System.out.println("bbb");
	
	//a=100; // static 메소드안에서 인스턴스 멤버는 사용불가능
	b=200;
	
	
	}



}


