import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//java에서 문자열은 객체로 관리함.
		// 객체 : Data + 기능(funtion:함수 --메소드)
		
		
		String str =new String("Hello");
		new String("Nice");
		
		
		
		int a,b;
		a=10;
		b=10;
		System.out.println(a==b); //값 비교
		System.out.println(a);
		System.out.println(b);
		
		String s1, s2;
		
		s1= new String("Hello");
		s2= new String("Hello");
		System.out.println(s1==s2); //주소끼리 비교
		
		System.out.println(s1); //자바에서 참조변수를 출력하면 주소가 나와야 하지만 그 참조변수가 참조하는 객체의 기능중, tpString()이라는 기능이 자동 발동됨.
		System.out.println(s2.toString() ); 
		
		
		//결론, 자바에서 문자열은 객체임.
		//객체는 new 키워드로 생성함, 그 객체룰 제어하는 참조변수가 필요함
		String ss = new String("Hello");
		System.out.println(ss.toString() ); // 객체의 정보출력기능 .toString()
		System.out.println(ss); //참조변수만 출력하면 자동 .toString()
		System.out.println("==========================================");
		System.out.println();
		
		// 문자열은 매우 자주 사용하는 데이터의 유형임. 매번 new String() 쓰기 귀찮음
		String sss="Nice"; //자동 new String("Nice");가 됨
		System.out.println(sss.toString()); //객체의 기능 사용
		System.out.println(ss.toUpperCase()); //객체의 기능 사용
		
		
		//  문자열 String 객체의 유용한 기능들(function:함수 ---method)
		String str1 = new String("Hello");
		
		
		//1. 글자수를 리턴해주는 기능
		
		int len = str1.length();
		System.out.println("글자수: " +len);
		
		
		//2. 문자열의 값 비교해주는 기능
		System.out.println(str1== "hello"); //주소 비교: false
		System.out.println(str1.equals("Hello")); // 값 비교: true
		System.out.println(str1.equals(new String("Hello")));
		String s3= new String("Hello");
		System.out.println(str1.equals(s3));
		System.out.println("hello".equals(str1));
		
		//2-1. 대소문자 비교
		System.out.println(str1.equals("hello"));
		System.out.println(str1.equalsIgnoreCase("hello")); // 대소문자 구분 무시
		
		
		//3. 문자열에서 한문자 (character) 뽑아오기
		char ch= str1.charAt(0);
		System.out.println(ch);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));
		//System.out.println(str.charAt(5)); //error
		
	
		for(int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
			
			
			}
		
		//한문자를 키보드로 받기
		Scanner scan= new Scanner(System.in);
		
		//String ssss= scan.next(); //문자열 입력
		//char c= ssss.charAt(0);
		//System.out.println("입력받은 한문자 + c");
		
		//4. 문자열안에서 특정 글자가 몇번째에 존재하는지.. 인덱스 번호를 리턴해줌.
		int index = str1.indexOf('H');
		System.out.println(index);
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.lastIndexOf('l'));
		System.out.println(str1.indexOf('G')); //못찾으면 -1
		
		System.out.println(str1.indexOf("el"));
		System.out.println(str1.indexOf("eo"));
		
		
		//5. 문자열안에 특정 문자열이 포함되었는지 여부를 리턴 {true/false}
		str1 = new String("Hello world! Hello android nice world");
		boolean bb= str1.contains("world");
		System.out.println(bb);
		System.out.println(str1.contains("Android"));
		
		//6. 문자열을 결합해서 새로운 문자열을 만들어 리턴해줌.
		String str2= str1.concat("nice android!");
		System.out.println("원본 str: "+ str1); //원본 불뵨
		System.out.println("새로운 str: " + str2);
		
		// 문자열을 결합하는 코드는 매우 빈번히 사용됨. 하지만 concat() 기능메소드는 잘 안씀.
		// 자바의 문자열 결합 연산자 +
		String str3 = str1 + "good android";
		System.out.println("str : " +str3);
		System.out.println("str: " + str1); // 원본 불변
		
		
		//7. 문자열이 특정 문자로 시작되는가? 여부를 리턴[true/false]
		System.out.println(str1.startsWith("Hello"));
		System.out.println(str1.startsWith("world"));
		
		//7-1. 문자열이 특정 문자로 끝나는가?
		System.out.println(str1.endsWith("world"));
		System.out.println(str1.endsWith("world!"));
		
		
		//8. 문자열을 모두 대문자로 ..단 원본은 불변
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		
		//9. 문자열의 앞뒤 공백문자를 제거!
		str1="  Hello      ";
		System.out.println(str1.equals("Hello"));
		System.out.println("["+str1+"]");
		System.out.println("["+str1.trim()+"]");
		System.out.println("["+str1+"]"); // 원본 불변
		System.out.println(str1.trim().equals("Hello"));
		
		//10. 문자열의 특정문자를 다른글자로 대체하여 새로운 문자열을 리턴해줌.
		str1= "Hello world! Hello android! nice world!"; // 자동 new String
		System.out.println(str1.replace('H', 'K'));
		System.out.println(str1.replace("android", "ios"));
		System.out.println(str1.replace("web", "good")); //찾은 글자 없으면.. 그냥 원본글씨 그대로 리턴
		
		// 이를 이용하여 비속어들을 걸러냄.
		System.out.println(str1.replace("fuck", "xxx"));
		str1= str1.replace("욕1", "ㅁㅁㅁ");
		str1= str1.replace("욕2", "ㅁㅁㅁ");
		str1= str1.replace("욕3", "ㅁㅁㅁ");
		
		// 문자열안에 있는 공백문자를 제거해야 하는 상황이 있다면
		System.out.println(str1.replace(" ", ""));
		
		//11. 문자열을 특정위치에서 잘라내기
		String sssss = str1.substring(6); // 6번 인덱스 위치부터 뒤에 문자열만 잘라서 리턴
		System.out.println(sssss);
		String sss2 = str1.substring(6,12); // 6번 인덱스부터 12번 전까지 (6~11)
		System.out.println(sss2);
		
		
		//12. 글씨의 대소비교 [이름순으로 정렬.. 같은 기능 만들때]
		char ch1 ='a';
		char ch2 = 'b';
		System.out.println(ch1> ch2);// 문자비교x, ASCII번호 비교
		
		String s5= "aaa";
		String s6 = "aab";
		
		//System.out.println(s5> s6); //error: 문자열은 주소라서 대소비교 x
		System.out.println(s5.compareTo(s6));
		
		//13. 문자열을 특정 글자 기준으로 여러개의 문자열로 분리해서 리턴해주는 기능
		str1="android,ios,windows,linux,world";
		String[] aaaa =str1.split(","); //리턴이 문자열 배열;
	    System.out.println(aaaa[0]);
	    System.out.println(aaaa[1]);
	    System.out.println(aaaa[2]);
	    System.out.println(aaaa[3]);
	    System.out.println(aaaa[4].length());
	    
	    
	    
	}	

}
