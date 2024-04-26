package p12;

public class Camera {

	private String maker;
	public Camera() {
		System.out.println("Cameraコンストラクタ1");
	}
	public Camera(int no){
		System.out.println("Cameraコンストラクタ２");
	}
	
	public void setMaker(String maker) {
		this.maker=maker;
	}
	public void takePicture() {
		System.out.println("メーカー："+maker);
		System.out.println("撮影中です");
	}

}
