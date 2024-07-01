
public class Person {

	//멤버변수 private을 권장
	private String name; //기본값 부여 : null
	private int age;     //기본값 부여: 0
	
	//멤버변수에 값을 대입해주는 기능 메소드 - public을 권장
	public void setMembers(String name, int age) {
		//매개변수로 전잘된 값을 멤버변수에 대입해주기
		this.name = name;
		this.age = age;
		
	}
	
	//멤버변수의 값을 출력해주는 기능 메소드
	public void show() {
		System.out.println("name:" + name);
		System.out.println("age:" +age);
		System.out.println();
	}
	
	//객체가 생성될때 자동으로 호출되는 특별한 메소드를 이용하여 멤버변수 값을 대입하기
	Person(String name, int age) {
		this.name= name;
		this.age= age;
		
		System.out.println("Person 객체 생성 String int ");
		
		
		
	}
	
	//생성자 메소드 오버로딩을 통해 매개변수전달 받지 않는 상황을 대응하기
	Person() {
		//this.name="익명";
		//this.age=0;
		//바로 위 파라미터 2개짜리 생성자메소드를 이곳에서 호출하면서 값 전달
		//생성자 안에서 다른 생성자메소드를 호출할 수 있음. this() 생성자 키워드
		this("익명",0);
		
		
		System.out.println("Person 객체 생성");
		
		
	}
	
	Person(String name){
		//this.name=name;
		//this.age=0;
		this(name, 0);
		System.out.println("Person 객체생성 String");
		
	}
	Person(int age){
		//this.name="익명";
		//this.age= age;
		this("익명",age);
		System.out.println("Person 객체생성 int");
		
		
	}
	
	
	
	
	
}
