public class squarepatternrecurssion {
	public static int fact(int a) {
		if(a==1) 
			return 1;
		
			return a*fact(a-1);
	}
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
	printrow(col,row-1);
}
public static void main(String[] args) {
	System.out.println("============");
	//printcol(5);
	printrow(5,5);
}
}
