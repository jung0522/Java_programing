import java.util.Scanner;

public class timepromotion 
{
	
	public static void main( String[] args ) 
	{
      while(true)
      {	  
		System.out.print("초를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		int sec = scan.nextInt();
		int min = 0;
		int hour = 0;
		int day = 0;
		int week = 0;
		
		if (0 <= sec && sec < 60)
		{
			System.out.println(sec);
		}
		
		else if (0 <= sec && sec < 60*60)
		{
			min = sec / 60;
			sec = sec % 60;
			System.out.println(min+":"+sec);
		}
		
		else if (60*60 <= sec && sec < 60*60*24)
		{
		    min = sec / 60;
		    hour = min / 60;		    
		    min = min % 60;		    
		    sec = sec % 60;
		    System.out.println(hour+":"+min+":"+sec);
		}
		else if (60*60*24 <= sec && sec < 60*60*24*7)
		{		    
		    day = (sec / (60*60*24));
		    hour = (sec / (60*60))%24;
		    min = (sec / 60)%60;
		    sec = sec % 60;   
            
		    System.out.println(day+":"+hour+":"+min+":"+sec);
		}
		else
		{
            min = sec / 60; 
            hour = min / 60; 
            day = hour / 24;
            week = day / 7;    // week = sec / (60*60*24*7); //
            day = day % 7;     // day = (sec / (60*60*24))%7); //
            hour = hour % 24;  // hour = (sec / (60*60))%24; //
            min = min % 60;    // min = (sec / 60)%60; //
            sec = sec % 60;    // sec = sec % 60 //
            
		    
		    System.out.println(week+":"+day+":"+hour+":"+min+":"+sec);
		}
		
			
			
      }
			
    }
}
