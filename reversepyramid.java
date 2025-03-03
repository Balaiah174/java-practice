public class reversepyramid {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			int length = (2 * n) - (2 * i - 1);
			
			for (int k = 1; k <= length; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
