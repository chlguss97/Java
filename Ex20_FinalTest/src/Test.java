
public class Test {

	final int NUM=10; //final 맴버변수는 반드시 명시적 초기화 되어야 사용가능
	
	//정적변수에도 final 적용가능함
	public static final int AGE=20;
	
	
	void aaa() {
		//NUM=20; //error
		bbb(100);
		
		
	}
	
	void bbb(final int n) {//final 매개변수
		//n++; // 값 변경 불가
		System.out.println(n);
	}
	
	//메소드에도 final 키워드 적용가능 - 마지막기능 이므로.. 개선하지마라.. 오버라이드 금지
	final void show() {
		System.out.println("test show");
	}
	
	
}
