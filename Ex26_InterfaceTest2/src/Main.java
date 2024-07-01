
public class Main {

	public static void main(String[] arg) {
		
		//팀장이 유닛이라면 가져야 할 필수 기능을 인터페이스로 설계하고 
		//추상메소드로 이름을 정하면 팀원들은 
		//그 이름을 토대로 기능을 구현하여 클래스를 설계함.
		//팀장 : Unit 인터페이스를 설계, 추상메소드를 정의
		//팀원1: Marine클래스 정의 및 Unit구현
		//팀원2: Tank클래스 정의 및 Unit구현
		//팀원3: Race클래스 정의 및 Unit구현
		
		
		//유닛들(마린,탱크,레이스)을 제어하기 위한 배열만들기
		Unit[] units= new Unit[5];
		units[0]= new Marine();
		units[1]= new Tank();
		units[2]= new Race();
		units[3]= new Marine();
		units[4]= new Tank();
		
		//유닛들의 기능을 사용해보기
		for(int i=0; i<units.length; i++) {
			units[i].move();
			units[i].attack();
			
			//레벨업 기능
//			if(units[i] instanceof Marine) {
//				Marine m=(Marine)units[i]; //다운캐스팅
//				m.levelUp();
//				
//				}else if(units[i] instanceof Tank) {
//					((Tank)units[i]).levelUp();
//				}
			
			if(units[i] instanceof LevelUpAble) {
				LevelUpAble u= (LevelUpAble)units[i];
				u.levelUp();
			}
			
			
			System.out.println();
		}
		
		
		
		
		
		
	}
	
}
