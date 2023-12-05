
public class Main01 {
	
	public static void main(String[] args) {
		//メソッドの中にメソッドを定義することはできない
		//メソッドの中でメソッドを読み出しすることができる。
		hello();
		hello();
		
		for(int i = 0; i <= 9;i++) {
			hello();
		}
	}
	
	//メソッド名：hello　（メソッド名も必ず指定する）
	//戻り値の型：void　（戻り値の型は必ず指定する）
	//引数リスト：なし (書いても書かなくても動く）
	public static void hello() {
		System.out.println("こんにちは！");
		System.out.println("こんばんは！");
		System.out.println("おはよう！");
	}
	
//	hello(); //メソッドブロック外での呼び出し→NG！
}
//	hello(); //クラスブロック外での呼び出しは→NG！