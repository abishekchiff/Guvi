import java.util.*;
public class RepeatingNumbers {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 	HashMap<Character,Integer> tm=new HashMap<Character,Integer>();
    	 String in=sc.nextLine();
    	 if(in.length()>1)
    	 {
    		 char inarray[]=in.toCharArray();
    		 if(inarray[0]!='-')
    		 {	 
		    		 for(int i=0;i<inarray.length;i++)
		    		 {
		    			 if(tm.containsKey(inarray[i]))
		    			 {
		    				 tm.put(inarray[i],tm.get(inarray[i])+1);
		    				 
		    			 }
		    			 else
		    			 {
		    				 tm.put(inarray[i], 1);
		    			 }
		    			 
		    		 }
		    		 for(Map.Entry<Character, Integer> rs: tm.entrySet())
		    		 {
		    			 if(rs.getValue()>1)
		    			 {
		    				 System.out.print(rs.getKey());
		    			 }
		    		 }
    		 }
    		 else
    		 {
    			 System.out.println(0);
    		 }
    		 
    	 }
    	 
    	 
    	 
     }
}
