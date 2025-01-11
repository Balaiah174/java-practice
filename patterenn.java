

public class patterenn {
	public static void main(String[] args) {
	
int rows =5;
int k=  65;
for(int i=1;i<=7;i++) {
	for( int j=1;j<=(7-i);j++) {
		System.out.print( "  "+" ");
	}
	char c= (char)k;
	for(int j=1;j<=i;j++) {
		System.out.print(c+" ");
	c--;
	}
	System.out.println();
	k++;
}
}
}    