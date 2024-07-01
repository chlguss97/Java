import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassTest {
	
	public static void main(String[] args) {
		
		//Collections 클래스의 static 메소드 중에서 유용한 2개
		//1) Collections.sort()
		//2) Collections.shuffle()
		
		ArrayList<String> datas= new ArrayList<String>();
		
		datas.add("Nice");
		datas.add("World");
		datas.add("Good");
		datas.add("bad");
		datas.add("Ios");
		datas.add("Android");
		datas.add("Hello");
		
		System.out.println(datas.toString());
		
		
		//리스트의 요소순서를 정렬해주는 기능
		Collections.sort(datas);
		System.out.println(datas.toString());
		
		//리스트 요소의 순서를 뒤섞어 주는 기능
		Collections.shuffle(datas);
		System.out.println(datas.toString());
		
		
	}

}
