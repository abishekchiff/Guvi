//6 - Given an array of n numbers, give an algorithm to find the first element in the array which is repeated
import java.util.*;
public class FirstRepeatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		
		String str[]=sc.nextLine().split(",");
		int a[]=new int[str.length];
		
		for(int i=0;i<a.length;i++)
		{
			int temp=Integer.parseInt(str[i]);
			if(l.contains(temp))
			{
				System.out.println(temp);
				break;
			}
			else
			{
				l.add(temp);
			}
			
		}
		
		
		
		
		
		
		

	}

}
