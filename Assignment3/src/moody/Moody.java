//write a Java program that uses polymorphism and abstract classes and methods.

package moody;

abstract class Moody {
	protected String mood;
	
	//Returns the mood: sad or happy - depending on which object sends the message
	protected abstract String getMood();
	
	//Each object expresses a different emotion
	protected abstract void expressFeelings();
	
	//An object responds according to how it feels, print "I feel happy (or sad) today!"
	public void queryMood() {
		System.out.println(this.getMood());
	}

	public static void main(String[] args) {
		
		Psychiatrist p = new Psychiatrist();
	  Moody sad = new Sad();
	  Moody happy = new Happy(); 
	  System.out.println("How are you feeling today?");
	  System.out.println("I feel happy today!");  
	  p.examine(happy);
	  p.observe(happy);
	  
	  System.out.println("How are you feeling today?");
	  System.out.println("I feel bad today!");  
	  p.examine(sad);
	  p.observe(sad);
	}
}

class Sad extends Moody{
	
	//Return a string indicating sad
	protected String getMood() {
		return "sad";
	}
	//Print crying string:" 'wah' 'boo hoo' 'weep' 'sob' 'weep' "
	public void expressFeelings() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}
	//Return message about self:"Subject cries a lot"
	public String toString() {
		System.out.println("Subject cries a lot");
		return "Subject cries a lot";
	}
}

class Happy extends Moody{

	protected String getMood() {
		return "happy";
	}
	public void expressFeelings() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}
	public String toString() {
		System.out.println("Subject laughs a lot");
		return "Subject laughs a lot";
	}
}

class Psychiatrist{
	//asks a moody object about its mood
	public void examine(Moody moody) {
	moody.getMood();
	moody.expressFeelings();
	}
//A moody object is observed to either laugh or cry
	public void observe(Moody moody) {
	moody.toString();
	}
}



