import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		// 문자열 여러개를 저장하기 위한 배열 실습해보기
		
		// 기본형(primitive) 자료형 배열에 대해 다시 알아보기
		int a, b, c;
		a= 10;
		b=20;
		c=30;
		
		// 위 3개의 int 변수 사용을 배열로 만들어보기
		int[] aaa= new int[3];
		aaa[0]= 100;
		aaa[1]= 200;
		aaa[2]= 300;
		
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		System.out.println();
		
		
		//참조형(referenc) 자료형 배열에 대해 알아보기
		String s1, s2, s3;
		s1= new String("Hello");
		s2= new String("Nice");
		s3= "android"; //자동 new String()
		
		
		
		
		//위 3개의 String 참조변수 사용을 배열로 만들어보기
		String[] bbb= new String[3];
		bbb[0]= new String("Hello");
		bbb[1]= new String("Nice");
		bbb[2]= "android";
		
		System.out.println(bbb[0]);
		System.out.println(bbb[1]);
		System.out.println(bbb[2]);
		System.out.println();
		
		System.out.println("글자수: " + bbb[0].length());
		System.out.println("글자수: " + bbb[1].length());
		System.out.println("글자수: " + bbb[2].length());
	
	
	// 배열 객체를 만들면서 배열요소값들을 초기화 해보기
		int[] aaa2= new int[] {10,20,30};
		String[] bbb2= new String[] {new String("sam"), new String("robin"), new String("hong")};
		String[] bbb3 = new String[] {"sam","robin","hong"}; //자동 new String()
		String[] bbb4 = {"sam","robin","hong"}; //자동 new String[]
		
		for(int i=0; i<bbb4.length; i++) {
			System.out.println(bbb4[i]);}
			
			
	// 배열의 요소인 String참조변수를 이용하여 문자열 객체의 기능을 사용해보기
	System.out.println(bbb4[0].toUpperCase() );
	System.out.println(bbb4[1].charAt(2));
	System.out.println(bbb4[2].length());
	
	System.out.println(bbb4.length); // 배열의 요소 개수
	
	
	// 배열요소에 저장하는 문자열을 키보드로 입력받아보기
	Scanner scan= new Scanner(System.in);
	
	String[] names= new String[4];
	
	for(int i=0; i<names.length; i++) {
		System.out.print("이름입력: ");
		names[i]= scan.nextLine();
	}
	
	for(int i=0; i<names.length; i++) {
		System.out.println(names[i]); }
	
	
	
	
	
	
	
	
	
	
	
	
	
			
		
		
		
	
	
	
	}

}
