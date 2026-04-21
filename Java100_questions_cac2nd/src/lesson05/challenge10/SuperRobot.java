package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SugoiRobot {
	String cook(String ingrediends) {
		return "高性能ロボットが高度な技術に裏打ちされた遠赤外線でとても美味しく焼き上げた" + ingrediends;
	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		SugoiRobot superRobot = new SugoiRobot();

		System.out.println("材料を入力＞");
		System.out.println("\n" + superRobot.cook(br.readLine()) + "\nができました");
	}

}
