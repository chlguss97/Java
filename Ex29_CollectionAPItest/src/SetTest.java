import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
		//Set 계열 - 저장된 순서 X, 인덱스번호X, 중복데이터 허용X
		
		//Set도 인터페이스임.
		//Set set= new Set(); //객체생성 불가 
		
		//Set 인터페이스를 구현한 하위클래스들을 사용
		//Set 계열 : HashSet, TreeSet, LinkedHashSet
		
		//HashSet<String> set= new HashSet<String>();
		//TreeSet<String> set= new TreeSet<String>(); //데이터의 오름차순으로.. 저장됨
		LinkedHashSet<String> set= new LinkedHashSet<String>(); //저장한 순서대로
		
		
		//요소추가
		set.add(new String("aaa"));
		set.add(new String("bbb"));
		set.add(new String("ffc"));
		set.add(new String("bbb"));//중복데이터
		set.add(new String("ccc"));
		set.add(new String("eee"));
		set.add(new String("ffc"));//중복데이터
		
		//요소개수
		System.out.println(set.size()+":"+set.toString());
		
		
		//요수 얻어오기
		//System.out.println(set.get()); //.get() 없음.. index 번호 없음
		
		//요소값을 순차적으로 얻어오기
		//방법1. for each
		for( String t: set) {
			System.out.println(t);
		}
			
		System.out.println();	
			
		//방법2. 반복자(iterator)
		Iterator<String> iterator =set.iterator();	
		while(iterator.hasNext()) {
			String s=iterator.next();
			System.out.println(s);}
			
		System.out.println();
		
		
		
		//방법3. set을 배열로 변환하여 접근하기
		String[] aaa= new String[set.size()]; //개수가 set과 같은 빈배열
		set.toArray(aaa);
	
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		
		
		
	}

}
