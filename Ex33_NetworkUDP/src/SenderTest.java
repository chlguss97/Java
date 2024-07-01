import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderTest {
	
	public static void main(String[] args) {
		
		//UDP : User Datagram Protocol - 마치 편지 보내는 방식과 비슷
		
		
		try {//1. 우편보낼 우체통 만들기
			DatagramSocket socket = new DatagramSocket(10002);//port 번호
			
			//보낼 데이터
			Scanner scanner= new Scanner(System.in);
			System.out.println("보낼 데이터: ");
			String msg= scanner.nextLine();
				
			
			//2. 데이터(msg)를 우편으로 보내기 위해 우편상자(DatagramPacket)에 동봉, 그 상자에 받는 사람 주소(ip 주소,port 번호)
			InetAddress addr= InetAddress.getByName("172.30.1.58");
			DatagramPacket packet= new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
			
			//3. 우체통에 우편박스 넣기
			socket.send(packet);
			
			System.out.println("전송완료!!");
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
