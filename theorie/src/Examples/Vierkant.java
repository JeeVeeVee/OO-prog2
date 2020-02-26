package Examples;

class Rechthoek{

}

public class Vierkant extends Rechthoek{
	public static void main( String args[]) {
		// This statement simply creates an object of class
		// Vierkant and assigns a reference of Vierkant to it   
		Vierkant ref_1 = new Vierkant();

		// Since Vierkant extends Rechthoek class. The object creation
		// can be done in this way. Super class reference 
		// can have sub class reference assigned to it
		Rechthoek ref_2 = new Vierkant(); // <1>
       
		// A reference to a superclass cannot be directly assigned to
		// a reference of a subclass, it has to be explicitly casted. 
		if (ref_2 instanceof Vierkant) {
       		Vierkant ref_3 = (Vierkant) ref_2; // <2>
       	}
   }
}
