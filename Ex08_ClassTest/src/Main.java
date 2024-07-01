
public class Main {
	
	public static void main(String[] args) {
		
		String name;
		int kor;
		int eng;
		double aver;
		
		name= new String("sam");
		kor=70;
		eng=80;
		aver=(double)(kor+eng)/2;
		
		
		System.out.println("이름:"+ name);
		System.out.println("국어:"+ kor);
		System.out.println("영어:"+ eng);
		System.out.println("평균:"+ aver);
		System.out.println();
		
		
		//학생이 여러명이라면 모든 변수를 개별로 만들면 짜증!!
		//배열! - 같은 자료형만 묶을 수 있음.
		String[] names = new String[4];
		int[] kors = new int[4];
		int[] engs = new int[4];
		double[] avers= new double[4];
		
		names[0]= "sam"; //자동 new String("sam")
		kors[0]= 70;
		engs[0]= 80;
		avers[0]= (double)(kors[0]+engs[0]) /2;
		
		System.out.println("이름" + names[0]);
		System.out.println("국어" + kors[0]);
		System.out.println("영어" + engs[1]);
		System.out.println("평균어" + avers[0]);
		System.out.println();
		
		//가만보니.. 이름,영어,국어,평균 데이터는 서로 연관된 데이터들임.
		// 이를 개별변수로 저장하여 사용하려니 관리가 용이하지 않음.
		
		// 이 연관있는 변수의 값들을 하나의 박스에 모두 저장해 놓을 수 있다면
		//값 관리가 훨씬 용이하지 않을까?
		
		//그래서 원하는 데이터들을 묶어서 만들어주는 새로운 자료형을 만들 수 있음.
		// 새로운 자료형을 만드는 문법 키워드 : class
		//별도의 .java문서를 만들어서 새로운 클래스를 설계해보기
		
		
		// class는 설계도임. 즉, 아직 변수가 된것이 아님.
		// 다시말해, 사용하려면 이 클래스를 객체로 만들어야 함.
		// 이때 사용하는 키워드 : new
		
		
		Student stu = new Student();
		stu.name="sam";
		stu.kor= 70;
		stu.eng=80;
		stu.aver= (double)(stu.kor+stu.eng) /2;
		
		System.out.println("이름:" + stu.name);
		System.out.println("국어:" + stu.kor);
		System.out.println("영어:" + stu.eng);
		System.out.println("평균:" + stu.aver);
		System.out.println();
		
		
		Student stu2= new Student();
		stu2.name="robin";
		stu2.kor= 80;
		stu2.eng=85;
		stu2.aver= (double)(stu2.kor+stu2.eng) /2;
		
		System.out.println("이름:" + stu2.name);
		System.out.println("국어:" + stu2.kor);
		System.out.println("영어:" + stu2.eng);
		System.out.println("평균:" + stu2.aver);
		System.out.println();
		
		Student stu3= new Student();
		System.out.println("이름:" + stu3.name);
		System.out.println("국어:" + stu3.kor);
		System.out.println("영어:" + stu3.eng);
		System.out.println("평균:" + stu3.aver);
		System.out.println();
		
		
		
		System.out.println(stu); // 참조변수를 출력하면 주소가 나와야 하지만 그 참조변수가 참조하는 실제 객체의 정보를 출력하는 .toString()이 자동 발동함
		System.out.println(stu2);
		System.out.println(stu3);
		
		
		Student stu4= stu3;
		System.out.println( stu4 );
		
		stu4.kor= 50;
		System.out.println(stu3.kor);
		
		
		
		Student stu5= new Student();
		stu5.name="hong";
		stu5.kor= 90;
		stu5.eng=50;
		stu5.aver=(double)(stu5.kor+stu5.eng)/2;
		System.out.println();
		
		//출력기능 코드를 매번 작성하지말고..
		//class안에 기능코드들을 미리 작성해놓고 필요할 때 불러서 사용하면 편하겠죠?
		stu5.show();
		
		Student stu6= new Student();
		stu6.name="park";
		stu6.kor= 70;
		stu6.eng=75;
		stu6.calAverage(); //평균계산 기능을 요청!!(호출)
		stu6.show();
		
		
		Student stu7 = new Student();
		stu7.setMembers("lee", 70, 60); // 기능을 호출하면서 값을 전달!
		stu7.show();
		
		
		Student stu8 = new Student();
		stu8.setMembers("kim", 50, 55); // 기능을 호출하면서 값을 전달!
		stu8.show();
		
		
		
		Student stu9= new Student();
		stu9.setMembers("rosa", 80, 82);
		stu9.show();
		
		//학생의 점수 총점을 저장하여 출력해보기
		int total;
		total= stu9.kor + stu9.eng;
		System.out.println("총점"+ total);
		
		
		//Student객체가 총점을 계산해서 리턴해주느 기능이 있다면??
		total= stu9.calTotal();
		System.out.println("리턴된 총점: " + total);
		
		
		
		
		
		
		
		
	}

}
