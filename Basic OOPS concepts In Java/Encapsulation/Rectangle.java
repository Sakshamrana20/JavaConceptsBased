package Encapsulation;
//Write a Java program to create a class called Rectangle 
//with private instance variables length and width.
//Provide public getter and setter methods to access and modify these variables.
public class Rectangle {
	private double length;
	private double width;
	
	public double getLength() {
		 return length ;
	}
	public void setlength(double length) {
		this.length = length;
		
	}
	public double getwidth() {
		 return width ;
	}
	public void setwidth(double width) {
		this.width =  width;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                          Rectangle rectangle = new Rectangle();
                          rectangle.setlength(52.85);
                          rectangle.setwidth(34.23);
                          double length = rectangle.getLength();
                          double width = rectangle.getwidth();
                          double area = length * width ;
                          System.out.println("Lengtgh of rectangle "+length);
                          System.out.println("Width/breadth of rectangle "+width);
                          System.out.println("area of rectangle : "+area);
	
	}

}
