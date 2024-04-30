package p28;

public class Ogawa extends Object {
	int data;
	
	Ogawa(int data){
		this.data=data;
	}
	public boolean equals(Object obj) {
		Ogawa a=(Ogawa)obj;
		
		if(this.data==a.data) {
			return true;
		}
		
		return true;
	}
}
