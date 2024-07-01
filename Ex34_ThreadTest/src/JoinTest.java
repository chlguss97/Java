
public class JoinTest {

	
	public static void main(String[] args) {
		
		// join() 메소드 : 스레드의 작업이 끝날때까지 디른 스레드가 작업을 못하도록 하는 메소드
		
		JThread j= new JThread();
		j.start();
		
		//j의 작업이 끝날때 까지 다른 스레드의 작업을 기다려줬으면..(block)
		try {
			j.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//main thread가 다른 작업 수행
		for(int i=0; i<10; i++) {
			System.out.println("main.....");
			
			try {
				Thread.sleep(500);//0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


class JThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("aaa");
			
			try {
				Thread.sleep(500); //500ms--0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}