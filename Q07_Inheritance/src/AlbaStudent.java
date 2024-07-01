
public class AlbaStudent extends Student {
	
	private String task="";
	
	AlbaStudent() {
		
	}
	
	AlbaStudent(String name, int age, String major, String task) {
		super(name, age, major);
		this.task=task;

		
	}
	
	public void show() {
		super.show();
		System.out.println("task:"+ task);
		
		
	}
	
		
		
}
	
	
	


