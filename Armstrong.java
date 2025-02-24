import java.util.Scanner;

 class Armstrong {

	int num = 123;

	public static int countdigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}
		return count;

	}

		public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number");
           int number=sc.nextInt();
           boolean result=isArmstrong(number);
           if(result) {
        	   System.out.println("is Armstrong");
           }
           else {
        	   System.out.println("not ArmStrong");
           }

	}
}
