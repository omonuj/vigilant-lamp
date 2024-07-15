public class PrintTable {
	public static void main(String [] args) {
	
		System.out.printf("%-5s %-5s %-10s%n", "a", "b", "pow(a, b)");
		System.out.println("-------------------");

		for (int a = 1; a <= 5; a++) {
			int b = a + 1;
			double powValue = Math.pow(a, b);
			int intPowValue = (int) powValue;
		System.out.printf("%-5d %-5d %-10d%n", a, b,intPowValue);

		} 
	}
}