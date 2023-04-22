public class Interest{
	public static void main(String[] args){
		//initialize year to 10;
		int year = 10;
		//initialize interest rate to 0.05
		double interestRate = 0.05;
		// intialize money in to 1000
		int money = 1000;
		// add one in to interest rate
		interestRate++;
		double interest = money;
		System.out.printf("%s %20s %n","year","Amount");
		for (int i = 1; i <= year;i++){
			interest *= interestRate;
			System.out.printf("%4d%20.2f%n", i,interest);
		}
	}

}
