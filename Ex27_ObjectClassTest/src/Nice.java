
public class Nice {
	
	 int k=100;
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "내 멤버변수는: " +k ;
	}

	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Nice n=(Nice)obj;
		 return k==n.k;
	}
	 
	 
}
