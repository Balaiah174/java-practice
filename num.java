public class num {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(n);
			n++;
		}
		n--;
	
	for(int j=2;j<=i;j++) {
		System.out.print(n);
		n--;
	}
	System.out.println();
	}
}
}

