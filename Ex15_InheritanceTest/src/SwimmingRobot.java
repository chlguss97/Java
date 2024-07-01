
public class SwimmingRobot extends Robot{

	//기존의 Robot 클래스에 설계했던 변수와 기능 (메소드)들은 모두 필요하고
	//추가로 수영기능이 필요한 상황
	//처음부터 다시 설계하는 것은 짜증!!
	//Robot클래스의 멤버를 그대로 상속받고 추가적인 기능만 설계하는 문법: 상속
	
	//새로 추가된 기능
	void swimmimg() {
		System.out.println("음파~~");
	}
	
}
