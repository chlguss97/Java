
public class Main2 {

	public static void main(String[] args) {
		
		// throws : 예외 떠넘기기.. 문법
		try {
			int x = divide(10,0);
			System.out.println("x: " + x);
		}catch(ArithmeticException e) {
			System.out.println("divide 메소드가 떠넘긴 예외를 대신 처리해줌");
		}
		
	}
	
	//두 수를 파라미터로 전달받아 나눗셈의 결과를 리턴해주는 기능 메소드
	//예외가 발생할 가능성이 있는 코드에서 try-catch문을 사용하기 어려운 상황도 있음.
//	static int divide(int a, int b) {
//		try {
//			return a/b;
//		}catch (ArithmeticException e) {
//			System.out.println("예외발생");
//			return ???;
//		}
//		
//	}
	
	//그래서 예외가 발생하면 예외처리를 호출하는 쪽으로 던져버리기 ..throws
	static int divide(int a, int b) throws ArithmeticException {
		return a/b;//예외발생은 이곳에서...
	}
	
	
}
