
public class AlbaStudent extends Student{
	
	private String task="";
	
	public AlbaStudent() {
		
				
	}

	public AlbaStudent(String name, int age, String major, String task) {
		
		super(name, age, major);
		this.task= task;
		
		
		
	}
	
	
	@Override
	public void show() {
			super.show();
			System.out.println("task:"+ task);
	
	
	}
	
	
	
}
