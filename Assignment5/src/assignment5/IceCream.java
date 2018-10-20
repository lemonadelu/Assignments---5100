package assignment5;

class IceCream extends DessertItem{
	protected int cost;
  public IceCream(String name, int cost) {
		super(name);
		this.cost = cost;
	}
	public int getCost() {
		return cost;
	}
	public String toString() {
		StringBuilder receipt = new StringBuilder(getName());
		String cost = DessertShoppe.cents2dollarsAndCents(getCost());
		return receipt.toString() + "        " + cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
