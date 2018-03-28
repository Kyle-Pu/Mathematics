import java.util.Scanner;

public class Volume{

/* This Program will calculate the Volumes of various 3D objects like Sphere, Hemisphere, Cylinder,
   Cone, Cube, Cuboid etc.
*/

	public static void main(String[] args){

		System.out.println("________Welcome to Volume Calculation________\n");
		System.out.println("Choose one of the following\n");
		
		Scanner scan = new Scanner(System.in);

		System.out.println("1	Cube    \n" +
				   "2	Cuboid  \n" + 
				   "3	Cylinder\n" + 
				   "4	Sphere  \n" );

		int userChoice = scan.nextInt();

		switch(userChoice){
			case 1: cube();     break;
			case 2: cuboid();   break;
			case 3: cylinder(); break;
			case 4: sphere();   break;

			default: System.out.println("Invalid Choice! Try Again\n");
		}
		
	}

	public static void cube(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side of the Cube: ");
		double side = scan.nextDouble();
		
		System.out.println("Volume of Cube is : " + side * side * side);
	}

	public static void cuboid(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length, breadth, height of the Cuboid: ");
		double length  = scan.nextDouble();
		double breadth = scan.nextDouble();
		double height  = scan.nextDouble();

		System.out.println("Volume of Cuboid is : " + length * breadth * height);
	}

	public static void cylinder(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius and Height of the Cylinder: ");
		double radius = scan.nextDouble();
		double height = scan.nextDouble();

		System.out.println("Volume of Cylinder is : " + Math.PI * radius * radius * height);
	}

	public static void sphere(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius of the Sphere: ");
		double radius = scan.nextDouble();

		System.out.println("Volume of Sphere is : " + (4/3) * Math.PI * radius * radius * radius);
	}

	
}
