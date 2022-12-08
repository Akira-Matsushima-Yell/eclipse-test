package polymorphism.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age , int score ) {
		// スーパークラスのコンストラクタの呼び出し
		super(name, age);
		this.score = score;
	}
	
	//　オーバーライドして、Studentクラスように処理
	@Override
	public String getProfile() {
		String profile = "年齢は" + getAge() + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
	
}
