package exercise03.prob02;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double r) {
		rate = r;
	}

	public static double toDollar(double dollar) {
		return dollar / rate; 
	}

	public static double toKRW(double KRW) {
		return rate * KRW;
	}
}