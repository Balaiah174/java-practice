class smallestlargeest {
public static void main(String[] args) {

	int num=236547896;
	int small=9;
	int large=0;
	while(num>0){
		int digit =num%10;
		
		if(digit<small) {
			small=digit;
					}
		if(digit>large) {
			large=digit;
			
		}
		num=num/10;
		
	}
	
	System.out.println(small+" is a smallest number");
	System.out.println(large+" is a largeest number");
	
}
}