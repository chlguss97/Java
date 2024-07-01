
public class Main {

	public static void main(String[] args) {
		
		//Object class : 자바의 모든 클래스의 부모 클래스(최상위 클래스)
		//Java언어에 존재하는 모든 클래스들은 extends의 명시여부와 상관없이
		//무조건 Object클래스를 상속받은 상태로 만들어짐
		Test t= new Test();
		System.out.println(t.a);
		System.out.println(t);//참조변수를 출력하면 주소가 나와야 하지만 참조하고 있는 객체의 .toString()기능이 발동함[객체의 정보를 문자열로 주는 기능]
		
		
		Test t2= new Test();
		System.out.println(t2.toString());
		
		
		
		//Object 클래스의 주요 메소드들
		//1.toString()	-- 객체를 소개하는 문자열을 리턴하는 메소드
		//2.equals(Object obj) -- 전달받은 obj객체와 같은 객체인지 여부 리턴[true, false]
		//3.hashcode() -- 객체의 해시코드를 리턴
		//4.getClass -- 클래스의 정보를 리턴
		//5.wait(), notify(), notifyAll() 	-- 이건 Thread라는 수업에서 소개할 예정

		
		//1.
		System.out.println(t.toString()); //원래 toString()기능 :[클래스명@해시코드(메모리주소)]
		String s= new String("Hello");
		System.out.println(s.toString()); //문자열객체의 데이터값이 나옴?? --오버라이드를 했다는 것임
		
		Nice n= new Nice();
		System.out.println(n.toString()); //오버라이드를 해서.. 멤버변수의 값이 출력되도록.. 개선
		
		
		//2. equals() : 같은 객체인지 여부를 리턴
		Test t3= new Test();
		Test t4= new Test();
		Test t5=t3;
		
		t3.a=10;
		t4.a=10;
		
		
		System.out.println(t3.equals(t4));
		System.out.println(t3.equals(t5));
		
		String s2= new String("Hello");
		String s3= new String("Hello");
		System.out.println(s2.equals(s3)); //오버라이드를 했다는 거임 - 멤버값을 비교하도록..
		
		
		Nice n2= new Nice();
		Nice n3= new Nice();
		
		n2.k=100;
		n3.k=100;
		
		System.out.println(n2.equals(n3));
		
		
		//3.해시코드 - 자바는 실제 메모리 주소를 알려주지않음. 그래서 대체하는 주소번호
		Test t6= new Test();
		System.out.println(t6.toString());
		
		int hash=t6.hashCode();; //해시코드 번호만 얻어오는 기능
		System.out.println(hash);//10진수..
		System.out.println(Integer.toHexString(hash));
		
		
		//4. getClass() -- 클래스의 정보를 가진 객체를 리턴
		Test t7= new Test();
		Class c=t7.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSuperclass());
		System.out.println(c.getPackageName());
		
		//모든 클래스는 결국 Object 클래스의 자식객체임..
		//다시말해 Object 참조변수는 모든 객체들의 부모참조변수임.
		Object obj; //모든 객체의 부모참조변수
		
		obj= new Test();
		obj= new Nice();
		obj= new String();
		obj= new java.util.Random();
		
		
		
	}
	
}
