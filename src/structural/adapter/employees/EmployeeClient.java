package structural.adapter.employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeRepository("1234", "Valeri", "Hristov", "valericfbg@gmail.com");
		
		employees.add(employeeFromDB);
		
		
		EmployeeFromLDAP employeeFromLDAP = new EmployeeFromLDAP("29-20301", "Mark", "Admina", "admin@admin.com");
		
		/*
		 * Here we are adapting similar objects to adhere to a single interface,
		 * we are not modifying any of the objects but use composition to transform the API of the employee
		 * from LDAP object and map it's properties to the employee interface
		 */
		employees.add(new EmployeeAdapterLDAP(employeeFromLDAP));
		
		return employees;
	}
}
