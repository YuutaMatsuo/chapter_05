
public class Test1 {

	public static void main(String[] args) {
//		（１）引数：long型	戻り値：long型
//		（２）引数：short型	戻り値：int型
//		（３）引数：double型	戻り値：double型
		long num1 = 100L;
		short num2 = 100;
		double num3 = 100.0;

		System.out.println(calcDivLong(num1));
		System.out.println(calcDivShort(num2));
		System.out.println(calcDivDouble(num3));

	}
	
	public static long calcDivLong(long x) {
		return x / 2;
	}
	
	public static int calcDivShort(short x) {
		return x / 2;
	}
	
	public static double calcDivDouble(double x) {
		return x / 2;
	}

}
