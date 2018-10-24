package assignment6;

import java.util.Calendar;

public class Dog extends Pet implements Boardable{
	private String size;
	Calendar start, end;
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public String toString() {
		return "DOG" + "\n" + super.toString() + "\n" + "Size: " + getSize();
	}

	public static void main(String[] args) {
		Dog d = new Dog("Candy", "Lu", "white", "medium");
		d.setSex(3);
		System.out.println(d.toString());
		d.setBoardStart(3, 12, 2015);
		d.setBoardEnd(9, 21, 2018);
		System.out.println("The boaring date is between boardstart date and boardend date: " + d.boarding(5, 21, 2017));
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		start = Calendar.getInstance();
		start.set(year, month, day);
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		end = Calendar.getInstance();
		end.set(year, month, day);
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		Calendar current = Calendar.getInstance();
		current.set(year, month, day);
		if(!current.before(start) && !current.after(end)) {
			return true;
		}
		return false;
	}
}
