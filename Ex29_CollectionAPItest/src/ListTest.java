import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.tree.VariableHeightLayoutCache;

public class ListTest {

	public static void main(String[] args) {
		
		//Collection 클래스들 : 자료구조를 구현한 Java API 클래스들 - 대량의 데이터를 관리
		
		//배열과 차이점.
		//배열은 데이터를 삽입,삭제하는 것이 매우 번거로움. 그리고 개수가 미리 정해져야함. 이건 불편

		//데이터의 동적 추가/삭제/삽입등을 편하게 코딩할 수 있는 기능을 가진 클래스들
		
		//컬렉션은 저장방식에 따라 크게 3가지 방식으로 분류함
		
		//1. List : 자료들이 저장된 순서대로 있음. 자동으로 부여된 인덱스번호로 요소를 구분함. 중복된 데이터의 저장도 가능함
		//2. Set  : 저장된 순서 X, 인덱스 번호 X, 중복된 데이터 허용 X
		//3. Map  : 저장된 순서 X, 인덱스 번호 대신에 식별자를 사용, 중복된 식별자는 허용X, 중복된 데이터는 허용O
	
	
		//가장 많이 사용될 List계열 부터 실습..
		//List는 인터페이스임. 즉, 직접 객체 생성이 불가능
		//List list= new List();
		
		
		//List 인터페이스의 추상메소드들을 구현한 하위 클래스들이 존재함.
		//List계열 : ArrayList, LinkedList, Vector
		
		//이중 가장 많이 사용되는 ArrayList 클래스를 사용해보기 
		
		ArrayList<String> list= new ArrayList<String>();
		
		//ArrayList 객체가 보유한 유용한 기능메소드들..
		
		//1. 요소의 개수
		System.out.println("요소의개수: "+ list.size());
		
		//2. 요소의 추가
		String s= new String("aa");
		list.add(s);
		list.add(new String("bb"));
		list.add("cc");//자동 new String
		
		System.out.println("요소의개수: "+ list.size());
		
		
		
		//3. 요소 얻어오기
		String ss= list.get(0);
		System.out.println(ss);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//System.out.println(list.get(3)); //에러..
		
		//4. 요소 삭제하기
		list.remove(1);
		System.out.println("요소의개수: "+ list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		//5. 특정 위치에 요소를 삽입하기
		list.add(1,"dd");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		//6. 요소를 삭제할때 인덱스번호가 아니라 참조변수의 주소값으로 제거 가능
		String s2= new String("Test");
		list.add(s2);
		System.out.println("요소의개수: "+ list.size());
		list.remove(s2);
		System.out.println("요소의개수: "+ list.size());
		
		//7. 요소 모두 지우기..
		list.clear();
		System.out.println("요소의개수: "+ list.size());
		
		
		//8. 리스트계열은 중복된 데이터의 저장을 허용함
		list.add("aa");
		list.add("aa");
		list.add("aa");
		System.out.println("요소의개수: "+ list.size());
		
		//9. 리스트안에 요소가 비어있는지 여부(true/false)를 알려주는 기능메소드
		//list.clear();
		System.out.println(list.size()==0);
		System.out.println(list.isEmpty());
		
		
		//10. 특정 데이터가 리스트안에 있는지 여부(boolean)
		System.out.println(list.contains("aa"));
		System.out.println(list.contains("bb"));
		
		//11. 한번에 여러요소들을(다른 리스트객체의 요소들) 추가하기
		list.clear();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//또 다른 리스트객체
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("kk");
		list2.add("ss");
		
		list.addAll(list2);
		System.out.println(list.toString()); //.toString()이 오버라이드 되어 있음. 요소값들이 [,,,]를 구분자로 하여 문자열로 리턴됨.
		
		//11.1 특정위치에 여러개 한번에 추가하기
		list.addAll(1, list2);
		System.out.println(list.toString());
		
		//12. 특정 요소들을 한번에 제거하기
		ArrayList<String> list3=new ArrayList<String>();
		//제거할 요소목록을 추가
		list3.add("aa");
		list3.add("kk");
		
		list.removeAll(list3);
		System.out.println(list); //자동 .toString
		
		
		//13. 특정 요소들만 남기고 나머지 모두 제거하기
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("bb");
		list4.add("cc");
		
		list.retainAll(list4);
		System.out.println(list);
		
		
		//14. 특정요소가 몇번째 index에 있는지를 알려주는 기능
		System.out.println(list.indexOf("cc"));
		System.out.println(list.indexOf("ee")); //못찾으면 -1
		
		
		//요소들을 순차적으로 접근하여 얻어오기..
		list.clear();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("aa");
		
		
		//방법1. for문 사용하기
		for(int i=0; i<list.size(); i++) {
			String t= list.get(i);
			
			System.out.println(t);}
			
			System.out.println();
			
		
		//방법2. 확장된 for문 [for each문]	
			for(String t : list) {
				System.out.println(t);
			}
			
			
		//방법3. iterator(반복자)를 이용하는 방법 ..Set에서 소개예정	
			
			
		//=================================================================
			
			
		// List계열의 하위 클래스 중 LinkedList
		// 문법적 사용모습이 거의 똑같음
		// ArrayList에 비해 요소의 삽입,삭제등이 빠름, 대신 특정 요소에 접근은 느림	
			
			
			LinkedList<String> aaa= new LinkedList<String>();
			System.out.println("요소 개수: "+ aaa.size());
			aaa.add("aaa");
			aaa.add("bbb");
			aaa.add("ccc");
			System.out.println(aaa.get(0));
			System.out.println(aaa.get(1));		
			System.out.println(aaa.get(2));

			aaa.remove(1);
			System.out.println("요소 개수: " + aaa.size());
			
		
			//요즘은 컴퓨터 성능이 좋아져서 차이가 거의 없음. 일반적으로 ArrayList를 선호함
			
			
			
			//마지막 Vector - 사용법 같음. ArrayList와 완전동작이 같음. [단, 동기화처리가 되어 있다는 차이만 있음]
			Vector<String> bbb= new Vector<String>();
			bbb.add("aaa");
			System.out.println(bbb.get(0));
			System.out.println(bbb.size());
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
