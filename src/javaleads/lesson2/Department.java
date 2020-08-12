package javaleads.lesson2;

public class Department {
	
	String deptName, location;
	int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department();
		Department d2 = new Department("Maths", 111);
		Department d3 = new Department("History", 222, "Cali");
		System.out.println(d1.deptName + d1.id + d1.location);
		System.out.println(d2.deptName + d2.id + d2.location);
		System.out.println(d3.deptName + d3.id + d3.location);
	}
	
	Department() {
		this.deptName = "None";
		this.id = 0;
		this.location = "None";
	}
	Department(String deptName, int id) {
		this.deptName = deptName;
		this.id = id;
		this.location = "None";
	}
	Department(String deptName, int id, String location) {
		this.deptName = deptName;
		this.id = id;
		this.location = location;
	}

}
