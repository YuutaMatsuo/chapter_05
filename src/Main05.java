
public class Main05 {
	public static void main(String[] args) {
		System.out.println("▼名前入力▼");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("▼挨拶入力▼");
		String hello = new java.util.Scanner(System.in).nextLine();

		String word = hello(name, hello); // 引数を１つ渡してて呼び出しをする
		System.out.println(word);

		System.out.println(calc(100, 50));
	}

	// helloメソッドを呼び出すときには「String型」の文字列が１つ必要となる
	public static String hello(String name, String hello) {

		System.out.println(name + "さん、" + hello);
		return "挨拶が完了しました";
	}

	// 数字(int型)を2つ受け取って、「足し算をした結果の数値」を戻り値として返すcalcメソッド
//		public static int calc(int a,int b) {
//			int sum = a + b;
//			return sum;
//		}

	public static String calc(int a, int b) {
		return "a + b =" + (a + b);
	}
}
