
public class Second extends First {

	//이미, First의 변수를 보유한 상태
	private int b;
	
	//기존 출력기능인 show()가 맘에 들지 않음.. 이를 개선 -- override
	//a와 b값 모두를 출력하는 기능으로 개선하고 싶음.
	public void show() {
		//System.out.println("a:" + a);
		//show();// 부모의 show일까요?? NO
		//부모의 show()기능을 호출해야함.
		super.show();
		System.out.println("b:"+ b);
		
		
	}
}
