
public class Conversion{
   public static void main(String[] args) {
	  System.out.println("Below are the currencies u can convert to:");
	  System.out.println("1-American Dollars");
       System.out.println("2-British Pounds");
	   System.out.println("3-Indian rupees");
       System.out.println("4-Japanese Yen");
	   System.out.println("5-Euro");
	   System.out.println("6-Iranian Rial");
	   System.out.println("7-Korean Won");
	   System.out.println("8-Polish Zloty");
	   System.out.println("9-Crotian Kuna");
	   System.out.println("10-Bitcoin");
	   char ch;
    java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter from 1-10 to choose the currency u want to convert your naira to:");
	      
	    double unk = sc.nextDouble();
		System.out.println("Enter the amount u want to convert");
		double pick =sc.nextDouble();
		double a=pick*361.5;
		double b=pick*441.5;
		double c=pick*5.085;
		double d=pick*3.364;
		double e=pick*396.8;
		double f=pick*0.0086;
		double g=pick*0.3016;
		double h=pick*91.83;
		double i=pick*53.43;
		double j=pick*3088624;
		do {
			if(unk==1) { 
		    System.out.println("American Dollars :\n"+ a);
		    }else if(unk==2)  {
			System.out.println("British POunds :\n"+ b);
			}else if(unk==3)  {
			System.out.println("Indian rupees :\n"+ c);
		    }else if(unk==4) {
            System.out.println("Japanese Yen :\n"+ d);
			}else if(unk==5) {
			System.out.println("Euro :\n"+ e); 
		    }else if(unk==6) {
            System.out.println("Iranian Rial :\n"+ f);
			}else if(unk==7)  {
		    System.out.println("Korean Won :\n"+ g);
			}else if(unk==8) {
            System.out.println("Polish Zloty :\n"+ h);
			}else if(unk==9) {
		    System.out.println("Crotian Kuna :\n"+ i);
			}else if(unk==10) {
			System.out.println("Bitcoin :\n"+ j);
			}else {
			System.out.println("invalid option"); 
			    }
			System.out.println("do u still want to convert? Y for yes and N for no");
		     ch = sc.next().charAt(0);
	  System.out.println("Thank you");
	 }	   
	 while(ch!= 'n'); 
     }
}
	 