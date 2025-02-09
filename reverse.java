class reverse {
public static void main(String[] args) {
	int a= 12345;
	int result=54321;
	int sum=0;
	while(a>0) {
		int mod=a%10;
		sum=sum*10+mod;
		a=a/10; 
	}
	System.out.println(sum); 
}
}
