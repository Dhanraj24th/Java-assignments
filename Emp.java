package Emp;

public class Emp {

	private String empid;
	private int deptid;
	private String name;
	private Double salary;
	
	public Emp(String empid, String name, Double salary,int deptid) {
		super();
		this.empid = empid;
		this.deptid = deptid;
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", deptid=" + deptid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object v)
	{
		 System.out.println("equals emp");
		if(v instanceof Emp) 
		{
			if( (this.empid.equals(((Emp)v).empid))&&( this.empid.equals(((Emp)v).empid)))
				System.out.println("Emp equals");	 
				return true;
			
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return this.empid.hashCode();
	}
	
}
