package Constructor;

public class ThisKeyword {
            int x = 10000;
	public ThisKeyword() {
		// TODO Auto-generated constructor stub
	}
	void implicitthis() {
		
		 System.out.println(x);
	}
	void explicitthis (int x)
	{ //// Explicit use of this to differentiate between the instance variable x 
	  //and the constructor parameter x
		this.x = x;
		System.out.println(" "+this.x);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
                      ThisKeyword variable = new ThisKeyword();
                      System.out.println(""+x);  // it will print 10 because its local variable
                      System.out.println(""+variable.x); // it will print 10000 because variable has 
                                                         //reference id of the object and 
                                                         //class level variable will print (like this key word)
                      variable.implicitthis(); // here if you see in method i am not using this or variable (which has reference id )
                                               // of the object but still print 10000 which is class level variable because of implicit this
                       variable.explicitthis(20); // in method you could see i have used this keyword.
                      
	// output : 10
    //            10000
   //             10000
   //             20
	}

}
