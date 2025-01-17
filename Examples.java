

import java.util.Scanner;

 class Examples {
public static void main(String[] args) {
	int a,b,c;
	Scanner s= new Scanner(System.in);
	System.out.println("enter values for a,b,c");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if((a>b)&&(a>c)) {
	System.out.println(a+ " is big");
	}
	else if((b>a)&&(b>c))
	{
	
		System.out.println(b+ "is big");
	}
	else
	{
		System.out.println(c+ "is big");
		
	}
}
}
