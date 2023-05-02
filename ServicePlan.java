package corejava;

public enum ServicePlan {
SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private  int servicecharge;
	
	ServicePlan(int servicecharge)
	{
	    this.servicecharge=servicecharge;	
	}
	public int getservicecharge() 
	{
		return this.servicecharge;
	}
	   
	public void setservicecharge(int servicecharge) 
	{
	   this.servicecharge=servicecharge;	
	} 
	
	@Override
     public String toString()
	{
	   return name()+this.servicecharge;	
	}
	
}
