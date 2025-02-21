 class sumindex {
public static void main(String[] args) {
	int []num= {1,2,3,4,5,6,7,8,9};
	int sumodd=0;
	int sumeven=0;
	for(int i=0;i<num.length;i++) {
		if(i%2==0) {
			sumeven+=num[i];
		}else {
			sumodd+=num[i];
	}
	}
	System.out.println(sumodd);
	System.out.println(sumeven);
}
}