
public class Main3 {
	
	public static void main(String[] arg) {
		
		//throw : 코드를 통해서 예외를 강제로 발동!!
		try {
			System.out.println("aaa");
			//강제로 예외 발생 - 억지로 catch영역으로 이동시키는 문법
			throw new Exception();
			
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println("==========================");
		
		//[활용 예]
		//메소드 의 계산을 요청했을 때 그결과가 절대 음수가 나오지 않았으면..
		//혹시 음수가 나오면 이를 예외하고 프로그래밍 하고 싶다면?
		
		int n;
		
		try {
			n=aaa(10,5);
			n=aaa(10,15);
			System.out.println("n:"+ n);
			
		}catch(Exception e) {
			System.out.println("음수 결과는 싫어요~~");
		}
		
		
		
	}
	
	static int aaa(int a, int b) throws Exception{
		if(a<b) {
			throw new Exception();
		}
		return a-b;
	}
	
	

}
