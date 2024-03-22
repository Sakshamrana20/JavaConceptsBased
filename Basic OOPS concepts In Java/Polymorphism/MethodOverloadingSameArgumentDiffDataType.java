/**
 * 
 */
package Polymorphism;

 
public class MethodOverloadingSameArgumentDiffDataType {

	
	public MethodOverloadingSameArgumentDiffDataType() {
		// TODO Auto-generated constructor stub
	
	} 
	 // Method to print a single integer
    public void print(int number) {
        System.out.println("Integer: " + number);
    }

    // Overloaded method to print a single double
    public void print(double number) {
        System.out.println("Double: " + number);
    }

    // Overloaded method to print a string
    public void print(String message) {
        System.out.println("String: " + message);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingSameArgumentDiffDataType   printing = new MethodOverloadingSameArgumentDiffDataType ();
		   printing.print(123); // Calls the integer version
	        printing.print(123.45); // Calls the double version
	        printing.print("method is overloaded based on the"
	        		+ " type of the single argument it receives. "
	        		+ "\nThis shows method overloading with "
	        		+ "different data types for "
	        		+ "the same number of arguments."); // Calls the string version
	}

}
