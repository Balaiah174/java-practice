 class Anagram {
public static void main(String[] args) {
	String s ="cat".replaceAll("\\s", " ");
	String s1= "act".replaceAll("\\s", " ");
	int []count=new int[256];
	if(s.length()!=s1.length()) {
	System.out.println("not a anagram");
	return;
	
	}
	for(char c: s.toCharArray()) {
		count[c]++;
	}
	
	for(char ch:s1.toCharArray()) {
		count[ch]--;
	}
	for(int i=0;i<count.length;i++) {
		if(count[i]!=0) {
			System.out.println("not a anagram");
			return;
		}
	}
	System.out.println(" is a anagram");
	
}
}
