
public class Main {

	public static void main (String[] args) {
		
		//상속에 대한 정확한 이해 - 그림으로 해석해보기
		//상속은 멤버들을 준것으로 보이지만 실제로는 객체안에 객체가 있는 것임.
		//상속관계에 대한 호칭(상위-하위, 부모-자식, 슈퍼-서브, 기반-파생)
		//[C#: parent-child, Java:super-sub, C++:base-deriven]
		
		Second s= new Second();
		s.a=10; //상속받은 클래스의 멤버를 내 것인양
		s.b=20; 
		
		
		System.out.println("a:" + s.a);
		System.out.println("b:" + s.b);
		System.out.println();
		
		//객체지향은 멤버변수의 제어를 직접 .연사자로 하는 것을 권장하지 않음
		//멤버값을 출력하는 기능메소드를 설계하여 사용하는 것을 권장
		s.showFirst();
		System.out.println("b:"+ s.b);
		System.out.println();
		
		//이런식이면 b변수의 값을 출력하는 기능메소드가 있어야겠죠!!
		s.showFirst();
		s.showSecond();
		System.out.println();
		
		//여기까지 하고 보니..
		//결국, Second객체는 a,b 모두를 출력하는 기능이 있어야 함.
		s.show();
		
		
		//이런식이면.. 값을 대입하는 입력기능도 있으면.. 좋겠죠!
		s.setMembers(100,200);
		s.show();
		
		
		//여기까지 기능을 만들어보니.. 객체를 생성한 후 항상..
		//값을 대입하는 기능을 추가로 호출해야함.. 이거 짜증!
		Second s2= new Second();
		s.setMembers(50, 60);
		s.show();
		
		//객체를 생성하면서 곧바로 멤버값을 전달하면 초기화가 더 간결하겠죠
		//생성자를 적용하기 전에 .. 잠시 확인할 내용..
		//상속에서 접근제한자의 영향에 대한.. 실습으로 AAA클래스를 상속한 BBB클래스를 만들어보기
		
		
		
		
		
	}
	
	
}
