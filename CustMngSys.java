package corejava;
import java.time.LocalDate;
public class CustMngSys {
	private static int counter;
	private int customerId;
    private String Fname, Lname,email,password;
    private double registrationAmount;
    private LocalDate dob;
    private ServicePlan namecharge;
    static {
    	counter=0;
    	
    }
    
    public CustMngSys(String fname, String lname, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan namecharge) 
    {
		super();
		Fname = fname;
		Lname = lname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.namecharge = namecharge;
		customerId=counter++;
	}
    public CustMngSys(String newemail) 
    {
          this.email=newemail;	
    }

	@Override
	public String toString() {
		return "CustMngSys [customerId=" + customerId + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob
				+ ", namecharge=" + namecharge + "]";
	}
    
    @Override
    public boolean equals(Object o) 
    {   
    	if(this.email.equals(((CustMngSys)o).email))
        {
    	  return  true;	
    	}
         return false;	
    }
    
    public String getpass() 
    {
    return password;	
    }
    
    
    
}
