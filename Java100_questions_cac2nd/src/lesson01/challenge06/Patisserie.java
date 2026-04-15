/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		NumSitoron = NumSitoron - BuySitoron;
		NumSyokora = NumSyokora - BuySyokora;
		NumPisutaasyu = NumPisutaasyu - BuyPisutaasyu;

		System.out.println("本日のおすすめ商品です。\n\n"
				+
				"シトロン　　　\\250 ・・・　残り" + NumSitoron + "個\n"
				+ "シトロン　　　\\280 ・・・　残り" + NumSyokora + "個\n"
				+ "ピスターシュ　\\320 ・・・　残り" + NumPisutaasyu + "個\n\n");
	}
}
