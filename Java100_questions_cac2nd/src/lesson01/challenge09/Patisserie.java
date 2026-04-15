/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double AveragePrice = (double) SumPrice / TotalAmount;
		int PriceNextDay = (int) (AveragePrice - (AveragePrice % 10));

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
		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味　　・・・　" + SitoronRatio + "%");
		System.out.println("ショコラの味　　・・・　" + SyokoraRatio + "%");
		System.out.println("ピスターシュの味・・・　" + PisutaasyuRatio + "%");
		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + PriceNextDay + "です。");
	}
}
