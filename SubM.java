public class SubM {

public static void main(String[] args) {
	    System.out.println("\t"+"This is the subtraction of my matrices");
           SubM ng=new SubM();
		   ng.Sub();
      }
		  public static void Sub() {
			  int i=3;int j=3;
       int FirstM[][]={{5,4,8},{6,9,2},{1,0,7}};
	   int SecondM[][]={{1,3,3},{2,4,6},{3,2,4}};
			 int sum[][]= new int[i][j];
		 
		   for(int row=0;row<i;++row)
		  {
		  for(int columns=0;columns<j;++columns)
		  { 
		  sum[row][columns]=FirstM[row][columns]-SecondM[row][columns];
		   }
		  }
		 for(int[] Roll :sum){
            for(int column : Roll) {
                System.out.print(column+ "\t");
			}
		 
            System.out.println();
		     }			   
   }
}