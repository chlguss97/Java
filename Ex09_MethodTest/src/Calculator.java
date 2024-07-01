
public class Calculator {
	
	//덧셈기능
	int sum(int x, int y) {
		return x+y;
		
	}
	
	//뺄셈기능
	int subtract(int x, int y) {
		return x-y;
	}

	
	//곱셈기능
	int multuply(int x, int y) {
		return x*y;
	}
	
	
	//나눗셈기능
	int divide(int x, int y) {
		return x/y;
	}
	
	
	//실수형 숫자의 덧셈을 해주는 기능메소드 4개
	double sum(double x, double y) {         //이름이 똑같아도 파라미터가 다르면 작성가능 :메소드 오버로딩
		return x+y;                          
	}
	double subtract(double x, double y) {         
		return x+y;
	}
	double multuply(double x, double y) {         
		return x+y;
	}
	double divide(double x, double y) {         
		return x+y;
	}
	
	
	
	
	
	
}
