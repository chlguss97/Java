
public class Main {
	
	public static void main(String[] args) {
		
		//상속의 개략적인 사용 알아보기
		
		//이동,공격 기능만 있는 객체
		Robot r= new Robot();
		r.move();
		r.attack();
		System.out.println();
		
		//이동,공격 + 나는 기능도 있는 객체
		FlyRobot fr= new FlyRobot();
		fr.move();
		fr.attack();
		fr.fly();
		System.out.println();
	
		//이동,공격 + 수영기능도 있는 객체
		SwimmingRobot sr= new SwimmingRobot();
		sr.move();
		sr.attack();
		sr.swimmimg();
		
		
	
	}
	
		
	

}
