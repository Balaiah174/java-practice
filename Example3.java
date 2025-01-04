import java.util.Scanner;

public class Example3 {
public static void main(String[] args) {
	int a,b;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the values for a,b");
	a= s.nextInt();
	b=s.nextInt();
	if(a<b)
	{
		System.out.println(a+ "a is big");
	}
	else
	{
		System.out.println(b+ "b is big");
	}
}
}
