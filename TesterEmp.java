package Emp;
import java.util.HashSet;




public class TesterEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <Emp> Customerlist= new HashSet<> ();
		Emp e1=new Emp("rnd-001", "Riya", 10000.00,123);
		Emp e2=new Emp("rnd-003", "Rakesh", 20000.00,12);
		Emp e3=new Emp("rnd-001", "Riya", 10000.00,123);
		Emp e4=new Emp("rnd-006", "Riya", 10000.0,123);
		Emp e5=new Emp("rnd-003", "Rakesh", 20000.0,12);
		Emp e6=new Emp("rnd-008", "Riya", 10000.0,154);
		
		System.out.println("Added "+Customerlist.add(e1));
		System.out.println("Added "+Customerlist.add(e2));
		System.out.println("Added "+Customerlist.add(e3));
		System.out.println("Added "+Customerlist.add(e4));//t , hc : 1 
		System.out.println("Added "+Customerlist.add(e5));//t hc : 1 
		System.out.println("Added "+Customerlist.add(e6));//t  , hc : 1 
		System.out.println("size "+Customerlist.size());//5
		for(Emp e : Customerlist)
			System.out.println(e);
		
		

		
		
	}

}
