		
public class Main {
	
	public static void main(String[] args) {
			//1. 일반회원 : 이름, 나이
			//2. 학   생 : 이름, 나이, 전공
			//3. 교	 수	: 이름, 나이, 연구주제
			//4. 근로삭생: 이름, 나이, 전공, 업무
		
		
		Person p = new Person("sam",20);
		p.show();
		System.out.println();
		
		
		Student s= new Student("jim",21,"android");
		s.show();
		System.out.println();
		
		Professor pr = new Professor("him",21,"eng"	);
		pr.show();
		System.out.println();
		
		AlbaStudent a= new AlbaStudent("sun", 25, "Math", "Pc");
		a.show();
	}
	
	
	
}
