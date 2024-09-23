package Abstractions;

public class UseAbstract2 {
	public static void main(String[]args) {
		MotorVehicle mv=new MotorVehicle();
		System.out.println(mv.showSpeed("150kmph")+" "+mv.showEngineCC("150CC")+" "+mv.getBrake(true));
		mv.getMilage("65kmpl");
	}
}	
	

abstract class Vehicle {
	public abstract String showSpeed(String a);
	public abstract void getMilage(String b);
	
	public String showEngineCC(String c) {
		return c;
	}
	public boolean getBrake(boolean d) {
		return d;
	}
}
class MotorVehicle extends Vehicle {
		public String showSpeed(String a) {
			return a;
		}
		public void getMilage(String b) {
			System.out.println(b);
		}
}
		
	