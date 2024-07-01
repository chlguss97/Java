package aaa;

public class InitialTest {

	//1. 기본값 초기화 - 0에 해당하는 값
	public int a=10 ; //2. 명시적 초기화
	
	//3. 초기화 블럭
	{
		a=20;
		a++;
		//if(age>20) a=20;
		//else a=30;
		System.out.println("초기화 블럭..");
	}
	
	//4. 생성자 메소드
	public InitialTest() {
		a= 30;
		System.out.println("생성자 메소드");
		
	}
	
	
	
	
	
}
