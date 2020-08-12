package com.exam.encapsulation;


/**
 * @author ishaangupta
 *
 */
public class StudentDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Jack");
		s.setAge(24);
		s.setDepartment("Computer Science");
		System.out.println(s.getName() + " " + s.getAge() + " " + s.getDepartment());
	}

}
