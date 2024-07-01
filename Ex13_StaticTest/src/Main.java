
public class Main {
	
	public static void main(String[] args) {
		
		//static int a; //지역변수에는 static 사용 불가
		
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.a=10;
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);
		
		t1.b=100;
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
	//b=1000; //error
		
		//static 멤버변수는 객체마다 존재하지 않음.
		//Test클래스에 딱 1개만 존재하고 이를 공유함..
		//그래서 이 변수를 사용할 때 특정객체의 참조변수를 사용하기보다는
		//클래스명으로 접근하는 것을 권장함.
		Test.b=200;
		System.out.println(Test.b);
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
	
	//객체지향 프로그래밍에서 객체없이 사용할 수 있는 변수를 만들때.. 사용
		Test.b=300;
	
		//일반 메소드는 객체를 생성해야만 호출할 수 있음.
		t1.aaa();
		
		
		//static 메소드는 객체 참조변수가 아니라, 클래스명으로 접근하여 사용함
		Test.bbb();
		
		//결국 ,static 키워드의 존재이유. 객체 생성 없이 사용하고자 하는 멤버를 만들때 사용함.
	
	
	// 조금더 복잡하게.. static 사용해보기
		AAA.obj.show();
		System.out.println(); // 위와 같은 구조
	
	
	
	
	}
	
	
	
	
	
	
}
	
	