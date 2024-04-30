package p22;

public class Start {

	public static void main(String[] args) {
		//Canon can =new Canon(); 抽象クラス同様。不可
		Canon[] list = {
				new Oku(),
				new Kudo()
		};

		for (Canon lists : list) {
			lists.work();
			lists.salary();
		}

	}

}
