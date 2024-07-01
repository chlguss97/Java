
public class VariableTest {
	// 자바에서 변수의 종류 [ 멤버변수, 지역변수, 매개변수, 정적변수(추후 수업) ]
	
	
	//멤버변수 (Field) - class {} 영역안에 선언된 변수
	int a; // 자동 0으로 초기화
	int b;
	
	
	void show() {
		int a; //지역변수임
		a=10;
		System.out.println(a);
	}
	
	
	
	void out(int a) {
		System.out.println(a); // 매개변수 a를 출력.
		System.out.println(this.a); // this. : 멤버변수를 호출
	}
	
		
	
	
	
	//지역변수 - 메소드 영역 안에 선언된 변수
	void aaa() {
		int k; // 지역변수 -- 자동 초기화 되지 않음.. 쓰레기값
	
	
	System.out.println(a);
	//System.out.println(k); //error
	k=10;
	System.out.println(k);
	
	
	c=50;
	
	}
	
	
	int c; //맴버변수
	
	void bbb(int x ) { //매개변수 : 메소드의 ()안에 선언한 변수 - 지역변수의 엘종
		//k=50; //error
		a=10;
		x=100;
	}
	
	void ccc() {
		//x=50
		int y; //지역변수는 변수의 값을 메인에서 받을 수 없음
	}
	
	
	
}
