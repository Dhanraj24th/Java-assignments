package todays;

public class MytesterFruit {

	public static void main(String[] args) {
		Myfruit f1=new Myfruit();
		f1.color();
		// ((Mango) f1).color();
		Myfruit f2=new Myorange();
        ((Myorange)f2).weight();
       Myfruit arr[]=new Myfruit[2];
       
       arr[0]=f1;
       arr[1]=f2;
    	for(Myfruit e:arr) {
    		
    	}
        
    	}
    	
 	}

	
	

