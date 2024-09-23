package Abstractions;

public class UseInterface2 {     //Unimplement Method
	public static void main(String[]args) {
		SoftwareEngineer1 se=new SoftwareEngineer1();
		System.out.println(se.showSalary(10000)+" "+se.showWork("Sofware Developer")+se.showRole("Developer"));
	
	
	}	
}

interface Employee1 {
	public int showSalary(int a);
	public String showWork(String b);
	public String showRole(String c);

}

class SoftwareEngineer1 implements Employee1 {
	public int showSalary(int a) {
	return a; }
public String showWork(String b) {
	return b; }
public String showRole(String c) {
	return c; }

}
