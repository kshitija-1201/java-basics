//Traffic Signal Simulation
//Compile time polymorphism using method overloading
//Exception handling using try-catch

package Assign04;

import java.util.Scanner;
import java.util.InputMismatchException;



public class TrafficSignal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter Signal Color:");
			String color = sc.next();

			System.out.println("Enter Duration:");
			int duration = sc.nextInt();

			TrafficLight t1 = new TrafficLight(color, duration);

			t1.input(color, duration);

			// compile time polymorphism
			t1.input(color);
		}

		catch(InputMismatchException e) {

			System.out.println("Please enter numbers only!");
		}

		sc.close();
	}
}

class TrafficLight {

	String color;
	int duration;

	TrafficLight(String color, int duration) {

		this.color = color;
		this.duration = duration;
	}

	void input(String color, int duration) {

		if(color.equalsIgnoreCase("Red")) {

			for(int i = duration; i >= 1; i--) {

				System.out.println("Red : " + i);
			}

			System.out.println("Changing to Yellow...");
			System.out.println("Changing to Green...");
		}

		else if(color.equalsIgnoreCase("Yellow")) {

			for(int i = duration; i >= 1; i--) {

				System.out.println("Yellow : " + i);
			}

			System.out.println("Changing to Green...");
			System.out.println("Changing to Red...");
		}

		else if(color.equalsIgnoreCase("Green")) {

			for(int i = duration; i >= 1; i--) {

				System.out.println("Green : " + i);
			}

			System.out.println("Changing to Red...");
			System.out.println("Changing to Yellow...");
		}

		else {

			System.out.println("Invalid Signal Color!");
		}
	}

	// method overloading
	void input(String color) {

		System.out.println("Traffic Signal Completed for: " + color);
	}
}
