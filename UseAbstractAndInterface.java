package Abstractions;

public class UseAbstractAndInterface {
	public static void main(String[]args) {
	Shirt shirt=new Shirt();
	System.out.println(shirt.clothPrice(1000)+" "+shirt.clothId(11)+" "+shirt.clothMaterial("Cotton"));
}
}

interface Cloth {
	public int clothPrice(int a);
	public int clothId(int a);
}


abstract class TShirt implements Cloth {
	//public int clothPrice(int a) {
	//	return a;
//	}
	//public int clothId(int b) {
	//	return b;
	//}
		public abstract String clothMaterial(String a);	
}

class Shirt extends TShirt {
	public String clothMaterial(String a) {
		return a;
	}
		public int clothPrice(int a) {
				return a;
			}
			public int clothId(int b) {
			return b;
			}
	}
	
