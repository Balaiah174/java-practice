public class sumofevenoddddigits {
	public static void main(String[] args) {
		int num = 123456;
		int evensum = 0;
		int oddsum = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				evensum++;
			} else {
				oddsum++;
			}
			num /= 10;
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}
}