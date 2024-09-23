package Abstractions;

public class UseInterface1 { //UnImplement Method
	public static void main(String[]args) {
		BookTittle bt=new BookTittle();
		System.out.println(bt.displayAuthor("Vignesh")+" "+bt.displayPrice(250)+" "+bt.displayPublication("04-November-2024")+" "+bt.getBookId(114)+"\n"+bt.tittle("Maths Book"));
	
	}
}
		


interface Book {
	public String displayAuthor(String a);
	public int displayPrice(int b);
	public String displayPublication(String c);
	public int getBookId(int d);
}
class BookTittle implements Book {
	public String tittle(String title) {
		return title; 
	}
	public String displayAuthor(String a) {
		return a; 
	}
	public int displayPrice(int b) {
		return b;
	}
	public String displayPublication(String c) {
		return c;
	}
	public int getBookId(int d) {
		return d;
	}
	}
	
	
