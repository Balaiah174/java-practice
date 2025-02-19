 class charcount {
public static void main(String[] args) {
	String input ="programming";
	int[] count=new int[256];
	for(char c: input.toCharArray()){
		count[c]++; 
		 
	}

for(int i=0;i<count.length;i++) {
	if(count[i]>0) {
		System.out.println((char)i+"="+count[i]);
	}
}
}
}

