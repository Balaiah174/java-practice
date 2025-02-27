public class half {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print((j % 2) + " ");
			}
			System.out.println();
		}
	}
}
