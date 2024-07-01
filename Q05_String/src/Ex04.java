import java.util.Scanner;

public class Ex04 { 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a= new String();
		while(true) {
			System.out.println("이메일입력: ");
			a= scan.next();
			if(a.contains("@")) break;
			System.out.println("잘못 입력하셨습니다. @포함 메일서버주소까지 모두 입력하셔야 합니다");
			
		}
		String[] aa= a.split("@");
		
		
		System.out.println("입력된 메일주소명 :" + aa[0]);
		System.out.println("메일서버 이름 :" + aa[1]);
			
		}
		
		
	}

