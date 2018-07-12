import structural.adapter.SimpleListExample;
import structural.adapter.employees.EmployeeClient;

public class TestPattern {

	public static void main(String[] args) {
//		SimpleListExample adapterListExample = new SimpleListExample();
//		
//		adapterListExample.testListAdapter();
		
		EmployeeClient client = new EmployeeClient();
		
		System.out.println(client.getEmployeeList());
	}

}
