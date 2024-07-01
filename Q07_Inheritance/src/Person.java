
public class Person {

	private String name;
	private int age;
	
	
	Person() {
		name="";
		age=0;
	}
	
	
	Person(String name, int age) {
		this.name=name;
		this.age=age;
		
		
	}
		
	public void show() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		
		
	}
	
	
	
	
}
