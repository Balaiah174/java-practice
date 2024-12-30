public class calculator {
void add(int a,int b)
{
	int c= a+b;
	System.out.println(c);
}
public static void main(String[] args) {
	calculator c= new calculator();
	int a,b;
	a=20;
	b=40;
	c.add(a, b);
}
}
