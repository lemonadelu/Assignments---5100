package assignment5;

import java.util.ArrayList;

	 public abstract class DessertItem{
		String name;
		public DessertItem(String name) {
			if(name.length() <= 25)
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public abstract int getCost();
	
	static class DessertShoppe{
		public static final float taxRate = (float) (6.5 / 100.0);
		public static final String name = "     M & M Dessert Shoppe     ";
		public static final String line = "          -------------------------------------         ";
		

		public static String cents2dollarsAndCents(int cost) { 
			double money = cost / 100.0;
			String m = String.format("%.2f", money);
  	 	return m;
		}
	}
	

  public static class Checkout{
	  ArrayList<DessertItem> items = new ArrayList<>();
	  public int numberOfItems() {
		  return items.size();
	  }

	  public void enterItem(DessertItem item){
		  /*
		  DessertItem a = new Candy(item.getName(), 0, 0);
		  DessertItem b = new Cookie(item.getName(), 0, 0);
		  DessertItem c = new IceCream(item.getName(), 0);
		  DessertItem d = new Sundae(item.getName(), 0, null, 0);
		  */
		  items.add(item);
	  }
	  
	  public void clear() {
		  items.clear();
	  }
	  public int totalCost() {
		  int totalCost = 0;
		  for(DessertItem item: items) {
			  totalCost += item.getCost();
		  }
		  return totalCost;
	  }
	  public int totalTax() {
		  int totalTax = 0;
		  for(DessertItem item: items) {
			  totalTax += item.getCost() * DessertShoppe.taxRate;
		  }
		  return totalTax;
	  }
	  public String toString() {
		  System.out.println(DessertShoppe.name);
		  System.out.println(DessertShoppe.line);
		  for(DessertItem item: items) {
			  System.out.println(item.toString());
			  }
		  System.out.println("Tax       " + DessertShoppe.cents2dollarsAndCents(totalTax()));
		  System.out.println("Total Cost      " + DessertShoppe.cents2dollarsAndCents(totalTax()+totalCost()));
		  return "  ";
	  }
/*		 		  StringBuilder sb = new StringBuilder();
		  int i = 0;
		  while((i = sb.indexOf(" ",i + 25)) != -1) {
			  sb.replace(i, i+1, "\n");
		  }
		  
		  return sb.toString();
		  
	  }  */
	    public static void main(String[] args) {

	        Checkout checkout = new Checkout();

	        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
	        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
	        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
	        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));

	        System.out.println("Number of items: " + checkout.numberOfItems());
	        System.out.println("Total cost: " + checkout.totalCost());
	        System.out.println("Total tax: " + checkout.totalTax());
	        System.out.println("Cost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
	        System.out.println(checkout + "\n");

	        checkout.clear();

	        checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
	        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
	        checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
	        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
	        checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
	        checkout.enterItem(new Candy("Candy Corn", 3.0, 109));

	        System.out.println("Number of items: " + checkout.numberOfItems());
	        System.out.println("Total cost: " + checkout.totalCost());
	        System.out.println("Total tax: " + checkout.totalTax());
	        System.out.println("Cost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
	        System.out.println(checkout + "\n");
	    }
	}
}