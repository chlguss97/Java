
public class Main {

	public static void main(String[] args) {
		
		//OOP에서는 객체의 멤버변수를 외부로부터 보호되어 관리되는 것이 중요함
		//캡슐화, 정보은닉. 라디오의 회로가 외부에 노출되어 있으면 오히려 안전하지 못하다고 보는 개념과 비슷함.
		
		//접근 제한자의 종류 4가지(보안이 강-->약 순으로)
		//1. private   : 본인 class 내부에서만 접근 가능
		//2. (default) or (Package) : 같은 패키지에서는 외부에서도.연산자로 접근 가능, 다른 패키지에서는 .연산자로 접근 불가 
		//3. protected : 같은 패키지에서는 접근 가능하며 다른 패키지에서도 상속관계의 클래스라면 접근 가능
		//4. public    : 어느 곳이든, /연산자로 멤버접근 가능
		
		//같은 패키지의 클래스 객체 생성
		First f=new First();
		//f.a = 10; //error : private은 외부에서 접근 불가!
		
		//같은 패키지 안에서는 private을 제외한 모든 접근제한자에 접근 가능
		f.b= 20;
		f.c= 30;
		f.d=40;
		
		f.aaa(); //defualt 접근제한메소드는 같은 패키지에서 호출 가능
		System.out.println();
		
		//다른 패키지의 클래스 객체 생성
		aaa.Second s= new aaa.Second();
		//s.a=100; //error - private는 외부에서 접근 불가
		//s.b=200; //error - (default)는 다른 패키지에서는 접근불가
		//s.c= 300; //error - protected도 다른 패키지에서는 접근 불가. 상속관계도 아니기에....
		s.d=400; //public은 .연산자만 있으면 무조건 사용 가능
		
		//s.aaa(); // 에러[ default 메소드는 다른 패키지에서는 사용 불가능 ]
		s.bbb();
	
		// 접근제한 사용에 대한 tip.
		// 맴버변수는 무조건 private
		// 맴버메소드는 무조건 public
		
		//ex) 사람의 [이름,나이]를 저장하는 객체를 생성하기 위해 class 설계
	
		Person p= new Person();
		//p.name="sam";  //error -private 이니까!!
		p.setMembers("sam",20);
		//System.out.println("이름": p.name); // error -private
		p.show();

		
		Person p2= new Person();
		p2.setMembers("robin", 25);
		p2.show();
		
		
		
	}
	
	
}
