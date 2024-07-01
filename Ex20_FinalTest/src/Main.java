
public class Main {
	
	public static void main(String[] args) {
		
		//지역변수에 final키워드를 붙이면 값 변경이 불가능한 변수가 됨 - 상수화된 변수 : final 상수라고 부름
		final int a=10;
		
		//a=20; //error : a의 값 변경 불가
		
		//final 상수는 일반 변수와 구별하는 표기법을 사용할 것을 권장
		//모든 단어를 대문자로만 명명할 것을 권장.
		final int NUM=100;
		//2단어 이상일떄는..스네이크 표기법 권장.
		final String APP_TITTLE="Hello";
		
		
		System.out.println(Test.AGE);
		//Test.AGE=10;
		
		
		Test t = new Test();
		
		t.aaa();
		t.bbb(200);
		t.bbb(300);
		
		
		
		
	}

}
