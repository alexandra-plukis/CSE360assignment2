/**
 * @author Alexandra Plukis
 * CLASS ID: RB8
 * ASSIGNMENT #: 2
 * DESCRIPTION: This class defines an AddingMachine class, the objects of 
 * which can add to or subtract from a total. It can also return a string that represents the 
 * current total stored in the AddingMachine object. 
 */

package cse360assign2;

/**
 * The public AddingMachine class has one data member total, which is a private 
 * int, that keeps track of the AddingMachine's current total. The class
 * has 6 public method members
 */
public class AddingMachine {

	private int total;
	
	/**
	 * AddingMachine() is the public default constructor for the 
	 * AddingMachine class. It takes no parameters, but it
	 * initializes the data member total to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal() is a public method that returns
	 * the current value of the data member total.
	 * @return total of the AddingMachine 
	 * object used to call this method is returned
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * add() is a public method that takes an int
	 * to add to the total and has no return value.
	 * @param value is an int that is added
	 * to the data member total of the AddingMachine
	 * object used to call this method
	 */
	public void add (int value) {
		
	}
	
	/**
	 * subtract() is a public method that takes
	 * an int to subtract from the total and has
	 * no return valye. 
	 * @param value is an int that is subtracted
	 * from the data member total of the AddingMachine
	 * object used to call this method
	 */
	public void subtract (int value) {
		
	}
		
	/**
	 * toString() is a public method that overrides
	 * the Object class's toString method to return a 
	 * String of the data member total of the AddingMachine
	 * object that is used to call this method. This will
	 * be called when an object is printed.
	 */
	public String toString () {
		return "";
	}

	/**
	 * clear() is a public method that is used to 
	 * reset the data member total back to 0.
	 */
	public void clear() {
	
	}
}

