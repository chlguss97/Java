

public class SynchronizedTest {
	
	public static void main(String[] args) {
		
		// 동기화 처리 - Thread를 사용하는 것은 비동기 처리를 한다는 것임.
		// 동기 (Synchronied) : a 작업이 끝나면 b작업을 하는 것
		// 비동기 (ASynchronized) : a 작업할 때 b 작업을 동시에 하는 것
		
		//계좌객체 생성
		Account acc= new Account();
		
		//acc.add(100);
		
		//acc계좌에 100원을 입금하고 싶은 고객1
		TestThread t1= new TestThread(acc);
		
		//acc계좌에 100원을 입금하고 싶은 고객2
		TestThread t2= new TestThread(acc);
		
		
		//비슷한 시점에 둘다 100원 입금 동작 시작
		t1.start();
		t2.start();
		
	}
	
	
}//class...

//은행계좌 클래스
class Account {
	
	private int money=0;
	
	//입금기능 : 동기화 처리가 되어 있지 않으면 계좌정보가 잘못 될 여지가 있음
	//이를 해결하기 위해 동기화처리(synchronized)
	//방법1. 메소드에 동기화 처리..
//	synchronized void add(int m) {
//		System.out.println("입금작업을 시작합니다.");
//		
//		String name = Thread.currentThread().getName();
//		System.out.println(name+ " - 현재잔액 : " + money);
//		
//		money= money+ m;
//		
//		//전산처리 시간을 가정하여 억지로 ..대기..
//		for(long i=0; i<50000000000L; i++) {
//			String a=new String("aaa");
//		/////////////////////////////////////////////////////	
//			
//			
//			
//		}
//		
//		System.out.println(name+ " - 입금 후 잔액 :" + money);
//		System.out.println();
//		
//		
//		
//	}
	
	//방법2. 메소드 전체를 동기화처리하지 않고 특정 영역만 동기화 처리
	void add(int m) {
		System.out.println("입금작업을 시작합니다.");
		
		//동기화 블럭
		synchronized(this) {
			String name = Thread.currentThread().getName();
			System.out.println(name+ " - 현재잔액 : " + money);
			
			money= money+ m;
			
			//전산처리 시간을 가정하여 억지로 ..대기..
			for(long i=0; i<50000000000L; i++) {
				String a=new String("aaa");
			/////////////////////////////////////////////////////	
				
				
				
			}
			
			System.out.println(name+ " - 입금 후 잔액 :" + money);
			System.out.println();
			
			
		}
		
		
		
	}
	
	
}






//은행계좌에 입금하는 작업을 수행하는 Thread 클래스를 설계
class TestThread extends Thread{
	
	Account acc; //위에서 만든 클래스의 참조변수
	
	public TestThread(Account acc) {
		this.acc= acc;
	}
	
	
	@Override
	public void run() {
		//100원을 입금하는 작업을 수행하는 코드
		acc.add(100);
	}
}








