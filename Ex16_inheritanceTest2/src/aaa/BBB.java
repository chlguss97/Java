package aaa;
//같은 패키지의 AAA클래스를 상속
public class BBB extends AAA {
	
	//이미 멤버변수 4개를 보유한 상태..
	
	void show() {
		//System.out.println(a); //error -상속 받았더라도.. private
		System.out.println(b); //default 같은 패키지라면 접근 가능
		System.out.println(c);
		System.out.println(d);
	
	
	}
	
	
	
}
