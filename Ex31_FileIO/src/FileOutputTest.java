import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	public static void main(String[] args) {
		
		//사용자로부터 데이터를 입력받아 File에 저장하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("저장할 데이터를 입력 :  ");
		//파일에 저장할 데이터
		String data= scanner.next();
		data= data+"\n";
		
		//데이터를 저장할 파일의 경로와 확당자를 관리해주는 객체 생성
		//별도의 경로를 지정하지 않으면 이 자바문서가 있는 프로젝트폴더가 기본경로가 됨
		File file= new File("aaa.txt");
		
		
		//******* 특정 경로 폴더에 파일 저장해보기 ***
		
		file= new File("kkk\\aaa.txt"); //""안에서 \역슬래시는 특수문자로 인식하여 2개를 써야 \역슬래시 1개로 인식함
		file= new File("kkk/aaa.txt"); //다른 운영체제까지 고려한다면 /슬래시가 적절함.
		
		//만얃 kkk라는 폴더가 없다면.. FileNotFound 예외가 발생함.
		//그래서 kkk라는 폴더가 있는지 확인하고.. 없다면 폴더를 프로그램으로 만들어야함.
		File path = new File("kkk");
		if(!path.isDirectory()) {
			path.mkdirs();
		}
		
		//경로와 파일명.확장자를 결합한 File객체를 생성
		file= new File(path,"aaa.txt");
		
		//특정 드라이브의 위치에도 저장 가능함
		path= new File("D:/files/kkk");
		if(!path.isDirectory()) {
			path.mkdirs();
		}
		
		//경로와 파일명.확장자를 결합한 File객체를 새로 생성
		file= new File(path, "aaa.txt");
		
		//*******************************
		
		
		//파일객체가 참조하는 경로의 파일에 데이터를 보내기 위해 무지개로드(Stream)가 필요함.
		//Stream 중에서 내보내는 방향의 스트림 - OutputStream
		
		//그 중에서도 파일에 내보내는 용도의 FileOutputStream 클래스를 객체로 생성
		
		try {
			//기본적으로는 덮어쓰기로 파일을 저장함. 혹시.. 이어붙이기를 하고 싶다면.. 두번째 파라미터로 true값을 전달
			FileOutputStream fos= new FileOutputStream(file,true); //해당 파일이 없으면 만들어 냄.
			
			//스트림을 통해 데이터를 파일에 작성(내보내기)
			//fos.write(65);// 바이트값 작성 - 대문자 'A'
			fos.write(data.getBytes()); //String -->byte[]로 변환하여 작성
			fos.flush(); //Stream 버퍼에 있는 찌꺼기가 남아있을 수 있어서 .. 물내리기
			
			//무지개로드를 닫아야 리소스낭비를 막을 수 있음.
			fos.close();
			
			System.out.println("파일저장에 성공!");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("쓰기작업 중 오류가 발생했습니다.");
		}
		
		
		
	}
	
	
}
