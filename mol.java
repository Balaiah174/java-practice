public class mol {
int add( int a,int b) {
	return a+b;
}
int add( int a, int b, int c) {
	return a+b+c;
}
public static void main(String[] args) {
	maths m =new maths();
	System.out.println(m.add(3,4));
	System.out.println(m.add(4,5,6));
}
}
