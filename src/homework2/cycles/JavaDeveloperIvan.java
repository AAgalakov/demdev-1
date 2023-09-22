package homework2.cycles;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит насчет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 */
public class JavaDeveloperIvan {

	private static final double FIRST_SALARY = 600;
	private static final int ADDITION_SALARY = 400;
	private static final int INTERVAL_ADDITION_SALARY = 6;
	private static final int MONTHLY_EXPENSES = 300;
	private static final double INVEST_PART = 0.1;
	private static final double INVEST_ADDITIONAL = 0.2;
	private static final int COUNT_OF_MONTH_PERIOD = 38;

	public static void main(String[] args) {

		calculateInvestPlan();
	}

	private static void calculateInvestPlan() {
		double bankAmount = 0;
		double brokerAmount = 0;
		double currentSalary = FIRST_SALARY;
		for (int i = 0; i < COUNT_OF_MONTH_PERIOD; i++){
			if (i % INTERVAL_ADDITION_SALARY == 0 && i != 0){
				currentSalary = calculateNewSalary(currentSalary);
			}
			double incomeFromPercent = calculateAddPercentBroker(brokerAmount);
			brokerAmount += incomeFromPercent;
			double amountToBrokerTransfer = calculateTransferForBrokerAmount(currentSalary);
			brokerAmount += amountToBrokerTransfer;
			bankAmount += currentSalary - MONTHLY_EXPENSES - amountToBrokerTransfer;
		}
		System.out.println(bankAmount);
		System.out.println(brokerAmount);
	}

	private static double calculateNewSalary(double currentSalary){

		return currentSalary + ADDITION_SALARY;
	}

	private static double calculateTransferForBrokerAmount(double salary){
		
		return salary * INVEST_PART;
	}

	private static double calculateAddPercentBroker(double brokerAmount){
		double income = brokerAmount * INVEST_ADDITIONAL;

		return brokerAmount + income;
	}
}
