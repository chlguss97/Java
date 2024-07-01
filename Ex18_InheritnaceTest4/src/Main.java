import java.awt.SecondaryLoop;

public class Main {

	public static void main(String[] args) {
		
		// 오버라이드 override : 상속받은 기능을 개선하는 문법
		
		
		Robot r= new Robot();
		r.move();
		r.attack();
		System.out.println();
		
		FlyRobot fr= new FlyRobot();
		fr.move();  //상속받은 기능을 내것인양 호출 -- 개선된 기능으로 사용하기 --override
		fr.attack();//상속받은 기능을 내것인양 호출 -- 개선된 기능으로 사용하기 --override
		fr.fly();
		System.out.println();
		
		
		SwimmingRobot sr= new SwimmingRobot();
		sr.move();
		sr.attack();
		sr.swimming();
		System.out.println();
		
		//오버라이드를 할때, 기존 기능을 완전히 새로운 코드로 변경하기도 하지만
		//경우에 따라서는 기존코드는 그대로 동작하면서 일부기능이 추가되는 개선도 있을 수 있음.
		Second s= new Second();
		s.show();
	}
}
