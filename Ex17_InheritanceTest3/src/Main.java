
public class Main {
	
	public static void main(String[] args) {
		
		//상속관계에서 생성자메소드 만들기 실습
		
		First f= new First();
		f.showFirst();
		System.out.println();
		
		Second s= new Second();
		s.show();
		
		//멤버값을 대입은 불가.. WHY? 멤버변수를 private이어서..
		//멤버값을 대입하는 기능메소드를 만들거나.. 아니면..
		//객체를 생성하면서 값을 전달하여 초기화 하는 방법 - 생성자
		Second s2= new Second(10,20);
		s2.show();
		
		Second s3= new Second(50,60	);
		s3.show();
		
		// 상속의 상속... Second를 상속한 Third클래스
		Third t =new Third();
		System.out.println();
		
		//First를 상속한 다른 클래스 Nice
		new Nice();
		
		//다중 상속은 문법적으로 금지... First와 Second를 동시에 상속받기.불가.
		
		
	}
	
}
