import java.io.IOException;

public class ScanEx {
	
	public static void main(String[] args) {
	
		int a;
		
		try {
			a= System.in.read();
			System.out.println(a+3);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
