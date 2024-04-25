package p03;

public class TV {
	int ch;
	
	void changeChannel(int c){
		ch=c;
	}
	void displayChannel() {
		System.out.println("チャンネル："+ch);
	}
}
