import java.util.*;


//3 - Integers in an array are unique and increasingly sorted. Please write a function/method to find an integer from the array which equals to its index. For example, in the array {-3, -1, 1, 3, 5}, the number 3 equals its index 3.

public class ValueEqualToIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{	if(s.charAt(i)!='-')
			{
			
			if(count==Integer.parseInt(String.valueOf(s.charAt(i))))
			{
				System.out.println(count);
				
			}
			count++;
			
			}
		}
		

	}

}
