public class PrimeCheck {
public static void main(String[] args) {
	int num = 5;
	boolean isPrime = true;
	
	if (num < 2) isPrime = false;
	for ( int i= 2; i <= num / 2; i++)
	{
		if (num % i == 0) {
			isPrime = false;
			break;
		}
	}
	System.out.println(num +(isPrime ? " is Prime." : " is not prime."));
}
}
