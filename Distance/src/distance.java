import java.util.Scanner;
import java.text.DecimalFormat;

public class distance {

	/**
	 * Nicholas Land
	 * CSE 230 
	 * Project 2
	 */
	public static void main(String[] args) {
		
		// declare variables
		int x1, x2, y1, y2;
		double cost,total, distance;
		
		// new scanner object
		Scanner scan = new Scanner(System.in);
		
		// prompt for user input
		System.out.println("Please enter an x coordinate: ");
		x1 = scan.nextInt();
		System.out.println("Please enter a y coordinate: ");
		y1 = scan.nextInt();
		System.out.println("Please enter another x coordinate: ");
		x2 = scan.nextInt();
		System.out.println("Please enter another y coordinate: ");
		y2 = scan.nextInt();
		
		scan.close();
		
		// calculations
		total = Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2);
		distance = Math.sqrt(total);
		
		cost = distance * 0.43;
		
		// decimal formating
		DecimalFormat fmt = new DecimalFormat ("0.###");
		
		// print out results
		System.out.println();
		System.out.println("The distance between points (" + x1 + "," + y1 + ") and " + "(" + x2 + "," + y2 + ") is: "
			 +	fmt.format(distance));
		System.out.println("Total cost: $" + fmt.format(cost));

	}

}
