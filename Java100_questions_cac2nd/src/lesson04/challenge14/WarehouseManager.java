/**
 * 第4章 倉庫番のお仕事
 *
 * 問題14 各部対抗ブロックじゃんけん
 *
 * 今日はXO商事の年に一度の恒例行事、各部対抗ブロックじゃんけんの日です。
 * Yさんは東北支社のSさんと対戦することになっています。
 * ブロックじゃんけんのルールは下記の通りです。
 *
 * 1...5箱からなるコンテナを用意する。
 * 2...各箱にはグーブロック、チョキブロック、パーブロックのどれかを入れる。
 * 3...ただし上記三つのブロックの使用は、それぞれ2個までとする。
 * 4...対戦者は互いにオープンするブロックを決め、出たブロックでジャンケン勝負。
 * 5...4を5回繰り返し、勝ちが多かった方を最終的な勝者とする。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Yさん：
 *  よし、今日はがんばるぞ！
 *
 *  コンテナ1に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞3
 *
 *  コンテナ2に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞2
 *
 *  コンテナ3に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞2
 *
 *  コンテナ4に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞1
 *
 *  コンテナ5に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞3
 *
 *  1回戦
 *  Yさん：
 *  どの手を出そうかな～
 *
 *  Sさん：
 *  はやぐ決めれ！腹減ってしゃねてば
 *
 *  オープンするコンテナを決めてください＞2
 *
 *  Yさん：
 *  よし、2番コンテナだ！
 *
 *  Sさん：
 *  こっちは3番コンテナだべ！
 *
 *  審判：
 *  ではオープンしてみましょう。
 *
 *  審判：
 *  Yさん：チョキ VS Sさん：パー
 *  で、Yさんの勝ちです。
 *
 *  Yさん：
 *  やった勝ちだ！
 *
 *  Sさん：
 *  あー、もうやんだぐなっできた...
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  審判：
 *  対戦終了です。 結果は...
 *
 *  審判：
 *  Yさん：2勝1敗2分け
 *  Sさん：1勝2敗2分け
 *  で、Yさんの勝利です。
 *
 *  Yさん：
 *  まあ、そうなるよね。
 *
 *  Sさん：
 *  こっだなことがあっでいいんだべか！
 *
 * <1対戦ごとのじゃんけんでYさんが負けた場合の実行例>
 *  Yさん：
 *  次は勝つぞ！
 *
 *  Sさん：
 *  負けるわけねべ！
 *
 * <1対戦ごとのじゃんけんで引き分けた場合の実行例>
 *  Yさん：
 *  おしいな～
 *
 *  Sさん：
 *  実質おらの勝ちだべ。
 *
 * <最終判定でYさんが負けた場合の実行例>
 *  Yさん：
 *  負けちゃった。悔しいな～
 *
 *  Sさん：
 *  弱い者に勝っても、な～んも自慢になんねな。
 *
 * <最終判定で引き分けた場合の実行例>
 *  Yさん：
 *  ふ～。なんとか引き分けたか。
 *
 *  Sさん：
 *  次はたんげがんばるはんで、応援してけれな。
 *
 * <グーチョキパー以外の数値が入力された場合の実行例>
 *  Yさん：
 *  え～。そんな手ないよ。
 *
 *  コンテナ○に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞
 *
 * <その手が既に2回使用されていた場合の実行例>
 *  Yさん：
 *  ○○はもう使えません。(※○○にはグー、チョキ、パーの何れかが入る)
 *
 *  コンテナ○に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞
 *
 * <既にオープンしたコンテナが入力された場合の実行例>*
 *  Yさん：
 *  そのコンテナはもうオープンしちゃったよ。
 *
 * <存在しないコンテナが入力された場合の実行例>*
 *  Yさん：
 *  え～。そんなコンテナないよ。
 *
 */

package lesson04.challenge14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		String[] handArray = { "グー", "チョキ", "パー" };
		int winPoint = 0;
		int losePoint = 0;
		int drawPoint = 0;
		int blockCountY = 0;
		int blockCountS = 0;
		int scissorsCountY = 0;
		int scissorsCountS = 0;
		int paperCountY = 0;
		int paperCountS = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Yさん：");
		System.out.println("よし、今日はがんばるぞ！");
		int[] jankenArrayY = new int[5];
		int[] jankenArrayS = new int[5];

		//Yさんのコンテナにじゃんけんの手を入れる処理を記述する。
		int completeCount = 0;
		int hand = 0;
		String handString = "";

		while (completeCount < 5) {
			System.out.println("\nコンテナ" + (completeCount + 1) + "に入れるブロックを選択してください（1.グー、2.チョキ、3.パー）＞");
			handString = br.readLine();
			hand = Integer.parseInt(handString);

			switch (hand - 1) {
			case 0:
				if (blockCountY < 2) {
					jankenArrayY[completeCount] = 0;
					blockCountY++;
					completeCount++;
				} else {
					System.out.println("\nYさん：\nグーはもう使えません。");
				}
				break;
			case 1:
				if (scissorsCountY < 2) {
					jankenArrayY[completeCount] = 1;
					scissorsCountY++;
					completeCount++;
				} else {
					System.out.println("\nYさん：\nチョキはもう使えません。");
				}
				break;
			case 2:
				if (paperCountY < 2) {
					jankenArrayY[completeCount] = 2;
					paperCountY++;
					completeCount++;
				} else {
					System.out.println("\nYさん：\nパーはもう使えません。");
				}
				break;
			default:
				System.out.println("\nYさん：\nえ～。そんな手ないよ。");
				break;
			}
		}

		//Sさんのコンテナにじゃんけんの手を入れる処理を記述する。（ランダム）
		completeCount = 0;
		hand = 0;

		while (completeCount < 5) {
			hand = (int) (Math.random() * 10000 % 3);

			switch (hand) {
			case 0:
				if (blockCountS < 2) {
					jankenArrayS[completeCount] = 0;
					blockCountS++;
					completeCount++;
				}
				break;
			case 1:
				if (scissorsCountS < 2) {
					jankenArrayS[completeCount] = 1;
					scissorsCountS++;
					completeCount++;
				}
				break;
			case 2:
				if (paperCountS < 2) {
					jankenArrayS[completeCount] = 2;
					paperCountS++;
					completeCount++;
				}
				break;
			}
		}

		for (int count = 0; count < 5; count++) {

			System.out.println("\nYさん：");
			System.out.println("どの手を出そうかな～\n");

			System.out.println("Sさん：");
			System.out.println("はやぐ決めれ！腹減ってしゃねてば");

			int openNumY = 0;
			boolean opened = false;
			//Yさんのどのコンテナをオープンするか入力してもらう処理を記述する。
			while (opened == false) {
				System.out.println("\nオープンするコンテナを決めてください＞");
				String willNumString = br.readLine();
				int willNum = Integer.parseInt(willNumString);

				if (!(willNum == 1 || willNum == 2 || willNum == 3 || willNum == 4 || willNum == 5)) {
					System.out.println("\nYさん：\nえ～。そんなコンテナないよ。");
					continue;
				} else if (jankenArrayY[willNum - 1] == 9) {
					System.out.println("\nYさん；\nそのコンテナはもうオープンしちゃったよ。");
					continue;
				} else {
					openNumY = willNum - 1;
					opened = true;
				}

			}

			int openNumS = 0;
			opened = false;
			//Sさんのどのコンテナをオープンするか決定する処理を記述する。（ランダム）
			while (opened == false) {
				openNumS = (int) (Math.random() * 10000 % 5);
				if (jankenArrayS[openNumS] == 9) {
					continue;
				} else {
					opened = true;
				}
			}

			System.out.println("\nYさん：");
			System.out.println("よし、" + (openNumY + 1) + "番コンテナだ！\n");

			System.out.println("Sさん：");
			System.out.println("こっちは" + (openNumS + 1) + "番コンテナだべ！\n");

			System.out.println("審判：");
			System.out.println("ではオープンしてみましょう。\n");

			System.out.println("審判：");
			System.out.print("Yさん：" + handArray[jankenArrayY[openNumY]]);
			System.out.print(" VS ");
			System.out.println("Sさん：" + handArray[jankenArrayS[openNumS]]);
			System.out.print("で、");

			//1回ごとの勝敗判定およびメッセージの出力処理を記述する。
			int diff = (jankenArrayY[openNumY] - jankenArrayS[openNumS] + 3) % 3;
			switch (diff) {
			case 0:
				drawPoint++;
				System.out.println("引き分けです。");
				System.out.println("\nYさん：\nおしいな～");
				System.out.println("\nSさん：\n実質おらの勝ちだべ。");
				break;
			case 1:
				losePoint++;
				System.out.println("Sさんの勝利です。");
				System.out.println("\nYさん：\n次は勝つぞ！");
				System.out.println("\nSさん：\n負けるわけねべ！");
				break;
			case 2:
				winPoint++;
				System.out.println("Yさんの勝利です。");
				System.out.println("\nYさん：\nやった勝ちだ！");
				System.out.println("\nSさん：\nあー、もうやんだぐなっできた...");
				break;
			default:
				break;
			}

			jankenArrayY[openNumY] = 9;
			jankenArrayS[openNumS] = 9;

		}

		System.out.println("審判：");
		System.out.println("対戦終了です。 結果は...\n");

		System.out.println("審判：");
		System.out.println("Yさん：" + winPoint + "勝" + losePoint + "敗"
				+ drawPoint + "分け");
		System.out.println("Sさん：" + losePoint + "勝" + winPoint + "敗"
				+ drawPoint + "分け");
		System.out.print("で、");

		if (winPoint > losePoint) {
			System.out.println("Yさんの勝利です。\n");
			System.out.println("Yさん：");
			System.out.println("まあ、そうなるよね。\n");
			System.out.println("Sさん：");
			System.out.println("こっだなことがあっでいいんだべか！\n");
		} else if (winPoint < losePoint) {
			System.out.println("Sさんの勝利です。\n");
			System.out.println("Yさん：");
			System.out.println("負けちゃった。悔しいな～\n");
			System.out.println("Sさん：");
			System.out.println("弱い者に勝っても、な～んも自慢になんねな。\n");
		} else {
			System.out.println("引き分けです。\n");
			System.out.println("Yさん：");
			System.out.println("ふ～。なんとか引き分けたか。\n");
			System.out.println("Sさん：");
			System.out.println("次はたんげがんばるはんで、応援してけれな。\n");
		}
	}
}
