
public class Main03 {
	public static void main(String[] args) {
		inputName();
		String name = new java.util.Scanner(System.in).nextLine();
		hello(name); //引数を１つ渡してて呼び出しをする

		
	}
	
	//helloメソッドを呼び出すときには「String型」の文字列が１つ必要となる
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	public static void inputName() {
		System.out.println("あなたの名前を入力してください");
	}
}
