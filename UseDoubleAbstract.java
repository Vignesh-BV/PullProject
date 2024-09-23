package Abstractions;

public class UseDoubleAbstract {
public static void main(String[]args) {
		Shirt1 shirt=new Shirt1();
		System.out.println(shirt.clothPrice(1000)+" "+shirt.clothId(11)+" "+shirt.clothMaterial("Cotton"));
	}
	}

	interface Cloth1 {
		public int clothPrice(int a);
		public int clothId(int a);
	}


	abstract class TShirt1 implements Cloth1 {
		public int clothPrice(int a) {
					return a;
				}
				public int clothId(int b) {
				return b;
				}
			public abstract
			String clothMaterial(String a);	
	}

	abstract class TShirt2 extends TShirt1 {
		
	}
	class Shirt1 extends TShirt2 {
		public String clothMaterial(String a) {
			return a;
		}
	}
	
		

