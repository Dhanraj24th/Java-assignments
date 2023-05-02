package corejava;
import static corejava.CustomerValidationRules.acceptAllcustDetails;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Defaultcustentries {

public static List<CustMngSys> precustomer() {
	//public static CustMngSys acceptAllcustDetails(String fname, String lname, String email, String password, double registrationAmount,
		//	String dob, String namecharge, List <CustMngSys> customer) throws Exception	
	
    
	List <CustMngSys> custm= new ArrayList<>();
  try {
	custm.add(acceptAllcustDetails("Dhanraj","chavan","Dhanraj@gmail.com","123",2000,"1995-02-06","gold",custm));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return custm;
	

}
}
