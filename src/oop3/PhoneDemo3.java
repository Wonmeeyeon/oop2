package oop3;

public class PhoneDemo3 {
	public static void main(String[] args) {
		
		Phone p = new Iphone8();
		
		System.out.println("Phone-->" + (p instanceof Phone));
		System.out.println("FeaturePhone-->" + (p instanceof FeaturePhone));
		System.out.println("SmartPhone Phone-->" + (p instanceof SmartPhone));
		System.out.println("Iphone Phone-->" + (p instanceof Iphone));
		System.out.println("Galaxy Phone-->" + (p instanceof Galaxy));
		System.out.println("Iphone8 Phone-->" + (p instanceof Iphone8));
		System.out.println("IphoneX Phone-->" + (p instanceof IphoneX));
		System.out.println("Iphone11 Phone-->" + (p instanceof Iphone11));

	}

}
