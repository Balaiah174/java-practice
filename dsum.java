public class dsum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int start=sc.nextInt();
	int end= sc.nextInt();
	int sum= sc.nextInt();
	for(int i=start;i<=end;i++) {
		sum+=i;
	}
	System.out.println(sum);
			
}
}
