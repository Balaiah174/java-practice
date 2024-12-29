import java.util.Scanner;

public class Calculator1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value of a");
	int a = scan.nextInt();
	System.out.println("enter the value of b");
	int b = scan.nextInt();
	int c= a+b;
	System.out.println("the add is "+ c);
	int x = a-b;
	System.out.println("the sub is "+ x);
	int y = a*b;
	System.out.println("the mul is "+ y);
	int z = a/b;
	System.out.println("the div is "+ z);
	int d = a%b;
	System.out.println("the modul is "+ d);
}
}
