public class removedulicates {
public static void main(String[] args) {
	String input =" balaiah yadav";
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
