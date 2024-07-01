
public class Second extends First {

	//그냥 보면 멤버가 하나도 없는 것 처럼 보이지만
	//상속 받은 First 클래스의 멤버를 이미 보유한 상태임.
	
	
	//새로운 변수 추가
	int b;
	
	//본인 클래스의 멤버변수를 출력하는 기능메소드
	void showSecond() {
		System.out.println("b:" + b);
	}
	
	
	//상속벋은 맴버까지 출력하는 기능메소드
	void show() {
		//System.out.println("a:" +a);
		//객체지향은 니껀 니가하는 특징... 즉, First의 변수 출력은
		//First객체에게 스스로 하라고..
		showFirst();
		System.out.println("b:" +b);
		System.out.println();
	}
	
	
	//멤버값을 대입해주는 기능메소드 - 단, 상속받은 변수에도 값을 대입해주는 ...
	void setMembers(int a, int b) {
		//this.a=a;
		setA(a);
		this.b=b;
	}
	
}
