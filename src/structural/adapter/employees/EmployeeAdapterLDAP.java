package structural.adapter.employees;

/**
 * Adaptor
 * 
 * This class adapts the EmployeeFromLDAP to the Employee Interface
 * 
 * @author valerivaleriev
 *
 */
public class EmployeeAdapterLDAP implements Employee {
	private EmployeeFromLDAP instance;
	
	public EmployeeAdapterLDAP(EmployeeFromLDAP instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
	    /* Here we are proxying the id property to the incompatible property */
		return this.instance.getCn();
	}

	@Override
	public String getFirstName() {
		return this.instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return this.instance.getSurname();
	}

	@Override
	public String getEmail() {
		return this.instance.getMail();
	}
	
	@Override
	public String toString() {
		return this.instance.toString();
	}

}
