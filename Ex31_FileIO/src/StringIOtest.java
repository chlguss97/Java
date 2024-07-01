import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringIOtest {

	public static void main(String[] args) {
		
		//문자단위로 데이터를 주고 받는 문자스트림[Reader, Writer] 알아보기
		
		//사용자 입력을 받아 그 데이터를 파일에 지속적으로 저장하는 프로그램
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.print("저장할 단어를 입력(exit를 입력하면 종료): ");
			String s= scanner.next();
			
			if(s.equalsIgnoreCase("exit")) {//대소문자 구분없이..
			System.out.println("입력을 죵료합니다"); 
			break;
			}
			
			//입력된 문자열 저장을 위해 File객체를 생성
			//목표위치: "본인의 프로젝트폴더/files/data/txt"
			File path= new File("files"); //폴더명만
			if(!path.exists()) path.mkdirs();
			
			//경로와 + 파일명.확장자
			File file = new File(path,"data.txt");
			
			//파일과 연결할 무지개 로드[ 스트림 ] -- 문자스트림 사용해보기
			//내 데이터를 파일쪽으로 내보내기 위한 스트림 [OutputStream --> Writer]
			//자바에서 data.txt 문서 사이에 데이터를 내보내는 무지개로드 객체 생성하기
			try {
				FileWriter fw= new FileWriter(file,true); //기본은 덮어쓰기모드. 이어붙이기를 하려면. 두번째 파라미터로 true
//				fw.write(s+"/n");
//				fw.flush();
//				fw.close();
				
				//FileWriter를 바로 사용하기 보다 좀더 편하게 사용하기 위해
				//보조문자스트림을 활용 - PrintWriter
				//문자스트림을 보조 문자스트림으로 변환하기;
				PrintWriter writer = new PrintWriter(fw);
				writer.println(s);
				writer.flush();
				writer.close(); //보조스트림을 닫으면 원래 스트림도 같이 close()됨.
				
				
			} catch (IOException e) {
				System.out.println("파일 쓰기 작업 중 오류가 발생했습니다.");
			}
			
			
		}//while...
		
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("저장된 파일의 데이터를 화면에 출력합니다");
		System.out.println("----------------------------");
		System.out.println();
		
		//한줄에 한 단어씩 저장되어 있으니 읽어글인 단어들을 묶어서 제어할 리스트(유동적 배열)
		ArrayList<String> datas= new ArrayList<String>();
		
		//읽어올 파일의 정보를 가진 File객체 생성
		File file= new File("files/data.txt");
		
		//파일의 데이터를 읽어오기 위한 무지개로드 생성
		try {
			FileReader fr= new FileReader(file);
			
			//int a= fr.read();//한 글자씩 읽기: 영어면 1byte, 한글 2~3 바이트가 읽어짐. 언어마다 알아서 바이트 수가 결정되어 읽어짐
			//System.out.println(a);// 유니코드값이 나오게 됨.
			//이런식으로 한글자씩 읽어와서 한줄 단어 문자열을 만드는 작업은 매우 번거로움
			
			
			//그래서 편하게 한줄씩 문자열을 읽어와주는 보조문자스트림을 사용 : BufferdReader
			BufferedReader reader= new BufferedReader(fr);
			String line =reader.readLine();
			while(line!=null) {
				datas.add(line); // 읽어온 한줄 단어를 ArrayList에 추가
				
				//다음줄 읽어오기
				line= reader.readLine();
				
			}//While..
			
			System.out.println("파일 읽기 종료!!");
			
			//ArrayList에 있는 단어 데이터를 차례로 출력하기
			for(int i=0; i<datas.size(); i++) {
				System.out.println(i+ " : " +datas.get(i));
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) {
			System.out.println("읽는 중에 오류가 발생했습니다");
			
		}
		
	}
	
}
