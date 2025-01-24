 class practice010 {
	public static void main(String[] args) {
		int rows=5;
       int a=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print( a+" ");
			}
				
				if(a==1) {
		a--;
			}
				else {
			a++;	
			}
			
			
			System.out.println();
		}
	}
}
