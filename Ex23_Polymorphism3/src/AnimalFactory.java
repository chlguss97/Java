
public class AnimalFactory {
	
	//동물 객체를 만들어서 리턴해주는 기능메소드 - 마치 자판기처럼	
	Animal makeAnimal(int n) {
		
		if(n==0) return new Dog();
		else if(n==1) return new Cat();
		else return new Pig();
	}

}
