import java.lang.String;

public class StringSpace {
   public static void main(String[] args){
	   String S="a bcd efg h ijklm nopq rstuv wxyz";
   String s=S.replaceAll("\\s+","");
   System.out.print(s);
	   
   }	
}