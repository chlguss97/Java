
public class RunnableTest {

	public static void main(String[] args) {
		
		//Thread를 만드는 2가지 방법
		//1. Thread 클래스를 상속한 클래스를 설계하여 사용하는 방법
		//2. Runnable 인터페이스를 구현한 클래스를 설계하여 사용하는 방법
		
		
		//왜 2가지 방법이 존재할까?
		//다중 상속의 효과를 보고 싶어서.
		//Person 클래스의 능력도 가지면서.. 동시에 스레드의 능력도 보유한 객체를 생성
		
		PersonThread pt= new PersonThread();
		pt.name="sam";
		pt.age=20;
		
		//pt.run(); // main thread가 이 작업을 수행함.
		//pt.start(); //runnable 인터페이스는 start()기능이 없음
		
		//Runnable 의 run()메스도를 실행시켜주는 객체가 필요함
		Thread t= new Thread(pt);
		t.start(); //생성자로 전달받은 Runnable 구현객체의 run()메소드를 발동해줌
		
		
		//Runnable 인터페이스를 사용하는 다른 모습.. 사실 이 모습이 더 많이 사용됨.
		Runnable r= new PersonThread();// 업캐스팅
		new Thread(r).start();
		
		Runnable r2= new Runnable() { //이름이 없는 클래스 - 익명클래스
			public void run() {
				System.out.println("Runnable...");
				
			}
		};
		new Thread(r2).start();
		
		
		
		
		System.out.println("main 종료...");
	}
	
	
}//RunnableTest class...

//Person클래스를 상속하면서 스레드가 되고 싶은 클래스 설계
class PersonThread extends Person implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name+"-"+age);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	
	
}


class Person {
	String name;
	int age;
}
