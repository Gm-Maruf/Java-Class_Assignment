import java.util.Scanner;
import java.util.Random;


public class P71 {
	public static void main(String[] args)
	{
		Random rand = new Random();
		System.out.printf("Enter Lenght: ");
		Scanner sc = new Scanner(System.in);
		
		final int LENGTH = sc.nextInt();
		int[] Elements = new int[LENGTH];
		System.out.println("Length = "+LENGTH);
		
	    for (int i=0; i<LENGTH; i++)
	    {
	        Elements[i] = rand.nextInt(LENGTH);
	    }
	    
	    boolean inRun = false;
	    
	    for(int i=0 ; i<LENGTH ; i++) 
	    {
	    	if(inRun) 
	    	{
	    		if(Elements[i+1] != Elements[i]) 
	    		{
	    			System.out.print(" "+Elements[i]);
	    			System.out.print(" )");
	    		}
	    		inRun = false;
	    		continue;
	    	}
	    	if(!inRun)
	    	{
	    		if(i+1<LENGTH && Elements[i] == Elements[i+1])
	    		{
	    			System.out.print(" (");
	    			System.out.print(" "+Elements[i]);
	    			inRun = true;
	    		}
	    	}
	    	System.out.print(" "+Elements[i]);
	    	
	    }
	    if(inRun) {
	    	System.out.print(") ");
	    	System.out.println();
	    }
		
	}
}