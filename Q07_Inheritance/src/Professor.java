
public class Professor extends Person {
	
	private String subject="";
	
	public Professor() {
		
	}
	
	
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject=subject;
		
	}

	
	public void show() {
		super.show();
		System.out.println("subject:" + subject);
		
		
	}
	
	
}
