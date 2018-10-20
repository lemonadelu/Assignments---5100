package assignment5;

class Sundae extends IceCream{
	  private int toppingCost;
	  private String toppingName;
	  public Sundae(String name, int cost, String toppingName, int toppingCost) {
			super(name, cost);
			this.toppingCost = toppingCost;
			this.toppingName = toppingName;
		}
	 /* public int getToppingCost() {
		  return getToppingCost();
	  }*/
		public int getCost() {
			return cost + toppingCost;
		}
		//int totalCost = getCost() + getToppingCost();
	public String toString() {
		StringBuilder receipt = new StringBuilder(toppingName + " Sundae with "+ "\n" + getName());
		String cost = DessertShoppe.cents2dollarsAndCents(getCost());
		return receipt.toString() + "     " + cost;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
