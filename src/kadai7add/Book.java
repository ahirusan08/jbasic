package kadai7add;

public class Book extends Item {
	private String author;

	public Book() {

	}
	public Book(String name,int price,String author) {
		super.setName(name);
		super.setPrice(price);
		this.author = author;

	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	
	void getInfo() {
		System.out.println(getName()+"/"+"(著：" + author+")/"+getPrice()+"円");

	}

}
