
public class Main {

	public static void main(String[] args) {
		
		//예) 앱에 동물캐릭터 3종류(Dog, Cat, Pig)
		
		Dog d= new Dog();
		Cat c= new Cat();
		Pig p= new Pig();
		
		d.say();
		c.say();
		p.say();
		System.out.println();
		
		
		//만약 이런 동물캐릭터 여러마리면?
		//Dog가 5마리, Cat 10마리, Pig 4마리
		
		//참보변수 여러개를 일일이 만드는 것은 짜증!!
		//배열 : 같은 자료형 여러개 묶어서 만드는 문법
		//자바에서 배열을 객체로 만들어야함.
		//Dog참조변수 5개를 가진 배열 객체 1개를 생성
		Dog[] dogs =new Dog[5];
		dogs[0]= new Dog();
		dogs[1]= new Dog();
		dogs[2]= new Dog();
		dogs[3]= new Dog();
		dogs[4]= new Dog();
		
		
		
		dogs[0].say();
		dogs[1].say();
		dogs[2].say();
		dogs[3].say();
		dogs[4].say();
		
		
		//이런식으로 Cat, Pig도 배열로 만들면 되겠죠
		//근데.. 그런식이면. .캐릭터별로 배열이 따로 전재하기에..
		//전체 캐릭터를 제어하려면.. 일일이 배열들을 제어해야함.
		
		//그래서 캐릭터의 종류에 상관없이 모든 동물 객체들을 하나의 배열에 
		//묶어서 관리하면 보다 용이하게 제어하는 것이 가능해 짐.
		
		System.out.println();
		//Dog, Cat, Pig의 부모클래스가 될 Animal 클래스 설계
		//부모참조변수로 자식객체들을 참조할 수 있음
		Animal ani1= new Dog(); //업 캐스팅
		Animal ani2= new Cat();
		Animal ani3= new Pig();
		
		
		ani1.say();
		ani2.say();
		ani3.say();
		System.out.println();
		
		//동물캐릭터 5개..를 제어할 수 있는 배열객체 생성
		Animal[] anis=new Animal[5];
		System.out.println(anis[0]);
		System.out.println(anis[1]);
		System.out.println(anis[2]);
		System.out.println(anis[3]);
		
		//anis[0].say(); //error
		anis[0] = new Dog();
		anis[1] = new Dog();
		anis[2] = new Cat();
		anis[3] = new Pig();
		anis[4] = new Cat();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
