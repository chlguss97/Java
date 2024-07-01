import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOtest {

	
	public static void main(String[] args) {
		
		//파일 복사 프로그램 개발..
		
		//원본파일의 경로와 파일명.확장자를 문자열로 만둘어보기
		String srcPath="aaa.txt";
		
		//원본파일을 읽어들일 FileInputStream 객체를 생성
		try {
			FileInputStream fis = new FileInputStream(srcPath);//문자열로도 위치 지정이 가능함.
			
			//읽어들인 데이터를 저장할 파일의 위치경로 객체
			File dstPath = new File("D:/copy");
			if(!dstPath.isDirectory()); dstPath.mkdirs(); //경로가 없다면 만들어라
			
			//파일명.확장자와 경로를 결합한 File 객체 새로 생성
			File dstFile= new File(dstPath,"bbb.txt");
			
			
			//만들어진 목적지 파일까지 데이터를 내보내주는 무지개로드 생성
			FileOutputStream fos= new FileOutputStream(dstFile);
			
			
			//aaa.txt에서 데이터를 1바이트씩 읽어와서 곧바로 bbb.txt에 저장
			while(true) {
				byte b= (byte)fis.read();
				if(b==-1) break;
				
				fos.write(b); //1byte씩 쓰기
			}
			
			fos.flush(); //출력 스트림에 찌꺼기가 남아 있을 수 있어서 물내리기!!
			
			//모든 복사 작업이 종료되면 무지개 로드를 닫기
			fis.close();
			fos.close();
			
			System.out.println("복사가 완료 되었습니다");
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않아요");
		} catch (IOException e) {
			System.out.println("복사과정중에 오류가 발생했습니다.");
		} 
		
		
	}
}
