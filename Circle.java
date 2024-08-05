import java.lang.Math;


public class Circle {
	//instance variables
	private String name;
	private double r;

	//constructor
	public Circle(){
		name = "Frank";
		r = 5;
	}
	//overloaded constructor
	public Circle(String name, double r){
		this.name = name;
		this.r = r;
	}

	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setRadius(double r){
		this.r = r;
	}

	//getters
	public String getName(){
		return name;
	}
	public double getRadius(){
		return r;
	}

	//methods
	public void printArea(){
		System.out.println("Circle " + name + " has an area of: " + Math.PI * Math.pow(r,2));
		System.out.println("--------------------------------------------");
	}
	public void printCirc(){
		System.out.println("Circle " + name + " has an circumference  of: " + (2 * Math.PI * r));
		System.out.println("--------------------------------------------");
	}		
}