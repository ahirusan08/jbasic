package p13;

public class Camera {

	protected String maker;
	public Camera() {
		
	}
	public Camera(int no){
		
	}
	
	public void setMaker(String maker) {
		this.maker=maker;
	}
	public void takePicture() {
		System.out.println("メーカー："+maker);
		System.out.println("撮影中です");
	}

}
