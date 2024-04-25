package kadai3;

public class Calculator {

	public static void main(String[] args) {
		
		int a =add(3,7);
		System.out.println(a);
		
		int b =sub(3,7);
		System.out.println(b);
		
		double c=avg(3,6);
		System.out.println(c);

	}
	
	static int add(int num1,int num2){
		return num1+num2;
	}
	
	static int sub(int num1,int num2) {
		return num1-num2;
	}
	
	static double avg(int num1,int num2) {
		return (num1+num2)/2.0;
	}
	
	

}
