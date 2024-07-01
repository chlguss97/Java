package aaa;

public class Second {

	
	//접근제한자가 적용된 멤버 변수들
	private int a;
	int b;
	protected int c;
	public int d;
	
	//멤버 메소드 -- 메소드도 접근제한자의 영향을 받음 [default 접근제한 ]
	void aaa() {
		a=100;
		b= 200;
		c= 300;
		d=400;
	
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
	
	public void bbb () {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
