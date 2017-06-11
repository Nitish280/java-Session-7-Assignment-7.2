/**
 * This class is doing the implicit type promotion
 * @author UNI
 *
 */
public class Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here i take the two different type of variable short and double
	    short s = 1024;
	    double d = .1234;
	    //this will promote the short in double
	    double result = d * s;
	    //here it will print the result
	    System.out.println("d * s is " + result);

	}

}
