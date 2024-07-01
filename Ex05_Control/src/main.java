import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		
		
//		System.out.println("더글로리를 시청하시겠습니다.");
//		
//		int grade = 19;
//		
//		
//		if(grade>=18) {
//			System.out.println("부모의 시청지도를 필요합니다.");
//			System.out.println("주의하세요.");
//			
//			System.out.println("input:");
//			int n =scan.nextInt();
//			System.out.println("n:" + n);
//		}
//		
//
//		
//		System.out.println("넷플릭스 시리즈를 즐겁게 시청하세요.");
		
		
		
		
		
		
//		
//		int age;
//		
//		System.out.print("나이입력: ");
//		age= scan.nextInt();
//		
//		if(age>=20) { 
//			System.out.println("환영합니다. 문나이트 입니다.");
//			System.out.println("즐거운 시간을 보내세요.");
//			
//			int num;
//			System.out.println("몇명이세요? ");
//			num= scan.nextInt();
//			System.out.println(num +"명 자리로 안내하겠습니다.");
//			
//		} else {
//			System.out.println("입장불가");
//			System.out.println("집에 가~");
//			
//			 if(age>18) {
//				 System.out.println("뒷문으로...");
//			 }
//		}
//		
//		System.out.println();
//		System.out.println("지금까지 문나이트 입장시스템이었습니다.");
		
		
		int grade;
		
		System.out.println("점수를 입력하면 학점을 계산해주는 프로그램입니다.");
		
		int score;
		
		System.out.print("점수 입력: ");
		score= scan.nextInt();
		
		System.out.println();
		
		if(score>= 90 && score<100) {
			System.out.println("A학점입니다.");
		}
//		else {
//			if(score>=80 && score<90 ) {
//				System.out.println("B학점입니다.");
//			} else {
//				if(score>=70 && score<80) {
//					System.out.println("C학점입니다. ");
//				} else { 
//					if(score>=60 && score<70) {
//						System.out.println("D학점입니다. ");
//					} else {
//							System.out.println("F학점입니다. ");
//					}
//				}
//			}
//		}
//		
		else if(score>=80) {
			System.out.println("B학점입니다. ");
		}else if(score>=70) {
			System.out.println("C학점입니다. ");
		}else if(score>=60) {
			System.out.println("D학점입니다. ");
		}else {
			System.out.println("F학점입니다. ");
		}
		
		
		
	}

}
