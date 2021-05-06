package mernis;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
	   KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
	   boolean result = false;
	   try {
		   result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear()	);
		  if(result == true) {
			  System.out.println("Kimlik Dogrulandi");
			  result = true;
			  return result;
		  }
		   else {
			   System.out.println("Not a valid person");
			   return result;
		   }
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return result;
	}
}
}