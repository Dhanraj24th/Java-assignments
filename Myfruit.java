package todays;

public class Myfruit {
	private String Color;
	private double weight_in_gram;
	
	Myfruit(){
		this.Color="green";
		this.weight_in_gram=100;
		System.out.println("my fruit Default Constructor");
		
	}
	Myfruit(String color,double weight){
		
		this.Color=color;
	    this.weight_in_gram =weight;
		System.out.println("my fruit Parameterized Constructor");
		   
	}
	
	public void color( ) {
		System.out.println("Myfruit color Method");
		
	}
	
  public String toString() {
	  
	  return "Color"+" "+this.Color+" "+"Weight "+this.weight_in_gram;
  }

}
