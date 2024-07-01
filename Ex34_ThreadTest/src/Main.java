
public class Main {
	
	public static void main(String[] args) {
		
		//Thread(스레드) : 동시에 여러 작업을 처리하는 기법
		
		//용어정리
		//1. 프로세스(Process) : 실행중인 자바 프로그램 [본인만의 메모리영역을 가짐(Method, Stack, Heap)] - 프로세스간에는 자원공유 불가
		//2. 스레드(Thread) : 하나의 프로세스안에서 동작하는 일꾼(직원)같은 개념 - 프로세스의 작업단위(Task)를 처리하는 녀석 - 하나의 프로세스안에서 스레드간에는 자원공유 가능
		//3. 트랜젝션(Transaction) : Rollback 기능이 있는 프로세스 - 추후 소개될 예정
		
		// 결국. Thread는 작성되어 있는 코드를 읽어서 실행하는 녀석으로 생각하면 됨!
		// 하나의 프로세스안에는 적어도 하나의 스레드는 기본적으로 존재하며 그 스레드를 Main Thread(사장같은 개념) 라고 부름
		
		// 동시에 했으면 하는 작업 2개 구현!
		//예) 파일 다운로드 하면서 음악재생 or 채팅하기....
		
		//실제로 다운로드나 음악재생 코드를 작성하기에는 너무 힘드니..그냥 느낌만..
		
//		//1번작업. 20개 파일 다운로드하는 작업
//		for(int i=0; i<20; i++) {
//			System.out.println(i + "번 파일 다운로드 중 ... ");
//			
//			//강제로 잠시 시간을 벌기..
//			for(long k=0; k<8000000000L; k++) {
//				new String("aaa"); //객체 생성하는 시간이 소요됨				
//			}
//		}
		
//		//2번작업. 20개 음악 재생하는 작업
//		for(int i=0; i<20; i++) {
//			System.out.println(i + "번 음악 재생 중 ... ");
//			
//			//강제로 잠시 시간을 벌기..
//			for(long k=0; k<8000000000L; k++) {
//				new String("aaa"); //객체 생성하는 시간이 소요됨				
//			}
//		}	
		
		// 위 2개 작업을 동시에 수행하기 위해 코드를 읽어서 실행하는 Thread객체를 만들기
		// Thread를 만드는 방법 - Thread를 상속한 클래스를 새로 설계하고 작업한 내용을 코딩하면 됨
		
		//각각의 작업을 수행하는 직원 Thread 객체를 생성
		ThreadA t1= new ThreadA();
		//t1.run(); //직접 run메소드를 호출하면 main thread가 이 작업을 수행함 - 절대 run()는 직접호출하지 않음.
		t1.start(); //Thread안에 있는 run()메소드가 자동 발동함.
		
		ThreadB t2= new ThreadB();
		t2.start();
		
		//main Thread도 작업을 수행할 수 있기에..
		for(int i=100; i<120; i++) {
			String name= Thread.currentThread().getName();
			System.out.println(name+" : " +i);
			
			//강제로 잠시 시간을 벌기..
			for(long k=0; k<8000000000L; k++) {
				new String("aaa"); //객체 생성하는 시간이 소요됨				
			}
		}
		
		
		
	}//main method..

}//Main class...

//파일다운로드 작업을 수행하는 별도 직원 Thread의 클래스를 설계
class ThreadA extends Thread{
	//이 스레드가 수행할 작업 코드를 작성하는 특별한 메소드 - 이 메소드의 이름은 이미 지정되어 있음.
	@Override
	public void run() {
		//1번작업. 20개 파일 다운로드하는 작업
		for(int i=0; i<20; i++) {
			String name= Thread.currentThread().getName();
			System.out.println(name+" : "+ i + "번 파일 다운로드 중 ... ");
					
			//강제로 잠시 시간을 벌기..
			for(long k=0; k<8000000000L; k++) {
				new String("aaa"); //객체 생성하는 시간이 소요됨				
			}
		}
	}//run method..	
}//ThreadA class..

//음악을 재생하는 작업을 수행하도록 Thread 클래스를 설계하기
class ThreadB extends Thread{
	@Override
	public void run() {
		//2번작업. 20개 음악 재생하는 작업
		for(int i=0; i<20; i++) {
			String name= Thread.currentThread().getName();
			System.out.println(name+" : " + i + "번 음악 재생 중 ... ");
					
			//강제로 잠시 시간을 벌기..
			for(long k=0; k<8000000000L; k++) {
				new String("aaa"); //객체 생성하는 시간이 소요됨				
			}
		}		
	}//run method..
}//ThreadB class..





