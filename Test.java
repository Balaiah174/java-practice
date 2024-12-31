import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter your mock rating ");
		double mockRating =s. nextDouble();
		if(mockRating ==3.5)
		{
			System.out.println("you are eligible for placements");
		}
		else if(mockRating>3.5)
			
		{
			System.out.println("your also eligible for placements");
		}
		else
		{
			System.out.println("you are not eligible for placements");
		}
	}

}
  