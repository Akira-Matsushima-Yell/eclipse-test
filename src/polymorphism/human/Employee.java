package polymorphism.human;

public class Employee extends Human{
	private String department;
	
	public Employee(String name, int age, String department ) {
		// スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.department = department;
		
	}
	
	// オーバーライドして、Emploneeクラスように処理を変更
	@Override
	public String getProfile() {
		String profile = "年齢は" + getAge() + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
		
	}
}
