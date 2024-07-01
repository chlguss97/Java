
public class Test {

	// 메소드를 설계할떄 리턴과 파라미터의 존재 여부에 따라 4가지 형태로 정의됨
	
	//1) 리턴 X, 파라미터 X
	void aaa() {
		System.out.println("aaa");
	}
	
	//2) 리턴 X, 파라미터 O
	void bbb(int x) {
		System.out.println("x:" + x);
	}
	
	//3) 리턴 O, 파라미터 X
	double ccc() {
		return 3.14;
	}
	
	//4) 리턴 O, 파라미터 O
	int ddd(int x,int y) {
		return x+y;
	}
}
