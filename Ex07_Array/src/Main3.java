
public class Main3 {
	
	public static void main(String[] args) {
		
		//다차원 배열 - 배열이 여러개 있는 배열
		
		//3개 반의 java성적을 저장하기 위한 배열 만들기
		int[] aa = new int[5]; //5명 학생
		int[] bb = new int[4]; //4명 학생
		int[] cc = new int[3]; //3명 학생
		
		aa[0]= 70;
		aa[1]= 70;
		aa[2]= 70;
		aa[3]= 70;
		aa[4]= 70;
	
		//2반 학생 데이터
		bb[0]= 60;
		bb[1]= 60;	
		bb[2]= 60;
	
	
	//만약.. 이런반이 10개반이면??
	// 배열참조변수 3개 요소를 가지는 2차원 배열을 만들기
		int[][] aaa= new int[3][];
		
		aaa[0]= new int[5];
		aaa[1]= new int[3];
		aaa[2]= new int[4];
		
		aaa[0][0]=10;
		aaa[0][1]=20;
		aaa[0][2]=30;
		aaa[0][3]=40;
		aaa[0][4]=50;

		aaa[1][0]=100;
		aaa[1][1]=200;
		aaa[1][2]=300;
		
		aaa[2][0]=1000;
		aaa[2][1]=2000;
		aaa[2][2]=3000;
		aaa[2][3]=4000;
		
		System.out.println(aaa.length);
		System.out.println(aaa[0].length);
		System.out.println(aaa[1].length);
		System.out.println(aaa[2].length);
		System.out.println();
		
		
		//2차원 배열 요소들의 값들 출력해보기.. -- 중첩 반복문 필요
		for(int i=0; i<aaa.length; i++) {
			for(int j=0; j<aaa[i].length; j++) {
				System.out.print(aaa[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println(); 
		
		
		
		int[][] bbb= new int [5][3];
		int[][] ccc= new int [][] {
			{10,20,30},
			{100,200},
			{1000,2000,3000,4000}
		};
		
		
		
		
		
		
	}

}
