/**
 * @author      Jasmine Wu
 * class ID:    CSE 360 85141
 * Assignment Number: 2
 * Description: Assignment to practice version control
 */

package cse360assign2;

/**
 * AddingMachine is the base class that contains the methods
 * to add, subtract, and return the current total
 */
public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * AddingMachine is the class constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * getTotal is a method that returns the current total
	 * @return 				current total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add is a method that adds the parameter to the current total
	 * @param value			value that is to be added
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * subtract is a method that subtracts the parameter from the current total
	 * @param value			value that is to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * toString is a method that returns a history of transactions
	 * @return 				a String listing values of transactions in order
	 * 						separated by spaces and the appropriate normal operator  
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * clear is a method that resets the history and the current total to zero	
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
