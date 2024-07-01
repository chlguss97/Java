
public class Professor extends Person {
	
	private String subject=""; //명시적 초기화
	
	public Professor() {
		//super();
		
		
	}
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject=subject;
	}
	
	
	
	@Override
	public void show() {
		super.show();
		System.out.println("subject:" + subject);
	}
	
	

}
