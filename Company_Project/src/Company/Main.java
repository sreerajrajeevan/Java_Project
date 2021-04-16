package Company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Doing CRUD operation in collection
 * @author Sreeraj
 * created 16-04-2021
 */
public class Main {
	static Scanner scan=new Scanner(System.in);
    HashMap<Integer,Employee> employees=new HashMap<>();
	public static void main(String[] args) {
		Main main=new Main();
		while(true) {
			System.out.print("Select your option from the list\n1: create employee\n"+"2: read employee\n"+"3: update employee\n"+"4: delete employee\n5: Exit");
			int option=scan.nextInt();
			switch(option) {
			case 1:
				main.createEmployee();
				break;
			case 2:
				main.readEmployee();
			    break; 
			case 3:
				main.updateEmployee();
			    break;
			case 4:
				main.deleteEmployee();
			    break;
			case 5: 
				System.exit(0);
			}
		}

	}
	//creating employee and storing in map
	private void createEmployee() {
		Employee employee=new Employee();
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();scan.nextLine();
		employee.setId(id);
		System.out.println("Enter name: ");
		String name=scan.nextLine();
		employee.setName(name);
		System.out.println("Enter designation: ");
		String designation=scan.nextLine();
		employee.setDesignation(designation);
		System.out.println("enter salary: ");
		int salary=scan.nextInt();scan.nextLine();
		employee.setSalary(salary);
		employees.put(id, employee);
	}
	//Displaying employee details based on employee id
	private void readEmployee() {
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();scan.nextLine();
		System.out.println(employees.get(id));
	}
	//Updating employee
	private void updateEmployee() {
		System.out.println("enter employee id");
		int oldId=scan.nextInt();scan.nextLine();
		Employee employee=employees.get(oldId);
		employees.remove(oldId);
		System.out.println("what you want to update?\n1: id\n2: name\n3:designation\n4:salary");
		int option=scan.nextInt();scan.nextLine();
		switch(option) {
		case 1:
			System.out.println("Enter new id: ");
			int newId=scan.nextInt();scan.nextLine();
			employee.setId(newId);
			employees.put(newId, employee);
			break;
		case 2:
			System.out.println("enter new name: ");
			String newname=scan.nextLine();
			employee.setName(newname);
			employees.put(employee.getId(), employee);
		    break; 
		case 3:
			System.out.println("enter new designation: ");
			String newDesig=scan.nextLine();
			employee.setDesignation(newDesig);
			employees.put(employee.getId(), employee);
		    break;
		case 4:
			System.out.println("enter new salary: ");
			int newSal=scan.nextInt();scan.nextLine();
			employee.setSalary(newSal);
			employees.put(employee.getId(), employee);
		    break;
		default: 
			System.out.println("enter a valid input");
		}
	}
	//Deleting employee
	private void deleteEmployee() {
		System.out.println("enter the employee id");
		employees.remove(scan.nextInt());
	}

}
