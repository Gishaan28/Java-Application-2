/**
 * 
 */
package javaleads.lesson2;

/**
 * @author ishaangupta
 *
 */
public abstract class Vehicle {

	/**
	 * @param args
	 */
	private String type;
	private int capacity;

	Vehicle() {
		type = "";
		capacity = 0;
	}
	public abstract void runVehicle();
	
	public void printVehicalDetails() {
		System.out.println(type + " " + capacity);
	}
	
	public static void main(String[] args) {
		
	}
}


