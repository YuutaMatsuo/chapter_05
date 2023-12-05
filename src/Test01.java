
public class Test01 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 20;
		String str = "おはよう！";
		
		calc(num1,num2);
		
		msg(str);
		System.out.println(str);
		
		str = msg2(str);
		System.out.println(str);
		
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static void calc(int num1,int num2) {
//		System.out.println("num1 + num2 =" + (num1 + num2));
		
		num1 += 100;
		num2 += 100;
	}
	
	public static void msg(String str) {
		str = "こんにちは";
	}
	
	public static String msg2(String str) {
		str = "こんにちは";
		return str;
	}
}
