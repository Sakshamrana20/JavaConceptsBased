package Encapsulation;
//Write a Java program to create a class called BankAccount 
//with private instance variables accountNumber and balance. 
//Provide public getter and setter methods to access
//and modify these variables.
public class BankAccount { 
	  private String accountNumber;
	  private double balance;
	  
	  public String getaccountNumber() {
		  
		    return accountNumber;
	  }
	  public double getbalance() {
		  return balance ;
	  } 
    public void setaccountNumber (String accountNumber) {
	
	this.accountNumber = accountNumber;
}	  

     public void setbalance(double balance)
     {
    	 this.balance = balance ;
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
                BankAccount bankaccount = new BankAccount();
                bankaccount.setaccountNumber("sbi-785664582");
                bankaccount.setbalance(456785.85);
                String accountNumber = bankaccount.getaccountNumber();
                double balance = bankaccount.getbalance();
                System.out.println("Your bank account number is : "+accountNumber);
                System.out.println("Your Balnce is : "+balance);
	}

}
