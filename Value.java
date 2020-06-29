import java.util.*;


public class Value {
	  public static void main(String[] args) {
		   
		   Scanner obj = new Scanner(System.in);
		   
		   System.out.println("Enter num1");
		   int p = obj.nextInt();
		   
		   System.out.println("Enter num2");
	       int q = obj.nextInt();
		   System.out.println("Eneter num3");
		   int r = obj.nextInt();
		   
		   
	   
	    boolean V = p-q>=20;
		boolean M = ((q-r)>=20);
		boolean G = ((r-p)>=20);
	  System.out.println(V);
	  System.out.println(M);
      System.out.println(G);
	 }
}
	  
	  
	  
		  