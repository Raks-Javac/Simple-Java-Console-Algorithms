public class apples {
   public static void change(int x[]) {
   for(int counter=0;counter<x.length;counter++)
	   x[counter]+=1;
   }
   
      public static void main(String[] args){
		  int bucky[]={70,60,50,40,30};
		  change(bucky);
		  for(int y:bucky)
			  System.out.println("\t"+"\t"+y);
   }
}