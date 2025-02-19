class removedulicates {
public static void main(String[] args) {
	String input =" programming";
	String result = " ";
	boolean[] seen = new boolean[256];
	for (char c: input.toCharArray()) {
		if(!seen[c]) {
			result+=c;
			seen[c]=true;
		}
	}
	System.out.println(result);
	
}
}
