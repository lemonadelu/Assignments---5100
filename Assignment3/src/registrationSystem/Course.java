//Design a simple registration system that allows student to register in a course

package registrationSystem;

import java.util.ArrayList;

import registrationSystem.Course.Student;

//public class RegistrationSystem {

	// score 5/5
public class Course{

		private static String name;
		private static int numberOfStudent;
	  private ArrayList<Student> students = new ArrayList<Student>(10);
		//create constructor
		public Course(String name, int num) {
			 Course.name = "Math";
			 numberOfStudent = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			Course.name = name;
		}
		public int getNumberOfStudent() {
			return numberOfStudent;
		}
		public void setNumberOfStudent(int n) {
			numberOfStudent = n;
		}
	
		//write getStudents() method and return the array of registered students
		public String getStudents() {
			Student a = new Student(null, 0);
			a.setName("Lu");
			Student b = new Student(null, 0);
			b.setName("Daisy");
			Student c = new Student(null, 0);
			c.setName("Kate");
			students.add(a);
			students.add(b);
			students.add(c);


			/*students[0].setName("Lu");
				students[1].setName("Mike");
				students[2].setName("Alice");
				students[3].setName("Amanda");
				students[4].setName("Kalthy");
				students[5].setName("Jack");
				students[6].setName("Daisy");
				students[7].setName("Megan");
				students[8].setName("Crystal");
				students[9].setName("Nina");
		    students[10].setName("Brain");
				students[11].setName("Alex");
				students[12].setName("Cody");   */
			for(int i = 0; i < students.size(); i++) {
				  System.out.print(students.get(i).getName()+" ");
			} 
			/*for(Student student: students) {
			    System.out.print(student.getName()+" ");
		    } 	*/
		
  	  
		 
  	  //System.out.println("students who registered the "+students+"are "+students);
				return students.get(numberOfStudent).getName();
			}
		
		//write method to check if the course is full
		public boolean isFull() {
			Course c = new Course(name, numberOfStudent);
			if(c.students.size() < 10) {
			  System.out.println("Course "+c.getName()+" is not full");
				return false;
			}
			else {
				System.out.println("Course "+c.getName()+" is full");
				return true;			
		}
	}
		
		//If the course is not full, register a student in course
		public void registerStudent() {
			Course c = new Course(name, numberOfStudent);
			if(c.students.size() < 10) {
				//c.registerStudent(student);
				Student student = new Student(null, 0);
				student.setName("Kelsey");
				students.add(student);
				System.out.println("Register student "+student.getName() + " for " + c.getName());
			}
			else
				System.out.println("Can't register students, the course is full.");
		}
		
		//Accessor method for the title and numberOfStudent field
		public void accessor() {
			Course c = new Course(name, numberOfStudent);			
			System.out.println("The number of students registered "+c.getName()+" is "+students.size());
		}
	

	public static void main(String[] args) {
		Course c = new Course(name, numberOfStudent);
		System.out.println("Students who registered the "+c.getName()+" are: ");
		c.getStudents();
		System.out.println(" ");
		c.isFull();
		c.accessor();
		c.registerStudent();
	}
	
	public class Student{
		private String name;
		private int id;
		public Student(String name, int id) {
			this.name = name;
			this.id = id;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void accessor() {
			Student s = new Student(name, id);
			s.getName();
			s.getId();
		}
	}
}


