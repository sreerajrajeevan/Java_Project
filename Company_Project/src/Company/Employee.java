package Company;
/**
 * POJO class for employee consists of all getters, setters and toString method
 * @author Sreeraj
 * created 16-04-2021
 */
public class Employee {
	private String name;
	private String designation;
	private int id;
	private int salary;
	public String toString() {
		return "Employee[ id: " +id+ " name: "+ name+ " designation: " + designation+ " salary: "+ salary+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
