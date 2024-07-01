
public class Second extends First{

	//이미 a, showFirst(), show()를 보유한 상태
	int b;
	
	void showSecond() {
		System.out.println("show Second!");
	
	}
	
	
	//오버라이드 - 기존 First의 show()가 가려짐. - 기능 개선용으로 사용
	void show()	{
		System.out.println("Second클래스의 show() 메소드!!");
	}
	
	
}
