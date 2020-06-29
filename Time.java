
 class vim{  
	  private int hour;
   private int minute;
   private int seconds;
   
     public int setTime(int h,int m,int s) {
		 
		 hour=((h>=0 && h<24) ? h:0);
        minute=((m>=60 && h<60) ? m:0);
		 seconds=((s>=60 && h<60) ? s:0);
		 
	 }
	 public String fixedT() {
		 return String.format("%02d:%02d:%02d", hour,minute,seconds);//String format means the form u want ur String output
		 
	 }
}
	 public class Time{

  public static void main(String[] args){
	
	  vim time = new vim();
	  System.out.println(time.fixedT());
	 
	  
   }
}
		 