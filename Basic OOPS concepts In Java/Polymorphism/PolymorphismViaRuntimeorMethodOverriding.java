package Polymorphism;

public class PolymorphismViaRuntimeorMethodOverriding {

	public PolymorphismViaRuntimeorMethodOverriding() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                        Bank  bank ;
                        bank = new StateBankOfIndia();
                        System.out.println("SBI rate of interest are "+bank.getRateofInterest());
                        bank = new ICICI();
                        System.out.println("icici rate of interest are "+bank.getRateofInterest());
                        bank = new AXIS();
                        System.out.println("icici rate of interest are "+bank.getRateofInterest());
	}

}

/*we have a base class Bank and a method getrateofinterest()
 * that returns a double representing the rate of interest
 * now three classes has extended the bank class that our state bank of india
 * axis and icici and now they are subclasses of bank.
 * in main method or in this class which is named as PolymorphismViaRuntimeorMethodOverriding
 * we declared a reference variable "bank" of type "Bank" class
 * All three subclasses has overrides the method getrateofinterest() and has 
 * its own implementation as each of them returning different interests.
 * with b = new sbi() we instantiate an object of sbi class and assign it
 * to the reference variable "bank" which is of type "Bank" class
 * It can refers to objects of any subclass of  "Bank"
 * so now when we call bank.getrateofinterest() method then the overriden getrateofinterest()
 * method of statebankofindia class is invoked and returning the rate of interest specific to sbi.
 * and same is happening with other two classes
 * so here the run time polymorphism is achieved as
 * THE APPROPRIATE METHOD IMPLEMENTATION IS DETERMINED 
 * AT RUN TIME BASED ON THE
 * ACTUAL OBJECT TYPE AND ALLOWING MORE FLEXIBLE AND DYNAMIC BEHAVIOUR 
 * IN OUR PROGRAM.
*/
 