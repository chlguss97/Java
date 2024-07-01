
public class FlyRobot extends Robot {

	//이미 move(), attack() 기능 보유한 상태
	
	//새로운 기능만 추가
	 void fly() {
		 System.out.println("오~~ 난다~~");
	 }
	 
	 //공격유닛에 어울리는 공격기능을 다시 설계
	 //기존 상속받은 기능메소드이름과 같은 이름으로.. 심지어 파라미터가 같은..
	 //즉, 기존 기능을 다시 개선하여 작성하는 문법 - override

	 void attack() {
		 System.out.println("미사일 발사!!");
	 }
	 
	 //override -상속받은 기능메소드와 완전 같은 구조로 만든 기능메소드
	 void move() {
		 System.out.println("숭~~~");
	 }
	 
	 
}
