
public class Main {

	public static void main(String[] args) {
		
		//다형성을 알기 위해 먼저 Upcasting, Down casting 용어부터
		
		First f= new First(); // 제대로 된 casting
		Second s= new Second();// 제대로 된 casting
		
		//당연하게 다른 class의 캐스팅은 안되는 것이 정상임.
		//하지만, 만약 상속관계의 클래스라면
		First f2= new Second();  //부모참조변수는 자식 객체를 참조할 수 있음 (why? 자식 객체에는 무조건 부모객체의 맴버를 가지고 있으므로..) -- Upcasting		
		//Second s2= new First(); //자식 참조변수는 부모객체를 참조할 수 없음 (why? 부모객체에는 자식객체의 멤버를 가지고 있지 않으므로..) -- downcastng
		
		
		//부모로 자식을 참조할 수는 있지만..
		//부모의 멤버만 사용할 수 있음
		f2.a=10;
		f2.showFirst();
		//f2.b=20; //error -- 자식고유의 멤버변수
		//f2.showSecond(); // -- 자식고유의 기능메소드
		
		//그럼에도 자식객체의 맴버를 사용하고 싶다면?
		//Second클래스의 참조변수가 새로 필요함.
		Second s3;
		//s3=f2; //주소만 복사하려고 대입연산을 했는데 .. 자식 참조변수가 부모를 참조했다고 오해하고 있음.[즉, f2참조변수가 참조하는 객체가 Second인지 모르는 것임]
		s3=(Second)f2; //즉 Second자료형으로 형변환을 하여 대입해주면 됨. --> Down casting이라고 부름
		s3.b=20;
		
		System.out.println(s3.a);
		System.out.println(s3.b);
	
		//업캐스팅은 되지만.. 그래봐야.. 부모의 기능만 사용가능함...
		//이런 기술을 굳이 왜 사용할까요??
		//이를 알아보기위해 ..First클래스에 show()메소드를 추가해보기
		First f3= new First();
		f3.show();
		
		//Second클래스에서 show()메소드를 오버라이드하면..
		First f4= new Second(); //업캐스팅
		f4.show();//참조변수의 First클래스가 아닌 실제 참조하는  Second 객체의 show()가 발동함.
		System.out.println("=======");
		//이런 특징을 이용하면..
		//부모 참조변수 1개로 여러 객체를 참조하여 기능을 각기 다른 기능을 수행하게 할 수 있음.
		First obj= null;
		
		obj= new First();
		obj.show();
		
		obj= new Second();
		obj.show();
		
		obj= new Test();
		obj.show();
		
		obj=new Third();
		obj.show();
		
		obj.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
