import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//Map : 키-벨류 쌍 으로 데이터를 저장하는 방식
		//인덱스번호 대신에 식별자를 사용하는 방식
		
		//Map도 인터페이스임. 객체생성 불가
		//Map map= new Map(); 
		
		//Map 인터페이스를 구현한 하위 클래스를 사용
		//Map 계열 : HashMap, TreeMap, LinkedHashMap, HashTable
		
		//<키 타입, 벨류 타입>
		//HashMap<String, String> map= new HashMap<String, String>();
		//TreeMap<String, String> map= new  TreeMap<String, String>(); //키값에 대한 오름차순으로 저장
		LinkedHashMap<String, String> map= new LinkedHashMap<String, String>(); //저장된 순서대로
		//Hashtable<String, String> map= new Hashtable<String, String>(); //HashMap과 비슷하지만 동기화 처리가 되어 있음
		
		System.out.println("요소개수: "+ map.size());
		
		//요소 추가
		map.put("Name", "sam"); //(key,value)
		map.put("Id", "abcd");
		map.put("PW", "1234");
		map.put("kkk", "sam"); //중복된 value 사용
		map.put("kkk", "hong"); //중복된 key 사용 -요소추가가 아니라.. 값 변경
		
		System.out.println("요소개수: "+ map.size());
		
		
		
		//요소 얻어오기
		System.out.println(map.get("Name"));
		System.out.println(map.get("Id"));
		System.out.println(map.get("PW"));
		System.out.println(map.get("ID")); //대소문자 구별함 - 못찾으면 null
		System.out.println(map.get("kkk"));
		
		//요소 제거하기
		map.remove("kkk"); //식별자로 대상을 선택
		System.out.println("요소개수: "+ map.size());
		System.out.println();
		
		//순차적으로 요소 얻어오기
		//for문 안됨. index가 없어서. for each 문법도 에러
		//방법1.
		//일단, Map에서 Key들만 뽑아와야 함.
		Set<String> keys= map.keySet();
		for(String k: keys) {
			System.out.println(k+":" + map.get(k));
		}
			
			
		//방법2. Map 객체의 요소타입인 Entry를 Set으로 얻어오기
		Set<Entry<String, String>> entries =map.entrySet();
		for(Entry<String, String> e: entries) {
			System.out.println(e.getKey()+" - " +e.getValue());
		}
			
	}
		
		
		
	
}
