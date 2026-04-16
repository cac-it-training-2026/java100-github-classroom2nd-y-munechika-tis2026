/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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

		System.out.println("シトロン　　　" + BuySitoron + "個");
		System.out.println("ショコラ　　　" + BuySyokora + "個");
		System.out.println("ピスターシュ　" + BuyPisutaasyu + "個");
		System.out.println("\nをお買い上げですね。\n承りました。");
	}
}
