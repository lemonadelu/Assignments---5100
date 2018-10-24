package assignment6;

import java.util.Calendar;

public class Cat extends Pet implements Boardable{
	private String hairLength;
	Calendar start, end;
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
		// TODO Auto-generated constructor stub
	}
	public String getHairLength() {
		return hairLength;
	}
	public String toString() {
		return "CAT:" + "\n" + super.toString() + "\n" + "Hair: " + getHairLength();
	}

	public static void main(String[] args) {
		Cat c = new Cat("Miumiu", "Lu", "gray", "short");
		c.setSex(1);
		System.out.println(c.toString());
		c.setBoardStart(3, 12, 2015);
		c.setBoardEnd(9, 21, 2018);
		System.out.println("The boaring date is between boardstart date and boardend date: " + c.boarding(5, 21, 2017));
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
//		@SuppressWarnings("deprecation")
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
