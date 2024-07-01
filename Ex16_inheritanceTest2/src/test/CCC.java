package test;

//다른 패키지의 AAA클래스를 상속받기
public class CCC extends aaa.AAA {

	//이미 멤버변수 4개를 보유한 상태

	void show() {
		//System.out.println(a); //error - private은 First만 사용 가능
		//System.out.println(b); //error - default는 다른 패키지에서는 접근 불가
		System.out.println(c); //OK - 다른 패키지이지만 .. 상속솬계라면 접근 허용
		System.out.println(d); //OK
	}
	
}
