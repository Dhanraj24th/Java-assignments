package corejava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static corejava.Defaultcustentries.*;
import corejava.CustMngSys;
import  static corejava.CustomerValidationRules.*;
public class CustomerTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter Customer Size");	
        List <CustMngSys> customer= precustomer();
		 boolean exit=false;
	//	 int counter=0;
		while(!exit)
		{
			try {
				
				System.out.println("Enter 1.Accept Details");
				System.out.println("Enter 2.Display Details");
				System.out.println("Enter 3.Display Details");
				switch(sc.nextInt()) {
				case 1:
					//String fname, String lname, String email, String password, double registrationAmount,
					//String dob, String namecharge
						System.out.println(" fname,lname,email,password,registrationamount,dob,color");			
						CustMngSys cust=acceptAllcustDetails(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),customer);
						customer.add(cust);
						
					
				  break;
		                
				case 2:
					for (int i = 0; i <customer.size(); i++) {
			            System.out.println(customer.get(i)); 	
					} 		  
			      break;
				  
				case 3:
				      exit=true; 
					  break;
				case 4:
					System.out.println("Sign IN");
					System.out.println("Enter Email");
				    if(true==customer.contains(new CustMngSys(sc.next()))) 
				    {
				          System.out.println("Validaccount");
				          System.out.println("Enter Pass");
				          String Pass=sc.next();
				          boolean flag=false; 
				          for (int i = 0; i < customer.size(); i++)
				          {
						        
				        	  if(customer.get(i).getpass().equals(Pass)) {
				        		System.out.println(customer.get(i));
				        	     flag=true;	
				        	  }
				        	  
						  }
				         if(flag==false) {
				        	 throw  new CustomerMangementException(" Invalid Pass please Try Again");
				         } 
				    }
				    else 
				    {
				    	throw  new CustomerMangementException(" Invalid email");
				         
				    }
				     break;
					
				}	
			}
			
			catch(Exception E) {
				
			System.out.println(E.getMessage());	
				
			}
				
		}	
		 		
	}

}
