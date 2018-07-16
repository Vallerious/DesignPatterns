package structural.adapter.employees;

import java.util.StringTokenizer;

public class EmployeeCSV {
	private int id;
	private String firstname;
	private String lastname;
	private String emailAddress;
	
	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, ",");
		
		if (tokenizer.hasMoreTokens()) {
			this.id = Integer.parseInt(tokenizer.nextToken());
		}
		
		if (tokenizer.hasMoreElements()) {
			this.firstname = tokenizer.nextToken();
		}
		
		if (tokenizer.hasMoreElements()) {
			this.lastname = tokenizer.nextToken();
		}
		
		if (tokenizer.hasMoreElements()) {
			this.emailAddress = tokenizer.nextToken();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.getId() + ", First Name: " + this.getFirstname() +
				". Last name: " + this.getLastname() + ", Email: " + this.getEmailAddress();
	}
}
