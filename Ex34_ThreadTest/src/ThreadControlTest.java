
public class ThreadControlTest {
	public static void main(String[] args) {
		
		// 스레드 객체의 동작을 제어하는 상황에 대한 실습
		
		// 타이어조립작업을 수행허는 직원 객체 채용(생성)
		CThread t= new CThread();
		t.start();
		
		//Tread클래스의 작업은 딱 1번만 start할수 있음. 즉, 1회용임
		//다시말해. Thread클래스의 run() 작업이 끝나면 이 스레드 객체를 더 이상 실행할 수 없음.
		//t.start();
		
		//반복작업을 하려면.. run()메소드가 끝나지 않으면 됨. 반복문으로..
		
		
		//3초 후에 일시정지 - pause기능... wait()메소드
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//t.wait(); //스레드가 일시정지는 되지만. 막무가내라서.. 권장하지 않음.
		t.isWait= true;
		
		//다시 3초후에 일시정지되어 있던 스레드를 이어하기. Resume
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//wait()되어 있는 스레드를 깨우기.. 공지하기!!
		t.isWait=false;
		synchronized (t) {	
			t.notify();
			
		}
		
		
		
		//3초 후에 퇴근
		//직원의 작업을 종료시키기..
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//t.stop(); //이 순간 스레드가 어떤 작업 중이더라도 강제로 멈춰버림..(권장하지 않음)
		//스레드가 반복작업을 지속하는 이유는 while()반복문의 변수 isRun값이 true여서..
		//while문릏 멈추면.. run()메소드도 끝날 수 있으니.. while 조건변수값을 false로 변경
		t.isRun=false;
		
		
		
		System.out.println("main thread(사장) 퇴근!");
		
	}
}// class....

//특정 작업을 수행하는 직원(Thread) 클래스 설계
class CThread extends Thread {
	
	boolean isRun= true;
	boolean isWait= false;
	
	@Override
	public void run() {
		
		while(isRun) {
			//타이어 4개를 조립하는 작업
			System.out.println("1번 타이어 조립");
			System.out.println("2번 타이어 조립");
			System.out.println("3번 타이어 조립");
			System.out.println("4번 타이어 조립");
			System.out.println();
			
			
			if(isWait) {
				try {
					synchronized (this) {
						wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while..
		
		System.out.println("퇴근!!");
		
		
	}//run method...

}//CThread class..
