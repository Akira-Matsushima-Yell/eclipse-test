package practice;

import human.Doctor;
import human.Driver;
import human.Human;
import human.Programmer;
import human.Student;
import human.Teacher;

public class Chapter16 {
	public static void main(String[] args) {
		// 5つのサブクラスのインスタンスを生成
		Human[] humans = new Human[] {
				new Student(), 
				new Programmer(), 
				new Driver(), 
				new Teacher(), 
				new Doctor(), 
			};

		for (Human h : humans) {
			// workメソッドを呼び出す
			h.work();
		
            // instanceof演算子でProgrammerかどうか判定
			if (h instanceof Programmer ) {
                // キャストしつつメソッドを呼び出す
				((Programmer)h).study();
			}
		}
	}
}
