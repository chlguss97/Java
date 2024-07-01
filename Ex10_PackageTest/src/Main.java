import java.util.Scanner;
//import bbb.Hello;
//import bbb.Student;
import bbb.*;  // 모든 걸 쓰고 싶을때 *
//import aaa.*; error : 둘중에 하나만 import 해야됨
import mrhi.*; // 본인 폴더까지만 import 됨

public class Main {

	public static void main(String[] args) {
		
		//클래스를 설계하다 보면, 같은 이름을 명명하는 경우가 생김. 즉, 충돌
		//각 클래스 파일들의 폴더를 구분하면 같은 이름이 있어도 됨
		//이 클래스 파일들의 폴더를 package 라고 부름
		
		//Main.java와 같은 default package에 있는 Test클래스를 객체로 생성
		Test t= new Test();
		t.a= 10;
	
		//[이름, 국어, 영어]데이터를 저장하는 Student 클래스 설계
		aaa.Student stu= new aaa.Student();	
		stu.name="sam"; // 다른 package의 멤버 중 public 접근제한자가 있는 변수는 사용가능
		//stu.kor= 80; //error -다른 package의 멤버는 접근이 불가능
		
		
		
		//[이름, 나이, 주소]데이터를 저장하는 Student 클래스 설계  
		bbb.Student s= new bbb.Student();
		bbb.Student s2= new Student();
		bbb.Student s3= new Student();
		
		
		// 매번 package 명을 작성하는 것이 귀찮아서.. 미리 패키지명의 클래스를
		// 인식할 수 있도록 등록하는 문법: import
		Student s4= new Student();
		
		
		
		//Scanner 클래스도 당연히 package가 적용되어 있는 클래스임
		java.util.Scanner scan= new java.util.Scanner(System.in);
		Scanner scan2= new Scanner(System.in); // import 적용
		
		//자바에서 미리 만들어놓은 클래스들이 2000여개 정도 되는데..
		//이 모든 클래스들은 package가 적용되어 있음.
	
	
		//String클래스도 package가 있음. java.lang
		//import를 안해도 에러안남, why? java.lang은 원낙 기본적인 클래스들이 위치하고 있어서 자동 import가 되어 있는 유일한 package.
		java.lang.String str= new String("aaa");
		
		bbb.Hello h=new bbb.Hello();
		Hello h2= new Hello();
	
		
		//패키지명을 가급적 소문자로만 작성하고
		//가급적. 구분자를 이용한 2단어 이상으로 만들기를 권장함.
		//aaa.ccc
		
		//패키지명을 통해 문서를 작성한 조직을 쉽게 파악할 수 있으며
		//클래스의 카테고리 구분도 수월함.
		
		//ex) naver.map, kakao.map
		
		
		mrhi.android.Nice n= new mrhi.android.Nice();
		
		
		
		
	}
	
}
