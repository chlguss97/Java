
public class Main {
	
	public static void main(String[] args) {
		
		//Animal <- Dog, Cat, Pig
		Animal[] anis= new Animal[5];
		anis[0]= new Dog();
		anis[1]= new Pig();
		anis[2]= new Cat();			
		anis[3]= new Cat();
		anis[4]= new Dog();
		
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
	
		//추상적인 목적의 클래스인 Animal은 객체를 생성할 목적이 아님.
		//그럼에도.. 객체를 생성하려하면..이러면.. 문법적으로 안되도록 막아주고 싶음.
		//추상클래스를 명시적으로 적용하는 abstract class로 설계하면 new로 객체 생성을 할 수 없게 됨
		//Animal ani= new Animal();
		//추상클래스의 문법적 특징알아보기
		//Test t= new Test; //error - 추상클래스는 객체생성이 불가능
	
		//추상클래스는 직접 객체를 바로 만들어 사용하지 않고 
		//상속한 클래스를 객체로 만들어 사용하는 것임.
		AAA obj= new AAA(); //AAA객체를 생성 - 업캐스팅
		obj.show();
		obj.aaa(); 
		BBB obj2= new BBB(); //AAA객체를 생성 - 업캐스팅
		obj2.aaa();
		
		
		Test t= new AAA();
		t.aaa();
		
		Test t2= new BBB();
		t2.aaa();
		
		//Test의 추상메소드를 구현하는 3번째 객체가 필요함
		//새로운 클래스이름을 명명하고.. 별도의 .java파일을 만들고..
		//이런 작업이 참. .짜증.. 번거로움..
		//어차피 이 객체는 이곳에서만 사용하고 더 이상 사용안할 것일때..
		//딱 한번만 객체를 만들기 위한 class를 설계하기 - 이름도 필요없이
		//그래서 등장한 문법 : 이름이 없는 클래스를 설계할 수 있음
		//Anonymous class[익명 클래스]
		//별도의 class 키워드나 extends 없이 객체를 new하면서 곧바로 설계하는 문법
		Test t3= new Test() { //익명 객체를 생성 - 업캐스팅
			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("익명 클래스의 aaa()");
			}
			
		};
		t3.aaa();
		
		
		
		
		
		
		
	}

}
//이 클래스의 목적은 객체 생성이 아니고 상속관계를 만들기 위한 추상적인 클래스
//추상클래스임을 명시적으로 적용하는 키워드: abstract
abstract class Animal {
	
	//내용은 없고. 이름만 있는 메소드를 정의 - why? 자식객체들이 오버라이드하도록.
	//이런 메소드를 추상메소드라고 부름.
	//문법적으로 추상메소드임을 명시적으로 적용하는 키워드 : abstract
	abstract void say();// 추상메소드
	//문법적으로 적용된 추상메소드가 있는 추상클래스를 상속하는 클래스는
	//무조건 이 추상메소드를 오버라이드하여 구현해야만 함
	//추상 메소드를 가진애는 무조건 추상클래스여야한다.
	
	
}

class Dog extends Animal {
	
	@Override
	void say() {
		System.out.println("멍멍!!");
	}
	
}

class Cat extends Animal {
	
	@Override
	void say() {
		System.out.println("야옹!");
	}
}

class Pig extends Animal {
	@Override
	void say() {
		System.out.println("꿀꿀@@");
	}
}


class Duck extends Animal {
	
	//추상메소드를 상속받아버리게 됨...
	//Duck클래스가 객체가 되려면.. 내용이 없는 say()추상메소드를
	//오버라이드 하여 내용을 구현(implement)해야만 함.
	@Override
	void say() {
		System.out.println("꽥꽥##");
		
	}
		
	
}