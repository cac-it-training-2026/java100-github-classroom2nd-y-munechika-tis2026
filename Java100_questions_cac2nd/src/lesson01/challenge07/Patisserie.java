/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int StockSitoron = 30;
		int StockSyokora = 30;
		int StockPisutaasyu = 30;

		System.out.println("たいへんお待たせしました。\n"
				+ "【ポエール・ネルメ】\n"
				+ "ただいまより開店です！！\n\n"
				+ "本日のおすすめ商品です。\n\n"
				+
				"シトロン　　　\\250 ・・・　残り" + StockSitoron + "個\n"
				+ "シトロン　　　\\280 ・・・　残り" + StockSyokora + "個\n"
				+ "ピスターシュ　\\320 ・・・　残り" + StockPisutaasyu + "個\n\n"
				+
				"それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.println("シトロン　>");
		String StrSitoron = reader.readLine();
		System.out.println("ショコラ　>");
		String StrSyokora = reader.readLine();
		System.out.println("ピスターシュ　>");
		String StrPisutaasyu = reader.readLine();

		double BuySitoron = Double.parseDouble(StrSitoron);
		double BuySyokora = Double.parseDouble(StrSyokora);
		double BuyPisutaasyu = Double.parseDouble(StrPisutaasyu);

		double TotalAmount = BuySitoron + BuySyokora + BuyPisutaasyu;
		int SumPrice = (int) ((250 * BuySitoron) + (280 * BuySyokora) + (320 * BuyPisutaasyu));

		System.out.println("シトロン　　　" + BuySitoron + "個");
		System.out.println("ショコラ　　　" + BuySyokora + "個");
		System.out.println("ピスターシュ　" + BuyPisutaasyu + "個");
		System.out.println("\n"
				+ "合計個数　　" + TotalAmount + "個\n"
				+ "合計金額　" + SumPrice + "円\n\n"
				+ "をお買い上げですね。\n承りました。\n");

		StockSitoron = (int) (StockSitoron - BuySitoron);
		StockSyokora = (int) (StockSyokora - BuySyokora);
		StockPisutaasyu = (int) (StockPisutaasyu - BuyPisutaasyu);

		System.out.println("本日のおすすめ商品です。\n\n"
				+
				"シトロン　　　\\250 ・・・　残り" + StockSitoron + "個\n"
				+ "シトロン　　　\\280 ・・・　残り" + StockSyokora + "個\n"
				+ "ピスターシュ　\\320 ・・・　残り" + StockPisutaasyu + "個\n\n");
	}
}
