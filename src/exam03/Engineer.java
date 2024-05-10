package exam03;

public class Engineer extends Employee{
	
	public String skill;

	Engineer(){
		
	}
	Engineer(String name,int age,String skill){
		setName(name);
		setAge(age);
		this.skill=skill;
	}


	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void introduce() {//オーバーライド
		super.introduce();//親のを呼び出し
		System.out.println(skill+"エンジニアです");
	}
	
	

}
