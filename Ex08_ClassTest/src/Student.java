

// class : 서로 연관있는 데이터를 묶어주는 설계도....
public class Student {
	
	//이 묶음안에 저장하기 원하는 데이터를 저장할 변수들을 나열
	String name;
	int kor;
	int eng;
	double aver;
	
	//맴버변수의 값을 출력해주는 기능이 있다면!!!
	//기능 function:함수 --> method:메소드
	void show(){ 
		System.out.println("이름:" + name);
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("평균:" + aver);
		System.out.println();
		
	}
	//평균을 계산해주는 기능 메소드
	void calAverage(){
		aver= (double)(kor+eng)/2;
	
		
	
		
	}
	
	//멤버변수에 값을 대입해주는 기능 메소드 - 값을 전달받는 변수 - 매개변수(파라미터)
	void setMembers(String n, int a, int b) {
		//매개변수에 전달받은 값들을 멤버변수에 대입해주는 코드들..
		name= n;
		kor= a;
		eng= b;
		
		//aver=(double)(a+b)/2;
		//위에 이미 평균을 계산해주는 기능이 존재함.. 그러니 또 계산하지말고...
		calAverage();
		
		
	}
	
	//총점을 계산하여 호출하는 쪽으로 값을 리턴해주는 기능 메소드
	int calTotal() {
		int x= kor+eng;
		return x;
	}
	
	

}
