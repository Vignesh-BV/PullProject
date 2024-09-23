package Abstractions;

public class UseAbstract1 {     
	public static void main(String[]args) {
		SoftwareEngineer se=new SoftwareEngineer();
		System.out.println(se.showSalary(10000)+" "+se.showWork("Sofware Developer")+" "+se.showRole("Developer"));
	
	}
}	


abstract class Employee {
	public int showSalary(int a) {
		return a; 
	}
	
	public String showWork(String b) {
		return b;
	}
	public abstract String showRole(String c);
}

class SoftwareEngineer extends Employee {
	
public String showRole(String c) {
	return c; }
}


