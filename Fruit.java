package test;
public class Fruit extends Product {
static private double sum =0;
static private double totalPrice=0;

private String countryOfOrigin;
public String getCountryOfOrigin(){
	return countryOfOrigin;
}
public void setCountryOfOrigin(String countryOfOrigin){
	this.countryOfOrigin= countryOfOrigin;
}
private String storageLife;
public String getStorageLife(){
	return storageLife;
}
public void setStorageLife(String storageLife){
	this.storageLife=storageLife;
	}
public Fruit(){
	this.setName("pineapple");
	this.setCost(21.05);
	this.setCountryOfOrigin("Brazil");
	this.setStorageLife("2 month");
	sum++;
totalPrice+=getCost();	
}
public Fruit(String name, double cost, String counteOfOrigin, String storageLife){
	this.setName(name);
	this.setCost(cost);
	this.setCountryOfOrigin(counteOfOrigin);
	this.setStorageLife(storageLife);
	sum++;
	totalPrice+=cost;
}
static public void averagePrice(){
	System.out.println("The average price of Fruit " + totalPrice/sum);
}
	
	@Override
	public String toString() {
		
		return "This Fruit  called - "+ getName()+"," + " his price = " + getCost()+","+  " country of origin is " + getCountryOfOrigin()
			+","+" term storage " + getStorageLife();
	}
	
}
