package Abstractions;

public class UseTwoInterfaceOneAbstractor1 {
public static void main(String[]args) {
			Tyre tyre=new Tyre();
			System.out.println(tyre.carPrice("15-Lakhs")+" "+tyre.carNumber("TN 68 W-2304")+" "+tyre.tyreBrand("CEAT-Tyre"));
		}
		}

interface Vehicle1 {
			public String carPrice(String a);
			public String carNumber(String a);
		}
interface Car extends Vehicle1 {
	
}

abstract class Engine implements Car {
			public String carPrice(String a) {
						return a;
					}
					public String carNumber(String b) {
					return b;
					}
		}

class Tyre extends Engine {
			public String tyreBrand(String a) {
				return a;
			}
		}
		
			


