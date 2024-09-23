package Abstractions;

public class MultipleInheritanceUsingAbstractions {
	public static void main(String[]args) {
					Enginee engine=new Enginee();
					System.out.println(engine.carBrand("BMW")+" "+engine.carNumber("TN 68 W 2304")+" "+engine.carColor("Black")+" "+engine.carPrice("2.5Cr"));
				}
				}

		
	interface Carr {
					public String carPrice(String a);
					public String carNumber(String b);
				}
		
	interface Taxi extends Carr {
			public String carColor(String c);
			public String carBrand(String d);
		}
		
	 class Enginee implements Taxi,Carr {
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

	   
					


