package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.Exception.CriticalConditionException;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//* 保育士クラスに園児の体温を測る
	//* public void takeTemperature(NurserySchoolChild child)メソッドを追加し、
	//* もし体温が38度を超えている場合、独自に作成した例外クラスCriticalConditionExceptionを送出して
	//* メッセージ「【園児名】は重体です。すぐに病院に行ってください。」を出力してください。
	//* ※CriticalConditionExceptionクラスはlesson14.challenge04.Nurserry.Exceptionパッケージ内に作成してください。

	//ここに適切な処理を記述
	public void takeTemperature(NurserySchoolChild child) {
		try {
			if (child.getTemperature() >= 38) {
				throw new CriticalConditionException(child.getName() + "は重体です。すぐに病院に行ってください。");
			} else {
				System.out.println(child.getName() + "の体温は" + child.getTemperature() + "です。");
			}
		} catch (CriticalConditionException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
