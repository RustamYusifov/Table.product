package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table {
	public List<Product>pr = new ArrayList<Product>();
		public void add(Product newProduct){
			pr.add(newProduct);
		}
		public int count(){   	
			return pr.size();
		}
		public Product get(int index){
			
			return pr.get(index);
		}
		public void sortByCost(){
		
			Collections.sort(pr);    
		}
				public void print(){
			for(Product a:pr)
				System.out.println(a);
		}
	

}
