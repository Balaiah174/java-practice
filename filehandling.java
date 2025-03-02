import java.io.*;
import java.util.Scanner;

public class filehandling {

	public static void main(String[] args) throws IOException {
   File f=new File("C:\\Users\\Balaiah\\Desktop\\Example.txt");
   f.createNewFile();
   f.delete();
   FileWriter fw=new FileWriter(f);
   fw.write("This is the first file handling program");
   fw.close();
   Scanner s=new Scanner(f);
   while(s.hasNextLine()) {
	   String sc=s.nextLine();
	   System.out.println(sc);
   }
   }

}
