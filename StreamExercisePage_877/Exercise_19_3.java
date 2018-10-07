import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Ex_19_3 {

	private static Scanner in;

	public static void main(String[] args) throws IOException
	{
		String file = "C:\\Users\\Gm Maruf\\eclipse-workspace\\LabTest6\\src";
        in = new Scanner(new File(file));
        
	    List<String> wordList = new ArrayList<>();
	    
	    while (in.hasNextLine()) 
	    { 
	    	wordList.add(in.nextLine()); 
	    }
	    

	    long count = 0;
	    String key = "the";
	    
	    
	    for (String w : wordList)
	    {
	    	if(w.contains(key))
	    	{
	    		System.out.println(w);
	    	}
	    	
	    }
	}
}