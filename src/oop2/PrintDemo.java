package oop2;

public class PrintDemo {
	
	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		p1.on();
		p1.off();
		p1.print();
		
		ColorPrinter p2 = new ColorPrinter();
		p2.on();
		p2.off();
		p2.print();
		
		LaserPrinter p3 = new LaserPrinter();
		p3.on();
		p3.off();
		p3.print();
		
	}

}
