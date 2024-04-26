package p14;

public class Camera {

	private String maker;
	public Camera() {
		
	}
	public Camera(String maker){
		this.maker=maker;
	}
	
	public void setMaker(String maker) {
		this.maker=maker;
	}
	public void takePicture() {
		System.out.println("メーカー："+maker);
		System.out.println("撮影中です");
	}

}
