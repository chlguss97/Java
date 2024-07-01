import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) {
		
		//통신을 하려면 2가지 용어를 알아야 함.
		//1. IP주소    - 그 컴퓨터의 고유한 주소 (숫자) : 42억개
		
		//2. port 번호 - 그 컴퓨터안에서 프로그램 분류 번호(65천개): 0~1024까지는 사용하지 않는 것을 권장
		//비유) - 부산항(ip주소), 3번항구(Port번호)
		
		//서버용 프로그램을 작성
		
		
		try {
			//1. 서버 소켓을 만들어내는 작업
			ServerSocket serverSocket= new ServerSocket(10001); // port번호
			System.out.println("서버소켓이 생성되었습니다.");
			
			//2. 클라이언트의 접속 기다리기..
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept(); //여기서 커서가 대기함
			System.out.println(socket.getInetAddress().getHostAddress()+ " 클라이언트가 접속하셨습니다. ");
			
			
			//3. 클라이언트가 보낸 데이터를 읽어올 무지개로드 준비
			InputStream is= socket.getInputStream(); //바이트 스트림
			InputStreamReader isr = new InputStreamReader(is); // 바이트스트림 --> 문자스트림
			BufferedReader reader = new BufferedReader(isr);
			
			//String msg= reader.readLine();
			//System.out.println("받은 메시지 : "+ msg);
			
			//반복적으로 메시지를 수신하려면..
			while(true) {
				String msg= reader.readLine();
				if(msg==null) break; //상대방과의 스트림연결이 종료되면 null이 읽어짐
				
				System.out.println("받은 데이터:" + msg);
			}
			
			
			reader.close();
			System.out.println("서버 통신 종료!");
			
			
			
		} catch (IOException e) {
			System.out.println("통신작업 중 오류 발생: "+ e.getMessage());
		}
		
	}
	
}
