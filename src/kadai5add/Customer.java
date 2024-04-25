package kadai5add;

public class Customer {
	int id;
	String name;
	
	Customer(){
		
	}
	Customer(String name){
		this.id=0;
		this.name=name;
	}
	Customer(int id,String name){
		this.id=id;
		this.name=name;
	}
	void showData(){
		System.out.println(id+"："+name);
	}

}
