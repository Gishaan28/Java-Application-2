/**
 * 
 */
package javaleads.lesson1;

/**
 * @author ishaangupta
 *
 */
public class Vehicle {

	/**
	 * @param args
	 */
	private String type;
	private int capacity;
	
	Vehicle() {
		type = "";
		capacity = 0;
	}
	public void printVehicalDetails() {
		System.out.println(type + " " + capacity);
	}
	
	public static void runVehicle() {
		 System.out.println("Vehicle is running");
	}
	
	public static void main(String[] args) {
		
	}
}
