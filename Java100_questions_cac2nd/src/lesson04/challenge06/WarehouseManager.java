/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに重複チェックおよび値の代入処理を記述する
		int[] ABKosanArray = new int[5];
		int intputNum = 0;
		boolean loopFlag = false;
		for (int i = 0; i < 5; i++) {
			do {
				loopFlag = false;
				intputNum = (int) (Math.random() * 10 % 5) + 1;
				for (int content : ABKosanArray) {
					if (content == intputNum) {
						loopFlag = true;
						break;
					}
				}
			} while (loopFlag == true);
			ABKosanArray[i] = intputNum;
		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに値の入れ替え処理を記述する
		boolean exchange13Flag = false;
		boolean exchange24Flag = false;
		for (int i = 0; i < 5; i++) {
			if (exchange13Flag == false && ABKosanArray[i] == 1) {
				for (int j = 0; j < 5; j++) {
					if (ABKosanArray[j] == 3) {
						ABKosanArray[j] = 1;
					}
				}
				ABKosanArray[i] = 3;
				exchange13Flag = true;
			} else if (exchange24Flag == false && ABKosanArray[i] == 2) {
				for (int j = 0; j < 5; j++) {
					if (ABKosanArray[j] == 4) {
						ABKosanArray[j] = 2;
					}
				}
				ABKosanArray[i] = 4;
				exchange24Flag = true;
			}
		}

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
