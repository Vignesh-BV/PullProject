package Abstractions;

public class UseTwoInterfaceOneAbstractor2 {
public static void main(String[]args) {
				Tyre1 tyre1=new Tyre1();
				System.out.println(tyre1.carBrand("Mahindra Thor")+"\n"+tyre1.carNumber("TN 68 W 2304")+"\n"+tyre1.carColor("Black")+"\n"+tyre1.carPrice("25Lakhs"));
			}
			}

	
interface Vehicle11 {
				public String carPrice(String a);
				public String carNumber(String b);
			}
	interface Car1 extends Vehicle11 {
		public String carColor(String c);
		public String carBrand(String d);
	}
	
abstract class Engine1 implements Car1 {
			}
			
  class Tyre1 extends Engine1 {
	   public String carPrice(String a) {
		   return a;
	   }
		public String carNumber(String b) {
			return b;
		}
		public String carColor(String c) {
			return c;
		}
		public String carBrand(String d) {
			return d;
		}
   }

   
				