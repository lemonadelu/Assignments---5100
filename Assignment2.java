package assignment;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month
    double byPercent;
   
    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    		this.name = name;
    		this.age = age;
    		this.gender = gender;
    		this.salary =salary;
    }
    
    // Getter for `name`. Return the current `name` data
    public String getName() {
    		return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    		this.name = name;
    }
    // Getter for 'salary'.
    public double getSalary() {
    	return salary;
    }
    
    //raise salary
    public void raiseSalary(double byPercent) {
    	double salary = this.salary * byPercent/100;
    }
    
    
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment
	public static void main(String[] args) {
    	Employee a = new Employee("Daisy", 23, Gender.FEMALE, 2000);
    	Employee b = new Employee("Bob", 25, Gender.MALE, 1800);
    	Employee c = new Employee("Alicia", 24, Gender.FEMALE, 3000);
    	
    	System.out.println("The social security tax of employee a is"+socialSecurityTax(a));
    	System.out.println("The social security tax of employee b is"+socialSecurityTax(b));
    	System.out.println("The social security tax of employee c is"+socialSecurityTax(c));
    	
    	System.out.println("The deduction of employee a is"+insuranceCoverage(a));
    	System.out.println("The deduction of employee b is"+insuranceCoverage(b));
    	System.out.println("The deduction of employee c is"+insuranceCoverage(c));
    	
    	System.out.println("Employees' salary from low to high:");
    	
    	System.out.println("The salary of employee a raised to"+a.getSalary());
    	System.out.println("The salary of employee a raised to"+b.getSalary());
    	System.out.println("The salary of employee a raised to"+c.getSalary());
    }
   
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public static double socialSecurityTax(Employee employee) {
    	double socialSecurityTax = 0;
           
    	   if (employee.salary <= 8900) {
           	socialSecurityTax = employee.salary * 6.2/100;
                    }
       	if(employee.salary > 8900) {
       		socialSecurityTax = 106800 * 6.2/100;
       	}    
    	return socialSecurityTax;    
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
    	double deduction = 0;
     if(employee.age < 35) {
    		deduction = employee.salary * 3/100;
    	}
     if(employee.age >= 35 && employee.age <= 50) {
    	 deduction = employee.salary * 4/100;
     }
     if(employee.age > 50 && employee.age < 60) {
    	 deduction = employee.salary * 5/100;
     }
     if(employee.age >= 60) {
    	 deduction = employee.salary * 6/100;
     }
     return deduction;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     * @return 
     * @return 
     */
    public static String sortSalary(Employee e1, Employee e2, Employee e3) {
    	if(e1.salary>e2.salary) {
    		if(e2.salary>e3.salary) {
    	           return e1.name + e2.name +e3.name ;
    	        }
    		else {
    			return e1.name + e3.name +e2.name;
    		}
    	    }
    	if(e2.salary>e1.salary) {
    		if(e1.salary>e3.salary) {
    			return e2.name + e1.name +e3.name;
    		}
    		else {
    			return e2.name + e3.name + e1.name;
    		}
    	}
    	if(e3.salary>e1.salary) {
    		if(e1.salary>e2.salary) {
    			return e3.name + e1.name +e2.name;
    		}
    		else {
    			return e3.name + e2.name + e1.name;
    		}
    	}
   
   
        /*Employee[] arr = {e1, e2, e3};
        Arrays.sort(arr, new Comparator<Employee>()
        		{

					@Override
					public int compare(Employee o1, Employee o2) {
						return Double.compare(o1.salary, o2.salary);
						
					}
        }
        
        		);
        
		return Arrays.toString(arr); */
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
         employee.raiseSalary(3);
         System.out.println("The salary raised to"+employee.getSalary());
    }
    
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     Because parameters are passed by value in java, when using swap() to exchange a and b, 
     the function swap() creates a copy of these references.
    */
/*    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}
*/