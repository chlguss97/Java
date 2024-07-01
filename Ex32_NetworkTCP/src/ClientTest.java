import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		
		//클라이언트는 서버의 IP주소, Port번호를 알아야 접속할 수 있음.
		
		String serverIP= "172.30.1.58";
		
		//클라이언트 작업..
		
		
		try {
			//1. 서버와 연결하는 Socket객체 생성 (ip주소, port번호)
			Socket socket =new Socket(serverIP,10001);
			System.out.println("서버와 연결이 되었습니다");
			
			//2.데이터를 보내기위한 무지개로드 만들기
			//Network를 넘어가는 스트림은 해임달(socket) 객체가 필요함
			OutputStream os= socket.getOutputStream();
			//바이트스트림으로 문자열을 보내는 작업은 짜증나니.. 문자스트림으로 변환.. 더 나아가 보조문자스트림으로 변환하면 더 쉽게 코딩이 가능함.
			PrintWriter writer = new PrintWriter(os);
			System.out.println("스트림 연결하는 작업 성공!!.. 데이터 전송 가능 상태");
			
			//보낼 데이터를 키보드로 입력받기
			Scanner scanner = new Scanner(System.in);
			
			//System.out.print("보낼 데이터: ");
			//String message= scanner.nextLine();
			
			
			//반복적으로 데이터를 보내고 싶을때
			while(true) {
				System.out.print("보낼데이터 : ");
				String message= scanner.nextLine(); 
				
				if(message.equals("quit")) break;
				
				writer.println(message);
				writer.flush();
				
			}
			
			
			
			//3. 스트림릏 통해 데이터를 전송
			//writer.println(message);
			//writer.flush();
			
			writer.close();
			System.out.println("메세지 전송을 완료했습니다");
			
			
		} catch (UnknownHostException e) {
			System.out.println("서버주소를 찾을 수 없습니다");
			
			
		} catch (IOException e) {
			System.out.println("통신중 에러가 발생했습니다");
		}
		
		
	}
	
	
}
