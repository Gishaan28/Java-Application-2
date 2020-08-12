/**
 * 
 */
package javaleads.lesson2;

import java.util.Scanner;

/**
 * @author ishaangupta
 *
 */
public class answers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question20();
//		question25();
//		question27();
	}
	
	public static void question20() {
		Vehicle1 v1 = new Vehicle1();
		Vehicle1 v2 = new Vehicle1();
		Vehicle1 v3 = new Vehicle1();
		Vehicle1 v4 = new Vehicle1();
		Vehicle1[] allVehicles = new Vehicle1[]{v1, v2, v3, v4};
		for (Vehicle1 c: allVehicles) {
			c.runVehicle();
		}
	}
	public static void question25() {
		Apple a = new Apple();
		a.isSweet();
		a.isPoisonous();
		PoisonBerry b = new PoisonBerry();
		b.isSweet();
		b.isPoisonous();
	}
	
	public static void question27() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num = Integer.parseInt(s.nextLine());
		for (int i = 1; i <= num; i++)
			System.out.print(i + " ");
		System.out.println();
		
		if (num%3 == 0 && num%5 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (num%3 == 0) {
			System.out.println("Fizz");
		}
		else if (num%5 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(num);
		}
	}
	
	
}

public class Vehicle1 {

	/**
	 * @param args
	 */
	private String type = "";
	private int capacity = 0;
	public void printVehicalDetails() {
		System.out.println(type + " " + capacity);
	}
	
	public static void runVehicle() {
		 System.out.println("Vehicle is running");
	}
	
}

public interface Fruit {
	public void isSweet();
	public void isPoisonous();
}

public class Apple implements Fruit {
	public void isSweet() {
		System.out.println("Apple is sweet");
	}
	
	public void isPoisonous() {
		System.out.println("Apple is not poisonous");
	}
}

public class PoisonBerry implements Fruit {
	public void isSweet() {
		System.out.println("PoisonBerry is not sweet");
	}
	
	public void isPoisonous() {
		System.out.println("PoisonBerry is poisonous");
	}
}