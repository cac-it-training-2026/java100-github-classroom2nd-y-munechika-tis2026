package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鶯谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };
		boolean[] status = new boolean[stations.length];

		System.out.println("※※※ 山手線ゲーム ※※※\n\n　　　ゲームスタート！\n");

		for (int stage = 0; stage <= stations.length; stage++) {
			if (stage < stations.length) {
				String input = reader.readLine();

				boolean existsFlag = false;

				for (int i = 0; i < stations.length; i++) {
					if (stations[i].equals(input)) {
						if (status[i] == true) {
							break;
						} else {
							status[i] = true;
							existsFlag = true;
							break;
						}
					}
				}

				if (existsFlag == false) {
					System.out.println("あなたの負けです！");
					break;
				}
			} else {
				System.out.println("あなたの勝ちです！");
				break;
			}
		}
	}

}
