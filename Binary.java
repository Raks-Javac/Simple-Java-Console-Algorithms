
   public class Binary { 
       public static void main(String []args) {
		   
           
		  java.util.Scanner binary = new java.util.Scanner(System.in);
           
		   System.out.println("Enter First Binary number");
		   double bin1 = binary.nextDouble();
         
		 System.out.println("Enter Second binary number");
		   double bin2 = binary.nextDouble();
			 
			 double total = bin2+bin1;
			 double Multiple = bin2*bin1;
			 double Division = bin1/bin1;
			 double Power=Math.pow(bin1,bin2);
			 
			 
			 System.out.println("Your sum addition binary is  "+ total);
			 System.out.println("Your multiplication binary is  "+  Multiple);
             System.out.println("Your binary divison is  "+  Division);
			 System.out.println("Your binary power maths method is  "+  Power);      
	 }
   }