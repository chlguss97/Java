
public class First {
	//접근제한자 적용 멤버변수
	private int a;
	
	//멤버변수값을 출력하는 기능메소드
	public void showFirst() {
		System.out.println("a:" +a);
	
	}
	
	
	//생성자 메소드 
	public First() {
		System.out.println("First객체 생성!");
		
		}
	
	//생성자 메소드 오버로딩 overloading
	public First(int a) {
		this.a=a;
		System.out.println("First갹체 생성!~ int");
	}
}
