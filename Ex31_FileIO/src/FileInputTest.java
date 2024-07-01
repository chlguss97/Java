import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		
		//읽어올 파일의 정보를 가진 객체 생성
		File file=new File("aaa.txt"); //기본경로 : 현재 프로젝트 폴더
		
		//파일과 데이터를 읽어오기 위한 무지개로드(FileInputStream)를 생성
		
		try {
			//만약 해당하는 파일이 없으면 예외발생. 즉, 만들어주지 않음.
			FileInputStream fis= new FileInputStream(file);
			
			//스트림을 통해 파일 데이터를 byte 단위로 읽어오기
			//byte b= (byte)fis.read(); //파일에서 1byte를 읽어옴.
//			while(true) {
//				byte b=(byte)fis.read(); //파일에서 다음 1byte를 읽어옴
//				if(b==-1) break;
				
//				System.out.println(b+" : " +(char)b); //아스키 값이 나올것임
//				
//			}
			
			
			//위 방식은 아스키코드로 값을 읽기에 영문자가 아니면 올바로 읽어지지 않음.
			// 그래서 1byte씩 읽지 말고.. byte 배열로 한방에 받아서 문자열로 변환하여 출력해보기
			
			
			//일단, 빈 배열이 있어야 함. 데이터를 담을 만큼 큰 사이즈로..
			byte[] bytes= new byte[100];
			fis.read(bytes); //파라미터로 전달한 빈 배열객체에 바이트 값들을 넣어줌
			
			// 읽어온 byte[] 을 문자열 String 객체로 만들어서 출력해보기
			String s= new String(bytes);
			System.out.println(s);
			
			
			System.out.println();
			System.out.println("=======================================");
			System.out.println("파일로드가 완료되었습니다");
			
			//스크림 닫기
			fis.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
			
			
			
		} catch (IOException e) {
			System.out.println("파일 읽기 과정 중 오류가 발생했습니다.");
		}
	}
	
}
