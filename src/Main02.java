
public class Main02 {
	public static void main(String[] args) {
		methodA();
//		methodB(); 
	}
	
	public static void methodA() {
		System.out.println("おはよう。");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("いい天気ですね。");
	}
	
	public static void methodC() {
		int age = 20;
		System.out.println(age + "歳です。");
	}
}
