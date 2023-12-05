
public class Main07 {
	public static void main(String[] args) {
		int[] array = makeArray(6);
		
		for(int element : array) {
			System.out.println(element);
		}
	}
	
	//仮引数で「作りたい配列の要素数」を受け取る
	public static int[] makeArray(int size) {
		int[] newArray = new int[size]; //要望に応えて配列の要素数をsize個文作る
		for (int i = 0; i < newArray.length; i++) {//配列の要素に値を保持
			newArray[i] = i;
		}
		return newArray; //完成した配列を、メソッドの呼び出しもとに戻す（returnする）
	}
}
