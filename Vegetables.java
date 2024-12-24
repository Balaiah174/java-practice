class Vegetable
{
void wash()
{
System.out.println("veg washed");
}
void chop()
{
System.out.println("veg chopped");
}
}
class potato extends Vegetable
{
void preparefries()
{
System.out.println(" preparing French fries");
}
}
class carrot extends Vegetable
{
void preparehalwa()
{
System.out.println("preparing halwa");
}
}
class main{
public static void main(String args [])
{
Vegetable V = new Vegetable();
potato  p = new potato();
carrot c = new carrot();
p. wash();
p.chop();
p.preparefries();
c.wash();
c.chop();
c.preparehalwa();
}
}
