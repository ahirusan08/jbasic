package kadai4add;

public class Customer {

	int id=0;
	String name="";

	void setData(String nameData) {
		name=nameData;
	}

	void setData(int idData, String nameData) {
		id=idData;
		name=nameData;
	}

	void showData() {
		System.out.println(id+"："+name);
	}

}
