public class triangleinverted {
	public static void printcol(int n){
		if(n==0) 
			return;
		System.out.print(" * ");
		printcol(n-1);
		
	}
	public static void printrow(int col,int row) {
		if(row==0)
			return;
		printcol(col);
		System.out.println();
		printrow(col+1,row-1);
	}
	public static void main(String[] args) {
		//printcol(5);
		printrow(1,5);
	}
}
