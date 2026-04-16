/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int NumSitoron = 30;
		int NumSyokora = 30;
		int NumPisutaasyu = 30;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("たいへんお待たせしました。\n"
				+ "【ポエール・ネルメ】\n"
				+ "ただいまより開店です！！\n\n"
				+ "本日のおすすめ商品です。\n\n"
				+
				"シトロン　　　\\250 ・・・　残り" + NumSitoron + "個\n"
				+ "シトロン　　　\\280 ・・・　残り" + NumSyokora + "個\n"
				+ "ピスターシュ　\\320 ・・・　残り" + NumPisutaasyu + "個\n\n"
				+
				"それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.println("シトロン　>");
		String StrSitoron = reader.readLine();
		System.out.println("ショコラ　>");
		String StrSyokora = reader.readLine();
		System.out.println("ピスターシュ　>");
		String StrPisutaasyu = reader.readLine();

		int BuySitoron = Integer.parseInt(StrSitoron);
		int BuySyokora = Integer.parseInt(StrSyokora);
		int BuyPisutaasyu = Integer.parseInt(StrPisutaasyu);

		int TotalAmount = BuySitoron + BuySyokora + BuyPisutaasyu;
		int SumPrice = (250 * BuySitoron) + (280 * BuySyokora) + (320 * BuyPisutaasyu);

		System.out.println("シトロン　　　" + BuySitoron + "個");
		System.out.println("ショコラ　　　" + BuySyokora + "個");
		System.out.println("ピスターシュ　" + BuyPisutaasyu + "個");
		System.out.println("\n"
				+ "合計個数　　" + TotalAmount + "個\n"
				+ "合計金額　" + SumPrice + "円\n\n"
				+ "をお買い上げですね。\n承りました。");

	}
}