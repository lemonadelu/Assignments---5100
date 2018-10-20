package assignment5;

class Cookie extends DessertItem{
	  private int num;
	  private int price;
	  public Cookie(String name, int num, int price) {
		  super(name);
		  this.num = num;
		  this.price = price;
	  }
		  public int getCost() {
	  	  int cost = Math.round((float)num * price / 12);
	  	  return cost;
	  }
		  public String toString() {
			  StringBuilder receipt = new StringBuilder(num + " @ " + DessertShoppe.cents2dollarsAndCents(price) + " /dz."+ "\n" + getName());
			  String cost = DessertShoppe.cents2dollarsAndCents(getCost());
			  return receipt.toString() + "         " + cost;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
