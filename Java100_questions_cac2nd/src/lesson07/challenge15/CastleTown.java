/**
 * 第7章 武士のお仕事
 *
 * 問題15 インターフェースを拡張する
 *
 * 国家老インターフェースを作る。
 *
 * 勘定奉行インターフェースと文化人インターフェースを継承した
 * 国家老インターフェースIChiefRetainer（メソッドvoid stay）を作り、
 * 藩士クラスに実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 * 城で留守番するよ～。
 *
 */

package lesson07.challenge15;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	public abstract void figure();
}

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	public abstract void flex();
}

//ここにIChiefRetainerインターフェースを記述
interface IChiefRetainer {
	public abstract void stay();
}

//ここにSamuraiクラスを記述
class Samurai {
};

//ここにRetainerクラスを記述
class Retainer extends Samurai implements IChiefTreasurer, ICelebrity, IChiefRetainer {
	@Override
	public void figure() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("藩の資産を計算するよ～。");
	}

	@Override
	public void flex() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("茶道を嗜むよ～。");
	}

	@Override
	public void stay() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("城で留守番するよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer retainer = new Retainer();
		retainer.figure();
		retainer.flex();
		retainer.stay();
	}
}
