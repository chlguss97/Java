
public class Main {
	
	public static void main(String[] args) {
		
		//상속 수업의 종합 예제실습
		
		//어떤 대학의 정보제공 앱 제작 - 회원가입기능이 존재
		//회원종류: 일반회원, 학생, 교수, 근로학생
		
		//1. 일반회원 : 이름, 나이
		//2. 학   생 : 이름, 나이, 전공
	  	//3. 교	 수	: 이름, 나이, 연구주제
		//4. 근로삭생: 이름, 나이, 전공, 업무
		
		
		//일반회원
		Person p= new Person("sam", 20);
		p.show();
		System.out.println();
		
		
		//학생
		Student stu= new Student("robin",23,"android");
		stu.show();
		System.out.println();
		
		//교수
		Professor pro= new Professor("hong",45,"mobile optimization");
		pro.show();
		System.out.println();
		
		//근로학생
		AlbaStudent alba= new AlbaStudent("kim",25,"ios","pc management");
		alba.show();
		
		
		
	}  	
}
