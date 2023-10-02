package homework4.atm.atmclasses;

public class Atm  {

	private int fiftyNotes;
	private int twentyNotes;
	private int tenNotes;

	public Atm(int fiftyNotes, int twentyNotes, int tenNotes) {
		this.fiftyNotes = fiftyNotes;
		this.twentyNotes = twentyNotes;
		this.tenNotes = tenNotes;
	}

	public void putMoney (int summa){
		if (summa % 10 != 0){
			throw new IllegalArgumentException("Некорректная сумма");
		}
		int inputFiftyNotes = summa / 50;
		fiftyNotes += inputFiftyNotes;
		summa -= inputFiftyNotes * 50;
		int inputTwentyNotes = summa / 20;
		twentyNotes += inputTwentyNotes;
		summa -= inputTwentyNotes * 20;
		tenNotes += summa / 10;
	}

	public boolean getMoney (int summa){
		if (summa > countOfMoney()){
			return false;
		}
		if (summa % 10 != 0){
			return false;
		}
		correctCountOfNotes(summa);
		return true;
	}

	private void correctCountOfNotes(int summa) {
		int countOfFiftyNecessary = summa / 50;
		if (fiftyNotes > countOfFiftyNecessary){
			fiftyNotes -= countOfFiftyNecessary;
			summa -= countOfFiftyNecessary * 50;
		} else {
			summa -= fiftyNotes * 50;
			fiftyNotes = 0;
		}

		int countOfTwentyNecessary = summa / 20;
		if (twentyNotes > countOfTwentyNecessary){
			twentyNotes -= countOfTwentyNecessary;
			summa -= countOfTwentyNecessary * 20;
		} else {
			summa -= twentyNotes * 20;
			twentyNotes = 0;
		}

		tenNotes = tenNotes - summa / 10;
	}

	private int countOfMoney(){
		return 50 * fiftyNotes + 20 * twentyNotes + 10 * tenNotes;
	}

	@Override
	public String toString() {
		return "Atm{" + "fiftyNotes=" + fiftyNotes + ", twentyNotes=" + twentyNotes + ", tenNotes=" + tenNotes + ", всего " + countOfMoney() + "}";
	}
}
