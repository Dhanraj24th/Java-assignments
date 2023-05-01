package todays;

public class Mango extends Myfruit {
   private String Pulp;
 	
	Mango(){
		
		super();
		Pulp="yes";
		System.out.println(" Mango default Constructor");
		
	}
	@Override
  public void color() {
	  System.out.println("mango override");
	  
  }
 public void weight(){
		System.out.println("Weight Mango method");
	}
		
}
