import java.util.Scanner;

public class Example1 {
public static void main(String[] args) {
	int n;
	Scanner s= new Scanner(System.in);
	System.out.println("enter value to n");
	n= s.nextInt();
	if(n%2==0)
	{
		System.out.println(n+ "is even number");
	}
	if (n%2!=0)
	{
		System.out.println(n+"is not an even number");
		
	}
	
			}
}
