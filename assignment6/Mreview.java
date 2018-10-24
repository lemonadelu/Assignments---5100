package assignment6;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview>{
	private String title; //title of the movies
	private ArrayList<Integer> ratings; //list of ratings stored in a Store object
	
	public Mreview() {
		title = "";
		ratings = new ArrayList<>();
	}
	public Mreview(String ttl) {
		title = ttl;
		ratings = new ArrayList<>();
	}
	public Mreview(String ttl, int firstRating) {
		title = ttl;
		ratings = new ArrayList<Integer>(1);
		ratings.add(firstRating);
	}
	public String getTitle() {
		return title;
	}
	public void addRating(int r) {
    ratings.add(r);
	}
	
	public double aveRating() {
		int sum = 0;
		for(Integer r: ratings) {
			sum += r;
		}
		return (double)sum / ratings.size();
	}
	public int compareTo(Mreview obj) {  
		if(title.compareTo(obj.title) < 0) {
			return 1;
		}
		if(title.compareTo(obj.title) > 0) {
			return -1;
		}
		else
			return 0;
	}
	
	public boolean equals(Object obj) {
		if(title.equals(obj)) {
			obj = (Mreview) obj;
			return true;
		}
		return false;
	}
	
	public int numRatings() {
		return ratings.size();
	}
	
  public String toString() {
		return getTitle() + ", average "+ aveRating() + " out of " + numRatings() + " where " + getTitle() + " is the title, " + aveRating() + " is the average ratings and " + numRatings() + " is the number of ratings.";
	}

	public static void main(String[] args) {
		Mreview m = new Mreview("Star War", 9);
		m.addRating(8);
		m.addRating(6);
		m.addRating(3);
		System.out.println(m.toString());
	}
}
