package test;

public class Vegetables extends Product {
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
public Vegetables(){
	this.setName("tomato");
	this.setCost(1.85);
	this.setCountryOfOrigin("Ukrain");
	this.setStorageLife("15 days ");
	sum++;
	totalPrice+=getCost();	
	}
public Vegetables(String name, double cost, String counteOfOrigin, String storageLife){
	this.setName(name);
	this.setCost(cost);
	this.setCountryOfOrigin(counteOfOrigin);
	this.setStorageLife(storageLife);
	sum++;
	totalPrice+=cost;
}
static public void averagePrice(){
	System.out.println("The average price of Vegetables " + totalPrice/sum);
}	
	@Override
	public String toString() {
		
		return "This Vegetables  called - " + getName()+"," + " his price = " + getCost()+"," + " country of origin is " + getCountryOfOrigin()
				+"," +" term storage " + getStorageLife();
	}
		
}
