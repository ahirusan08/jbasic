package kadai6;

public class BookAction1 {

	public static void main(String[] args) {
		Book b1=new Book();
		b1.setName("走れメロス");
		b1.setPrice(450);
		b1.setAuthor("太宰治");
		b1.showInfo();
		
		System.out.println("---");
		
		Item i1=new Book();
		Book bi1=(Book)i1;
		i1.setName("シャーロックホームズ");
		i1.setPrice(600);
		bi1.setAuthor("コナン・ドイル");
		i1.showInfo();
	}

}
