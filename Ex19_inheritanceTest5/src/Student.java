
public class Student extends Person {
	
	//이미 name, age를 보유한 상태
	
	private String major; //전공
	
	public Student() {
		super();
		major="";
		
		
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
		
	}
	
	//상속받은 기능 show()는 이름,나이만 출력함. 이를 개선
	//override
	public void show() {
		super.show();
		System.out.println("major:"+ major);
		
		
	}
	
	
}
