class pyramid {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1;
				 i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
