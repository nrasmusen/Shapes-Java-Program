import java.util.Scanner;

class Main {
	//instance variables / attribues

	Scanner scanner = new Scanner(System.in);
	boolean keepGoing = true;
	String userInput;
	String name;
	double h = 0;
	double w = 0;
	double r = 0;
	double a = 0;
	double b = 0;
	double c = 0;

	public static void main(String[] args){
		Main main = new Main();
		main.runProgram();
	}

	public void runProgram(){
		while(keepGoing){
			System.out.println("To select a shape Press 1 or Rectangle, 2 for Triangle, 3 for Circle, 7 to quit");
			userInput = scanner.nextLine();
			if(userInput.equals("1")){
				//Rectangle
				System.out.println("Enter Rectangle name: ");
				name = scanner.nextLine();
				System.out.println("Enter Rectangle height: ");
				h = scanner.nextDouble();
				System.out.println("Enter Rectangle width: ");
				w = scanner.nextDouble();

				Rectangle rectangle = new Rectangle(name, h, w);
				rectangle.printArea();
				rectangle.printPeri();
			}
			else if(userInput.equals("2")){
				//Triangle
				System.out.println("Enter Triangle name: ");
				name = scanner.nextLine();
				System.out.println("Enter Triangle Side A: ");
				a = scanner.nextDouble();
				System.out.println("Enter Triangle Side B: ");
				b = scanner.nextDouble();
				System.out.println("Enter Triangle Side C: ");
				c = scanner.nextDouble();

				Triangle triangle = new Triangle(name, a, b, c);
				triangle.printArea();
				triangle.printPeri();
			}
			else if(userInput.equals("3")){
				//Circle
				System.out.println("Enter Circle name: ");
				name = scanner.nextLine();
				System.out.println("Enter Circle radius: ");
				r = scanner.nextDouble();

				Circle circle = new Circle(name, r);
				circle.printArea();
				circle.printCirc();
			}
			else if(userInput.equals("7")){
				keepGoing = false;
			}
			else {
				System.out.println("Please enter correct Input");
			}
		}
	}
}