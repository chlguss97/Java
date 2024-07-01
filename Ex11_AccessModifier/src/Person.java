
public class Person {

	//멤버변수는 무조건 private
	private String name;
	private int age;
	
	
	//메소드는 무조건 public
	//멤버변수의 값을 대입해주는 기능 메소드 
	public void setMembers(String name, int age) {
		//멤버변수에 매개변수의 값을 대입
		this.name= name;
		this.age= age;
		
		
	}
	
	
	//멤버변수의 값을 출력해주는 기능 메소드
	public void show() {
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		System.out.println();
	}
	
	
	
}
