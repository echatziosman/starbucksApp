package mernis;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;
    
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		
     try {
    	 if(customerCheckService.checkIfRealPerson(customer)) {
 			
    		 System.out.println(customer.getFirstName() + "  saved to db");
 		}
    	 else {
    		 System.out.println("Not a valid person");
    	 }
	} catch (Exception e) {
		
		   e.printStackTrace();
		
	}
		
		
	}

	

	

}
