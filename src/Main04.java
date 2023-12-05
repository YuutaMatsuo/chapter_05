
public class Main04 {
	public static void main(String[] args) {
		System.out.println("▼名前入力▼");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("▼挨拶入力▼");
		String hello = new java.util.Scanner(System.in).nextLine();

		hello(name,hello); // 引数を１つ渡してて呼び出しをする
		hello(hello, name); //引数を渡す順番に気を付ける

	}

	// helloメソッドを呼び出すときには「String型」の文字列が１つ必要となる
	public static void hello(String name, String hello) {
		
		System.out.println(name + "さん、" + hello);
	}
}
