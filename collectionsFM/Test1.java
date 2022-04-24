package collectionsFM;
import java.util.LinkedHashSet;

public class Test1 {
	 
    public static void main(String args[])   
    {   
        
        String str = "pradeep";   
      
  LinkedHashSet<Character> lh = new LinkedHashSet<Character>();   
           
        for(int i=0;i<str.length();i++)   
            lh.add(str.charAt(i));   
              
        for(Character c : lh)   
            System.out.println(c);   
    }   
        
    
		}

	


