package homework4.atm;

import homework4.atm.atmclasses.Atm;

public class ATMRunner {

	public static void main(String[] args) {
		int count50 = 10;
		int count20 = 20;
		int count10 = 100;

		Atm atm = new Atm(count50, count20, count10);
		System.out.println(atm);

		atm.putMoney( 1300);

		System.out.println(atm);

		System.out.println("Получилось ли снять 2500" + atm.getMoney(2500));

		System.out.println(atm);

	}
}
