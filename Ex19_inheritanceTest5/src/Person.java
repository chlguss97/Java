
public class Person {
	
	private String name;
	private int age;
	

	//생성자 메소드 : 객체를 생성(new)할때 한번 자동으로 실행되는 특별한 메소드
	public Person()	{
		name= "no name";
		age=0;
		

	}
	
	//생성자 오버로딩 : 파라미터로 '이름', '나이' 전달받아 멤버변수에 대입
	public Person(String name, int age) {
		this.name=name;
		this.age= age;
	}
	
	public void show() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
	
	
}

