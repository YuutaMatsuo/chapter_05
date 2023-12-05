
public class Sample1 {

	public static void main(String[] args) {
//		ユーザーとコンピュータで1対1のじゃんけんを行うことができるプログラムを作成せよ。
//		ユーザーの出す手はキーボードから入力させ、コンピュータの出す手はグー、チョキ、パーの
//		３つから毎回ランダムに１つを選択する。また、あいこの場合はもう一度じゃんけんをやり直す
//		こと。
		String[] rps = { "グー", "チョキ", "パー" };
		int player; // プレイヤーの選択した数値を受け取る
		int cpu; // ランダムに生成された数値を受け取る
		String playerHand; // グーチョキパーの文字列を受け取る
		String cpuHand; // グーチョキパーの文字列を受け取る

		do {
			System.out.println("じゃんけんゲームをはじめます。");
			System.out.print("出したい手を選んでください（1:グー 2:チョキ 3:パー）\n>>");

			// コンソールから入力を受け取る
			player = new java.util.Scanner(System.in).nextInt();
			playerHand = setHand(rps, player);
			// １～３の値をランダムに生成する
			cpu = new java.util.Random().nextInt(1, 3);
			cpuHand = setHand(rps, cpu);

			// じゃんけんの勝ち負け処理
			if (player == 1 && cpu == 2 || player == 2 && cpu == 3 || player == 3 && cpu == 1) {
				System.out.println("あなた:" + cpuHand + " わたし:" + playerHand);
				System.out.println("あなたの勝ちです！");

			} else if (player == 1 && cpu == 3 || player == 2 && cpu == 1 || player == 3 && cpu == 2) {
				System.out.println("あなた:" + cpuHand + " わたし:" + playerHand);
				System.out.println("ざんねん！あなたの負けです");

			} else {
				System.out.println("あなた:" + cpuHand + " わたし:" + playerHand);
				System.out.println("あいこですね。もう一回！");
			}
		} while (player == cpu);

	}

	// １～３の数値をグーチョキパーの文字列に変換する
	public static String setHand(String[] rps, int selectNum) {
		String hand = rps[selectNum - 1];
		return hand;
	}
}
