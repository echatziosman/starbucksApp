package mernis;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer(1,"Enes","Chatzi Osman",LocalDate.parse("1985-12-12"),"123345566");
		customerManager2.save(customer);
			}

}
