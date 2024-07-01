public class Main {
	
	public static void main(String[] args) {
		
		//Person 클래스 설계도 대로 객체를 생성하기
		Person p = new Person();
		//객체의 값을 대입해주는 기능 메소드를 이용하여 멤버값을 대입
		p.setMembers("sam", 20);
		//객체의 멤버값을 출력하는 기능 메소드를 호출
		p.show();
		
		//또 다른 객체를 만들때도 편하게 값 대입과 출력이 가능함
		Person p2 = new Person();
		p2.setMembers("robin", 25);
		p2.show();
		
		//이런식으로 객체를 생성한 후에 항상 값을 대입하는 기능 메소드를 
		// 호춣하는 작업이 필요함. 이게 짜증!!
		//객체를 생성하면서 값을 대입하는 기능을 수행했으면...
		//그래서 등장한 문법 : constructor (생성자) method
		// 객체를 생성(new)하면 자동으로 호출되는 아주 특별한 메소드 존재함 - 생성자 메소드
		
		//생성자의 존재를 연습하기 위한 First라는 클래스 만들어보기 
		First f = new First();
		First f2 = new First(10);
		System.out.println();
		
		//Person 클래스에 생성자 메소드를 적용해보기
		Person p3= new Person("hong", 30);
		p.show();
		
		Person p4= new Person();
		p4.show();
		
		Person p5= new Person("park");
		p5.show();
		
		Person p6= new Person(23);
		p6.show();
		
		//생성자메소드도 접근제한자의 영향을 받음.
		//확인을 위해.. aaa패키지를 만들고 그안에 second라는 클래스를 설계해보기
		//aaa.Second s=new aaa.Second(); //error - 기본생성자를 (default) 여서
		aaa.Second s2= new aaa.Second(100); // OK - public 생성자
		
		// 그래서 가급적 생성자도 public으로 만드는 것을 권장함!!!
		
		//결국 생성자의 존재이유!! 멤버변수의 초기화를 위해서임..
		//자바는 객체생성할때 4단계에 걸쳐 초기화를 하고 있음.
		aaa.InitialTest obj= new aaa.InitialTest();
		System.out.println(obj.a);
		
		
		
	}

}