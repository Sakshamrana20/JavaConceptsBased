package Polymorphism;

public class MethodOverloadingDiffArguments {

	public MethodOverloadingDiffArguments() {
		// TODO Auto-generated constructor stub
	}
	
    // Method with one integer argument
    public int add(int a) {
        return a;
    }

    // Overloaded method with two integer arguments
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer arguments
    public int add(int a, int b, int c) {
        return a + b + c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDiffArguments adding = new MethodOverloadingDiffArguments();
		 System.out.println(adding.add(5)); // Calls method with one argument
	        System.out.println(adding.add(5, 10)); // Calls method with two arguments
	        System.out.println(adding.add(5, 10, 15)); // Calls method with three arguments
	    
	                
	 
	}

}
