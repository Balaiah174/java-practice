class longestword {
	public static void main(String[] args) {
		String input =" Ram and Raja are studying btech";
		String[]str=input.split("\\s+");
		String longestword=str[0];
		for(int i=1;i<str.length;i++) {
			if(str[i].length()>longestword.length()) {
				longestword=str[i];
				
			}
		}
		System.out.println(longestword);
	}
}
