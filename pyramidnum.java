public class pyramidnum {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("  ");
			}
			int n = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				int mid = (2 * i - 1) / 2;
				if (j <= mid) {
					System.out.print(n);
					n++;
				} else {
					System.out.print(n);
					n--;
				}
			}
			System.out.println();
		}
	}
}