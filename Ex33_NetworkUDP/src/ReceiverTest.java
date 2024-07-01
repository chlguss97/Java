import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {
	
	public static void main(String[] args) {
		
		
		try {//1. Datagram(우편)을 받을 우체통 준비하기
			DatagramSocket socket = new DatagramSocket(10003);
			
			
			//2. 받은 우편물의 내용을 담을 빈 박스를 준비하기..
			byte[] buf= new byte[100]; //100칸짜리 빈 통...
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			System.out.println("메세지 전달을 기다립니다.");
			socket.receive(packet);//커서가 여기서 기다림..
			
			//메세지를 받으면 packet안에 있는 100칸짜리 빈 통(buf)안에 데이터가 들어와 있음.
			
			//byte[](buf)의 데이터를 String으로 변환
			String message= new String(buf);
			System.out.println("받은 메시지: " + message );
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
