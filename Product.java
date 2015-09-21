package test;

public abstract class Product implements Comparable<Product>{
	private String name;
	public String getName(){
		return name;
	}
    public void  setName(String name){
	this.name= name;
}
    private double cost;
    public double getCost(){
    	return cost;
    }
    public void setCost(double cost){
    	this.cost=cost;
    }
    public abstract String toString();
   
    public int compareTo(Product p) {
        if (this.cost < p.getCost())
          return -1;
        else if (this.cost == p.getCost())
            return 0;
        else
            return 1;
    }
	
    
}