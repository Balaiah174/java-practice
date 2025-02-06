import java.util.Scanner;

 class primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int factorcount = 0;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {

				factorcount++;

			}
		}
		if (factorcount > 1) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is  a prime number");
		}
	}
}
