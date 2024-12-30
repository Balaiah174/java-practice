public class Mobile {
String name="vivo";
String color="purple";
void call()
{
	System.out.println("your getting  call");
}
void playmusic()
{
	System.out.println("your playing a music");
}
public static void main(String[] args) {
	Mobile m= new Mobile();
	System.out.println("your mobile name is "+ m.name);
	System.out.println("your mobile color is "+ m.color);
	m.call();
	m.playmusic(); 
}

}