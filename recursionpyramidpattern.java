public class recursionpyramidpattern {
public static void main(String[] args) {
	int n =5;
	for (int i=0;i<=n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print(" ");
			
		}
		int length =2*i-1;
		for(int k=1;k<=length;k++) {
			if(k==1||k==length||i==n) {
				System.out.print("*");
				
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
