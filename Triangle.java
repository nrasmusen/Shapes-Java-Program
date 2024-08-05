import java.lang.Math;

public class Triangle {
	//instance variables
	private String name;
	private double s;
	private double a;
    private double b;
    private double c;

	//constructor
	public Triangle(){
		name = "Frank";
		a = 5;
        b = 5;
        c = 5;
        s = (a + b + c)/2;
	}
	//overloaded constructor
	public Triangle(String name, double a, double b, double c){
		this.name = name;
		this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c)/2;
	}

	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setSideA(double a){
		this.a = a;
	}
	public void setSideB(double b){
		this.b = b;
	}
    public void setSideC(double c){
		this.c = c;
	}


	//getters
	public String getName(){
		return name;
	}
	public double getSideA(double a){
		return a;
	}
	public double getSideB(double b){
		return b;
	}
    public double getSideC(double c){
		return c;
	}
	
	//methods
	public void printArea(){
		System.out.println(s);
		System.out.println("Triangle " + name + " has an area of: " + (Math.sqrt(s * (s - a) * (s - b) * (s - c))));
		System.out.println("--------------------------------------------");
	}
	public void printPeri(){
		System.out.println("Triangle " + name + " has an perimeter of: " + (a + b + c));
		System.out.println("--------------------------------------------");
	}		
}