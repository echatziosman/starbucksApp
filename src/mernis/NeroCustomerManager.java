package mernis;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + "  saved to db");
		
	}

	
}
