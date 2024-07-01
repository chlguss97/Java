
public class First {

	//객체가 생성될 때 한버 자동으로 실행되는 특별한 메소드
	//생성자 메소드
	//만드는 규칙
	//1. 메소드의 이름은 클래스의 이름과 같아야 함.
	//2. 리턴타입을 명시하지 않아야 함.
	 First() {
	System.out.println("First 생성자");
	 }
	
	//생성자도 메소드이기에 오버로딩이 가능함
		First(int n) {
			System.out.println("First int 생성자 " + n);
		}
		
	 
	 
	 
}
