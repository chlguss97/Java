
public class Second extends First {
	
	private int b;
	
	public void show() {
		showFirst(); //부모클래스의 멤버를 출력하는 기능을 호출
		System.out.println("b:" + b);
		System.out.println();
		
		
	}
	
	//생성자 메소드
	public Second() {
		//사실.. 이곳에는 생략된 글씨가 있음.
		//바로 부모클래스 객체를 생성하는 생성자메소드를 호출하는 코드가 숨겨져 있음.
		//super();
		System.out.println("Second 객체 생성!!");
	}

	//생성자 메소드 오버로딩 overloading
	public Second(int a, int b) {
		//this.a=a; //상속받은 private 멤버는 접근 불가능
		//부모클래스객체에게 스스로 값을 대입해주는 기능을 호출
		//별도의 입력 기능메소드를 만드는 것이 아니라..
		//Second 객체를 생성하면 First객체도 생성되고..
		//그렇다면.. First생성자도 호출된다는것임.
		//부모생성자를 호출하면서 a값을 전달하겠음.
		super(a); //작성할때 부모를 가장 먼저 작성!! - 부모가 가장 먼저 생성되기 때문에
		this.b=b;
		
		System.out.println("Second 객체 생성!! ~ int,int");
	}

}
