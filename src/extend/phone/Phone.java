package extend.phone;

	//Phoneインターフェイスの宣言
	public interface Phone {
		//フィールドの宣言（定数）
		int MAX_NUMBER_DIGITS = 11;
		//public abstractが自動で追加される（抽象メゾット）
		public void call(String number);
		
		// defaultメゾットの宣言
		default void powerOff() {
			System.out.println("電源を切ります。");
		}
}
