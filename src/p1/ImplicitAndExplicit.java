package p1;

public class ImplicitAndExplicit {
	public static void main(String[] args) {
		  System.out.println("Implicit Type Casting\n");
	  
		  byte p = 12;  
		  System.out.println("byte value : "+p);  
	      // Implicit Type casting  
	      short q = p;  
	      System.out.println("short value : "+q);  
	      int r = q;  
	      System.out.println("int value : "+r);  
	      long s = r;  
	      System.out.println("long value : "+s);  
	      float t = s;  
	      System.out.println("float value : "+t);  
	      double u = t;  
	      System.out.println("double value : "+u); 
	      
	      System.out.println("\nExplicit Type Casting\n");
	      
	      double d = 166.66;  
	      //explicit type casting  
	      long l = (long)d;  
	      int i = (int)l;  
	      System.out.println("Before conversion: "+d);  
	 
		  System.out.println("After conversion into long type: "+l);  
	      
	      System.out.println("After conversion into int type: "+i);  
	}
				
}


