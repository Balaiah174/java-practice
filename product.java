public class product {
private String productid;
private String name;
private int quantity;
private double price;
public product(String productid,String name,int quantity,double price) {
	this.productid=productid;
	this.name=name;
	this.quantity=quantity;
	this.price=price;
}
public int getquantity() {
	
	return quantity;

}
public void setquantity(int quantity) {
	if(quantity>100 && quantity<200) {
	this.quantity = quantity;
}
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price>100 && price<1000) {
		
	
	this.price = price;
	}
}
public String getName() {
	return name;
}
public void setProductid(String productid) {
	this.productid = productid;

}
public void display() {
	System.out.println("productid:"+productid+"name:"+"quantity:"+quantity+"price:"+price);
}
public String getproductid() {
	return productid;
}
public void setname(String string) {
this.name=string;	
}
}
public class pmain {
public static void main(String[] args) {
	product  p=new product("bbbb","balaiah" , 120, 130);
	p.setquantity(150);
System.out.println(p.getquantity());
p.setname("balaiah yadav");
System.out.println(p.getName());
p.setProductid("zzzz");
System.out.println(p.getproductid());
p.setPrice(1000.00);
System.out.println(p.getPrice());
	
}
}
