 class Addition {
void add() {
	int a=10;
	int b=20;
	int c= a+b;
	System.out.println(c);
}
void add (int a) {
	int b,c;
	b=19;
	c=a+b;
	System.out.println(c);
}
void add(int a, int b) {
	int c;
	c= a+b;
	System.out.println(c);
}
void add(float a,float b) {
	float c;
	c=a+b;
	System.out.println(c);
}
void add(double a,double b) {
	double c;
	c=a+b;
	System.out.println(c);
}
void add (int a ,float b) {
	float c;
	c=a+b;
	System.out.println(c);
}
void add(float a,int b) {
	float c;
	c=a+b;
	System.out.println(c);
}
void add(int a,float b,double c) {
	double res;
	res=a+b+c;
	System.out.println(res);
}
public static void main(String[] args) {
	Addition a1=new Addition();
	a1.add();
	a1.add(10);
	a1.add(25,36);
	a1.add(20.f,36.f);
	a1.add(20.0,38.0);
	a1.add(50,69.0f);
	a1.add(21.0f,54);
	a1.add(45,23.0f,78.0);
	
}
}
