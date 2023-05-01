package todays;

public class Myorange extends Myfruit{

	
	public Myorange( ) {
		super();
		System.out.println("myorange Default constructor");
	}
	@Override
	public void color() {
		System.out.println("Orange  color override");
	}
	public void weight() {
		System.out.println("Myorange weight");
	}
	
	
}
