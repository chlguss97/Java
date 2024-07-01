import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
	 	//자바라는 언어에서 배열은 객체임.
		
		// int 형 변수 3개를 배열로 만들기
		int[] aaa = new int[3];         
		
		// 배열요소값 출력해보기
		System.out.println(aaa[0]); //배열요소는 0으로 초기화 되어있음.
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		//System.out.println(aaa[3]); //error - 인덱스 범위를 벗어남
		System.out.println(aaa); //자바에서 참조변수를 출력하면 주소가 나오지 않고 그 참조변수가 참조하는 객체의 정보가 출력됨.
		
		// 배열요소의 값을 대입해보기
		aaa[0]= 10;
		aaa[1]= 20;
		aaa[2]= 30;
	
		// 요소값 출력해보기
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
	
		//요소의 인덱스 번호를 변수에 대입된 값으로 적용할 수 있음
		int a=0;
		System.out.println(aaa[a]);
		
		a=1;
		System.out.println(aaa[a]);
	
		a++;
		System.out.println(aaa[a]);
		
		//반복문으로 배열요소들의 값을 순차적으로 출력해보기
		for(int i=0; i<3; i++) {
			System.out.println(aaa[i]);
		}
		
		
		// 배열객체에는 배열 요소의 개수(길이:length)를 저장하고 있는 변수가 이미 존재함.
		System.out.println("배열 길이 (요소개수): " + aaa.length);
		
		for(int i=0; i<aaa.length; i++) {
			System.out.println(aaa[i]);}
			
			
		// 다른 자료형의 배열 객체 만들어 보기
		double[] bbb = new double[3];
		for(int i=0; i<bbb.length; i++) {
			System.out.println(bbb[i]);
		}
			
		
		boolean[] ccc = new boolean[4];
		for(int i=0; i<ccc.length; i++) {
			System.out.println(ccc[i]);
		}
		
		
		//배열객체도 만들면서 미리 값을 초기화해보기
		int[] aaa2 = new int[] {10,20,30}; //배열 요소 개수는 초기화한 값의 개수대로 만들어짐
		//int[] aaa2 = new int[3] {10,20,30}; //error - 초기화 할때 개수 지정하면 에러
		// int[] aaa4= new int[]; //error - 초기화 안하고 개수지정 안하면 에러
		
		System.out.println("배열길이: " + aaa2.length);
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		
			
		//배열객체도 문자열 객체처럼 매우 자주 사용되기에 축약표기법을 제공함
		int[] aaa3= {100,200,300}; // 자동 new int[] 
		for(int i=0; i<aaa3.length; i++) {
			System.out.println(aaa3[i]);
		}
		
		
		// 다른 자료형의 배열 객체들도 초기화 해보기
		double[] bbb2= new double[] {3.14, 5.57, -7.45};
		for(int i=0; i<bbb2.length; i++) {
			System.out.println(bbb2[i]);
		}
			
			
		boolean[] ccc2= new boolean[] {true, false, false, 5>3};
		for(int i=0; i<ccc2.length; i++ ) {
			System.out.println(ccc[i]);
			
			
			
		}
		
		
		char[] ddd2= new char[] {'h','e','l','l','o'};
		for(int i=0; i<ddd2.length; i++ ) {
			System.out.println(ddd2[i]);}
		
		for(int i=0; i<ddd2.length; i++ ) {
			System.out.print(ddd2[i]);}
		
		System.out.println();
		
		
		
		//배열 객체를 만들때 배열요소의 개수를 변수값으로 지정해보기
		int b= 5;
		int[] aaa4= new int[b];
		System.out.println("배열길이: " + aaa4.length);
		
		
		
		
		//배열 길이를 키보드로 입력 받을 수도 있겠군요.
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] aaa5= new int[n];
//		System.out.println("배열길이: " + aaa5.length);
		
		//배열요소의 값들도 키보드로 입력 받아보기	
		int[] aaa6 = new int[3];
		
//		aaa6[0] = scan.nextInt();
//		aaa6[1] = scan.nextInt();
//		aaa6[2] = scan.nextInt();
//		
//		System.out.println(aaa6[0]);
//		System.out.println(aaa6[1]);
//		System.out.println(aaa6[2]);
		
		//반복문으로 요소 값들을 키보드로 입력해보기
		for(int i=0; i<aaa6.length; i++) {
			System.out.print("input: ");
			aaa6[i]= scan.nextInt();
		}
		
		for(int i=0; i<aaa6.length; i++) {
			System.out.println(aaa6[i]);
		}
		
		//int total = aaa6[0] + aaa6[1] +aaa6[2];
		int total=0;
		for(int i=0; i<aaa.length; i++) {
			total = total + aaa6[i];
		}
		
		System.out.println("총합: " + total);
		System.out.println("평균: " + (double)total/aaa6.length);
		
		
		
		int max;
//		if(aaa6[0] > aaa6[1] && aaa6[0]> aaa6[2]) max=aaa6[0];
//		else if(aaa6[1] > aaa6[2] ) max=aaa6[1];
//		else max = aaa6[2];

		max= aaa6[0];
//		if(aaa6[1]>max ) max=aaa6[1];
//		if(aaa6[2]>max ) max=aaa6[2];
		
		for(int i=1; i<aaa.length; i++) {
			if(aaa6[i]>max) max=aaa6[i];
		}
		System.out.println("최대값:" + max);
		
		
		//배열요소값 복사하기..에 대하여 생각해볼 내용둘
		int n1=10;
		int n2= n1;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		n2=30;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		int[] aa1= new int[] {10,20,30};
		int[] aa2= aa1; // 이건 주소를 복사 - 같은 배열 객체를 공유 
		
		aa2[0]=100;
		System.out.println(aa1[0]);
		System.out.println(aa2[0]);
		
		
		// 배열 객체를 복사하려면 원본 배열객체와 같은 크기를 가진 배열 객체를 새로 만들어 요소값을 복사해야됨.
		int[] aa3= new int[aa1.length];
//		aa3[0]=aa1[0];
//		aa3[1]=aa1[1];
//		aa3[2]=aa1[2];
		for(int i=0; i<aa3.length; i++) {
			aa3[i] = aa1[i];
			
		}
		
		for(int i=0; i<aa3.length; i++) {
			System.out.println(aa3[i]);}
		
		
		
		
		
		
}
		
	}
	



