import java.util.*;
     class Diamond {

	    public static void main(String[] args) {
	        int i, j, k;
	        System.out.println("Enter the number of rows for the diamond pattern:");
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int space = n - 1;

	        // Upper half of the diamond
	        for (j = 1; j <= n; j++) {
	            // Print leading spaces
	            for (i = 1; i <= space; i++) {
	                System.out.print(" ");
	            }
	            space--;

	            // Print stars
	            for (i = 1; i <= 2 * j - 1; i++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Move to the next line
	        }

	        // Lower half of the diamond
	        space = 1;
	        for (j = 1; j <= n - 1; j++) {
	            // Print leading spaces
	            for (i = 1; i <= space; i++) {
	                System.out.print(" ");
	            }
	            space++;

	            // Print stars
	            for (i = 1; i <= 2 * (n - j) - 1; i++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}



