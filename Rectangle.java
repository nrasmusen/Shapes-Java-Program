public class Rectangle {
	//instance variables
	private String name;
	private double h;
	private double w;

	//constructor
	public Rectangle(){
		name = "Frank";
		h = 5;
		w = 5;
	}
	//overloaded constructor
	public Rectangle(String name, double h, double w){
		this.name = name;
		this.h = h;
		this.w = w;
	}

	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setHeight(double h){
		this.h = h;
	}
	public void setWidth(double w){
		this.w = w;
	}

	//getters
	public String getName(){
		return name;
	}
	public double getHeight(){
		return h;
	}
	public double getWidth(){
		return w;
	}
	
	//methods
	public void printArea(){
		System.out.println("Rectangle " + name + " has an area of: " + h*w);
		System.out.println("--------------------------------------------");
	}
	public void printPeri(){
		System.out.println("Rectangle " + name + " has an perimeter of: " + (h*2 + w*2));
		System.out.println("--------------------------------------------");
	}		
}