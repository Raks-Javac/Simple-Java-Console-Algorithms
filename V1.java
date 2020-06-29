import java.util.*;


public class V1 {
	  public static void main(String[] args) {
		   
		   Scanner obj = new Scanner(System.in);
		   
		   System.out.println("Enter num1");
		   int p = obj.nextInt();
		   
		   System.out.println("Enter num2");
	       int q = obj.nextInt();
		   System.out.println("Eneter num3");
		   int r = obj.nextInt();
		   
         System.out.println((p-q)>=20);
		 System.out.println((q-r)>=20);
		 System.out.println((r-p)>=20);
	}
}	