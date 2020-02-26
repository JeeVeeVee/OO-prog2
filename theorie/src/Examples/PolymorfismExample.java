package Examples;

class SuperClass {
	public void foo() {
		System.out.println("Handling foo superclass...");
	}
}

class SubClassA extends SuperClass {
	
	@Override
	public void foo() {
		System.out.println("Handling foo subclass A ...");
	}
	
	public void extra() {
		System.out.println("Extra behavior for subclass A ...");
	}
}

class SubClassB extends SuperClass {
	
	@Override
	public void foo() {
		System.out.println("Handling foo subclass B ...");
	}
	
	public void extra() {
		System.out.println("Extra behavior for subclass B ...");
	}
}

public class PolymorfismExample {
	public static void main(String[] args) {
		SubClassA subRefA = new SubClassA();
		subRefA.foo();
		subRefA.extra();
		
		SubClassB subRefB = new SubClassB();
		subRefB.foo();
		subRefB.extra();
		
		SuperClass superRef = new SuperClass();
		superRef.foo();
		
		SuperClass superRefA_2 = new SubClassA();
		superRefA_2.foo();
		//superRefA_2.extra();
		
		//SubClassA subRefA_2 = superRefA_2;
		//subRefA_2.extra();
		
		SuperClass superRefB_2 = new SubClassB();
		superRefB_2.foo();
		//superRefA_2.extra();
		
		//SubClassB subRefB_2 = superRefB_2;
		//subRefB_2.extra();
		
		//SubClassA subRefA_3 = superRefB_2;

		//subRefA_2.extra();
	}	
	
	public static void handle(SuperClass obj) {
		obj.foo();
	}
}