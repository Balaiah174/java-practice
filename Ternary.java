public class Ternary {
public static void main(String[] args) {
	int a=20;
	int b=30;
	int c=40;
	
	int res=((a>b)?(a>c)?a:c:(b>c)?b:c);
	System.out.println(res);
}
}
