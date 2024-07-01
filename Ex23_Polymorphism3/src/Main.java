import java.util.Random;

public class Main {
	
	
	public static void main(String[] args ) {
		
		//애니멀(Dog,Cat,Pig) 객체들을 만들어 주는 애니멀공장 객체 생성
		AnimalFactory factory = new AnimalFactory();
		
		
		 Animal ani = factory.makeAnimal(0); 
		 ani.say();
		 Dog dog=(Dog)ani;
		 dog.guardHouse();
		 
		 Animal ani2= factory.makeAnimal(1);
		 ani2.say();
		 
		 
		 
		 
		 Pig p = (Pig)factory.makeAnimal(2); //다운 캐스팅
		 p.say();
		 
		
		 
		 Dog d= (Dog)factory.makeAnimal(0);
		 d.say();
		 
		 Cat c= (Cat)factory.makeAnimal(1);
		 c.say();
		 System.out.println();
		 
		 
		 //랜덤한 정수값을 만들어주는 기능을 가진 Random 객체를 생성
		 Random rnd= new Random();
		 System.out.println();
		 
	 
		 
		 //응용실습 해보기..
		 //동물 캐릭터 5객체를 생성하여 제어하기..
		  Animal[] anis= new Animal[5];
		  for(int i=0; i<5; i++) {
			  int n=rnd.nextInt(3);// 0,1,2 중에 하나의 숫자로 랜덤하게 값을 주면 ..
			  anis[i]= factory.makeAnimal(n);
		  }
		 
		  //확인
		  for(int i=0; i<anis.length; i++) {
			  //모든 동물캐릭터가 가진 공통 기능메소드
			  anis[i].say();
		  
		  
		  //각 캐릭터의 고유기능메소드를 사용해보기
			  if(anis[i] instanceof Dog) {
			  Dog dd= (Dog)anis[i];
			  dd.guardHouse();
			  
			  }else if(anis[i] instanceof Cat) {
				  Cat pp=(Cat)anis[i];
				  pp.handleButler();
			  
			  }else if(anis[i] instanceof Pig) {
				  Pig pp=(Pig)anis[i];
				  pp.eatAndEat();
		  
			  
			  
		  }
		 
		  
		  
		  
		  
		  
		  
		 
	}
		  System.out.println();
		  //Animal aaa= new Animal(); //error - 추상 클래스는 객체생성이 불가능
		  //aaa.say();
		  
		  
		  
		  
		  
}
}
