import java.util.Scanner;

public class mail {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.next();
	char[ ] ch = s.toCharArray();
	int count=0;
for (int i = 0; i < ch.length; i++) {
	if((ch[i]>=48 && ch[i]<=57 )||(ch[i]>=65 && ch[i]<=90)||(ch[i]>=97&& ch[i]<=122)){		
	}
	else {
		count++;
	}
}

System.out.println(count);

}	
}

