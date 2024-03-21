package Encapsulation; // this is the package i created in eclipse

public class Person {
	
	  private String name;
	  private int age ;
	  private String gender;
	  private String occupation; 
	  private String address ;
	  
	   

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		 if(age >0 ) {
			 this.age = age;	
		 } else {
		    System.out.println("Invalid data");
		    return  ;
		 }
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getOccupation() {
		return occupation;
	}



	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person person = new Person();
      person.setName("Saksham");
      person.setAge(24);
      person.setGender("male");
      person.setOccupation("student");
      person.setAddress("India");
      System.out.println(""+person.getName());
      System.out.println(""+person.getAge());
      System.out.println(""+person.getGender());
      System.out.println(""+person.getOccupation());
      System.out.println(""+person.getAddress());
      person.setAge(-34);
     
	}

}
