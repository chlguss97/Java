
public class Student extends Person {
	

	private String major="";
	
	
	
	Student() {	
		
	};
	
	Student(String name, int age, String major ) {
		super(name, age);
		this.major=major;
		
	}
	
	public void show() {
		super.show();
		System.out.println("major:" + major);
		
		
	}

}
