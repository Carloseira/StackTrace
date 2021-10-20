package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		method1();
		
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("---Method 1 initialized---");
		method2();
		System.out.println("---Method 1 terminated---");
	}
	
	public static void method2() {

		System.out.println("---Method 2 initialized---");
		Scanner input = new Scanner(System.in);

		int position = 0;

		try {
			String[] vect = input.nextLine().split(" ");
			position = input.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position: #" + position);
			e.printStackTrace();
			input.next();
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error");
			e.printStackTrace();
		}

		System.out.println("---Method 2 end---");
		

		input.close();
	}
}
