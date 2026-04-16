/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
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

		int SitoronPayment = (int) (250 * BuySitoron);
		int SyokoraPayment = (int) (280 * BuySitoron);
		int PisutaasyuPayment = (int) (320 * BuyPisutaasyu);
		int SitoronRatio = (int) (((double) SitoronPayment / SumPrice) * 100);
		int SyokoraRatio = (int) (((double) SyokoraPayment / SumPrice) * 100);
		int PisutaasyuRatio = (int) (((double) PisutaasyuPayment / SumPrice) * 100);

		System.out.println("本日のおすすめ商品です。\n\n"
				+
				"シトロン　　　\\250 ・・・　残り" + StockSitoron + "個\n"
				+ "シトロン　　　\\280 ・・・　残り" + StockSyokora + "個\n"
				+ "ピスターシュ　\\320 ・・・　残り" + StockPisutaasyu + "個\n\n");
		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計　　　\\" + SumPrice);
		System.out.println("\n内訳");
		System.out.println("シトロン　　　\\" + SitoronPayment + "・・・　" + SitoronRatio + "%");
		System.out.println("ショコラ　　　\\" + SyokoraPayment + "・・・　" + SyokoraRatio + "%");
		System.out.println("ピスターシュ　\\" + PisutaasyuPayment + "・・・　" + PisutaasyuRatio + "%");

	}
}
