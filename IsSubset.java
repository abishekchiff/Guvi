import java.util.*;
//10 - Given 2 arrays of integers a1,a2 check if a1 is a subset of a2.
public class IsSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	String str[]=sc.nextLine().split(",");
	String str2[]=sc.nextLine().split(",");
	
	ArrayList<Integer> a2=new ArrayList<Integer>();
		int a1[]=new int[str.length];
		int indicator=0;
		
		
		for(int k=0,l=0;k<str.length||l<str2.length;k++,l++)
		{
			if(k<str.length)
			{	
			a1[k]=Integer.parseInt(str[k]);
			}
			if(l<str2.length)
			{
				a2.add(Integer.parseInt(str2[k]));
			}
		}
		
		for(int j=0;j<a1.length;j++)
		{
			if(!a2.contains(a1[j]))
			{
				indicator=1;
			}
			
		}
		if(indicator==1)
		{
			System.out.println("a1 is not a subset of a2");
		}
		else
		{
			System.out.println("a1 is a subset of a2");
		}
		
	
	}

}
