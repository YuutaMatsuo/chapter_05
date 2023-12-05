
public class Main06 {
	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3 };
		printArray(numArray);// 配列numArrayを引数としてprintArrayメソッドを呼び出す(参照渡し)
		
		//本当に変化があるか確認
		for (int element : numArray) {
			System.out.println(element);
		}
	}

	//受け取った配列を1つずつ出力する
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
		
		//配列は参照型の為、メソッド内で変更を加えるとメインメソッドのnumArrayにも変更が加わる
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
}
