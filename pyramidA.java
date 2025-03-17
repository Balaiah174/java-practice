public class pyramidA {
	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= 5; i++) {
			char a = 'A';
			for (int j = i; j <= 5; j++) {
				System.out.print("   ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(a + " ");
				a++;
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
}
