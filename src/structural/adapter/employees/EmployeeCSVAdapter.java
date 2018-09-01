package structural.adapter.employees;

/**
 * Adaptor
 * 
 * @author valerivaleriev
 *
 */
public class EmployeeCSVAdapter implements Employee {
	private EmployeeCSV instance;
	
	public EmployeeCSVAdapter(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return this.instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		return this.instance.getFirstname();
	}

	@Override
	public String getLastName() {
		return this.instance.getLastname();
	}

	@Override
	public String getEmail() {
		return this.instance.getEmailAddress();
	}
	
	@Override
	public String toString() {
		return this.instance.toString();
	}

}
