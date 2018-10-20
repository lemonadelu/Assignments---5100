package assignment5;

class Candy extends DessertItem {
	
	double weight;
	int price;
	public Candy(String name, double weight, int price) {
		super(name);
		this.weight = weight;
		this.price = price;
	}
	public int getCost() {
		int cost = Math.round((float) weight * price);
		return cost;
	}
	public String toString() {
		StringBuilder receipt = new StringBuilder(weight + " lbs."+" @ "+DessertShoppe.cents2dollarsAndCents(price)+" /lb."+"\n"+getName());
		String cost = DessertShoppe.cents2dollarsAndCents(getCost());
		return receipt.toString() + "         "+cost;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
