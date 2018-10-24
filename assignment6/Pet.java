package assignment6;

public class Pet {
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	
	public static final int Male = 0;
	public static final int Female = 1;
	public static final int Spayed = 2;
	public static final int Neutered = 3;
	
	public Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	public String getPetName() {
		return name;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getColor() {
		return color;
	}
	public void setSex(int sexid) {
		sex = sexid;
	}
	public String getSex() {
		switch (sex) {
		case 0: return "Male";
		case 1: return "Female";
		case 2: return "Spayed";
		default: return "Neutered";
		}
	}
	public String toString() {
		return getPetName() + " owned by " + getOwnerName() + "\n" + "Color: " + getColor() + "\n" + "Sex: " + getSex(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
