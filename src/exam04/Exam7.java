package exam04;

import java.util.ArrayList;
import java.util.List;

public class Exam7 {

	public static void main(String[] args) {

		//Employeeクラスのオブジェクトを保存できるListを生成
		List<Employee> emplyees = new ArrayList<>();

		//「田中太郎、20歳」のEmployeeオブジェクトを生成し、Listに追加する
		emplyees.add(new Employee("田中太郎", 20));
		//「鈴木一郎、25歳、Java」のEngineerオブジェクトを生成し、Listに追加する
		emplyees.add(new Engineer("鈴木一郎", 25, "Java"));
		//「佐藤花子、30歳」のEmployeeオブジェクトを生成し、Listに追加する
		emplyees.add(new Employee("佐藤花子", 30));

		//拡張for文と、introduce()メソッドを利用して各オブジェクトの情報をすべて出力
		for (Employee e : emplyees) {
			e.introduce();
		}

	}

}
