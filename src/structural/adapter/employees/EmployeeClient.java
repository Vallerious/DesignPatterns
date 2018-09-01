package structural.adapter.employees;

import java.util.ArrayList;
import java.util.List;

/**
 * Client
 * 
 * The EmployeeClient is a example of the Adapter pattern in action.
 * It uses the Adapter pattern to make a incompatible interface work with the new code.
 * 
 * @author valerivaleriev
 * @version 1.0
 */
public class EmployeeClient {
	public static void main() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeRepository("1234", "Valeri", "Hristov", "valericfbg@gmail.com");
		
		employees.add(employeeFromDB);
		
		/* 
		 * EmployeeFromLDAP is kinda similar to Employee...we need to work with them interchangeably
		 * What can we do?
		 * 1. Modify the EmployeeFromLDAP class so it implements Employee interface
		 * 2. Modify Employee
		 * 3. Create a Employee out of the properties of EmployeeFromLDAP manually
		 * or...
		 * Adapt the EmployeeFromLDAP to the Employee
		 */
		EmployeeFromLDAP employeeFromLDAP = new EmployeeFromLDAP("29-20301", "Mark", "Admina", "admin@admin.com");
		
		/*
		 * Here we are adapting similar objects to adhere to a single interface,
		 * we are not modifying any of the objects but use composition to transform the API of the employee
		 * from LDAP object and map it's properties to the employee interface
		 */
		employees.add(new EmployeeAdapterLDAP(employeeFromLDAP));
		
		EmployeeCSV employeeCsv = new EmployeeCSV("1, Ivan, Petrov, ivan@gmail.com");
		
		/*
		 * 1. We do not have to know in advance what type of classes we will have,
		 * we can create a adapter that can adapt the class to the interface.
		 * 
		 * 2. It helps adapt multiple systems together.
		 * 
		 * 3. Used for legacy code to fit with new code.
		 * 
		 * 4. Works by composition - the adaptee is residing into the adapter and 
		 * the adapter transforms and bends it to fit some interface.
		 */
		employees.add(new EmployeeCSVAdapter(employeeCsv));

		System.out.println(employees);
	}
}
