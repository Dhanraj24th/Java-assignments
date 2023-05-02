package corejava;
import corejava.ServicePlan;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import static java.time.LocalDate.*;

import java.text.ParseException;


public class CustomerValidationRules {

	
	public static CustMngSys acceptAllcustDetails(String fname, String lname, String email, String password, double registrationAmount,
			String dob, String namecharge, List <CustMngSys> customer) throws CustomerMangementException,ParseException
	
	{
	
      CheckForDuplicate(email,customer);
      LocalDate cusdate=parseValidation(dob);
      checkAgeValid(cusdate );
      int registrationAmount1=planvalidate(namecharge);
      checkregistrationprice(registrationAmount,registrationAmount1);
      
      
	return new CustMngSys(fname,lname,email,password,registrationAmount1,cusdate,ServicePlan.valueOf(namecharge.toUpperCase()));	
	}
	public static void CheckForDuplicate(String email,List <CustMngSys> customer)throws CustomerMangementException
	{
	   CustMngSys emails=new CustMngSys(email);
	  if( customer.contains(emails)) {
		  throw new CustomerMangementException("Duplicate email");
	  }
     	     
    
	}
	public static LocalDate parseValidation(String Dob) 
	{
	  return parse(Dob); 	
	}
	
	public static int planvalidate(String plan) throws CustomerMangementException  
	{            
		return ServicePlan.valueOf(plan.toUpperCase()).getservicecharge(); 
	}
	public static void checkAgeValid(LocalDate dob ) throws CustomerMangementException
	{
	         int age=Period.between(dob, now()).getYears();	
	         if(age<21) {
	        	throw new  CustomerMangementException("Age is not vaild");
	         }
	         
	         
	}
	public static void checkregistrationprice(double regprice,double planprice) throws CustomerMangementException 
	{
	       if(regprice!=planprice) 
	       {
               throw new CustomerMangementException("Registration Price is Invalid");	    	   
	       }	
	}
	
	
}
