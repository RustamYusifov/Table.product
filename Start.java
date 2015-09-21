package test;
import java.util.Scanner;


public class Start {
	public static void main(String [] args) throws java.io.IOException{
		String input="";
		//char choice;
		Fruit fr1=new Fruit();
		Vegetables ve1 = new Vegetables();
		System.out.println(fr1.toString());
		System.out.println(ve1.toString());
		Fruit fr2 = new Fruit("apricot" ,12.23, "Argentina", "20 days"  );
		Vegetables ve2= new Vegetables("cucumber" ,01.20, "Russia", "10 days"  );
		System.out.println(ve2.toString());
		System.out.println(fr2.toString());
	Fruit.averagePrice();
	Vegetables.averagePrice();
	System.out.println("\nContainer:");
	Table t = new Table();
	t.add(ve1);
	t.add(fr1);
	t.add(ve2);
	t.add(fr2);
	System.out.println("1 index of  " + t.get(1));
	t.print();
	System.out.println("\nAfter Sorting:");
	t.sortByCost();
	t.print();
	Scanner scan = new Scanner(System.in);
   do{
		
		System.out.println("\nChoice value:");
		System.out.println("Fruit:");
		System.out.println("Vegetables:");
		input=scan.nextLine();
		if(input.equals("Vegetables")){
			System.out.println("You'r choise is - Vegetables");
		}else if(input.equals("Fruit")){
			System.out.println("You'r choice is - Fruit");
		}else {			
			System.out.println("please, try again");
		//System.exit(0);
			return;
	}
		}while(input==null);
	     
		//choice=(char)System.in.read();
//	}while(choice<'1'||choice >'2');
//	switch(choice){
//	case '1':
//		System.out.println("You'r choice is - Fruit");
//		break;
//	case '2':
//		System.out.println("You'r choice is - Vegetables");
//		break;
				
	//		}
	
	System.out.println("Please enter the name");
	String s1=scan.next();
	System.out.println("Please enter the country:");
	String s2=scan.next();
	System.out.println("cost:");
	String s3=scan.next();
	System.out.println("table of product: "+ input +  "Name of product: " + s1+" Country: "  + s2+" Cost: " + s3);
	
	
}
}

