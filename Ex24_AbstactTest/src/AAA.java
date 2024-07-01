
//추상클래스 Test를 상속받기
public class AAA extends Test{

	//상속받은 일반적인 멤버들은 그래도 보유한 상태임
	
	//constructor method
	public AAA() {
		//super(); //부모생성자를 호출함.
		System.out.println("AAA클래스의 생성자");
	}
	
	
	
	
	//상속받은 추상메소드를 구현(implement) 해야 만 함.
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA aaa()" );
	}
	
	
	
}
