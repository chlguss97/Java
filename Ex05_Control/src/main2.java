import java.util.Scanner;
public class main2 {

	
	public static void main(String[] args) {
		
		//강아지 키우기 게임
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("@강아지 키우기@");
		System.out.println("---메뉴---");
		System.out.println("1. 밥먹기");
		System.out.println("2. 산책하기");
		System.out.println("3. 목욕하기");
		System.out.println("---------");
		System.out.print("메뉴선택: ");
		
		int menu;
		menu = scan.nextInt();
		
		//메뉴선택값에 따른 처리...
		switch(menu) {
		case 1: 
			System.out.println("아구 맛있어!!");
			break;
			
		case 2:
			System.out.println("와~ 신난다~~");
			System.out.println("30분 더....");
			break;
			
		case 3:
			System.out.println("으아 짜증!!");
			break;
			
		default: 
			System.out.println("잘못");
		}
		
		
		
		
		
		
		
		
//		if(menu==1 ) {
//			System.out.println("아구아구.. 맛있다!!");
//		}else if(menu==2) {
//			System.out.println("와우~ 신난다~~");
//		}else if(menu==3) {
//			System.out.println("으아!! 짜증!!");
//			
//		}
//		
	}
}
