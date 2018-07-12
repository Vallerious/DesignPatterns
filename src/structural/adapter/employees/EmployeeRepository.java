package structural.adapter.employees;

public class EmployeeRepository implements Employee {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeRepository(String id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.id + ", First Name: " + this.firstName + ". Last name: " + this.lastName + ", Email: " + this.email;
	}
	
}
