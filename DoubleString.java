//35 - Given a string, we need to check if a string is a double string possibly by deleting a character.
//A double string is a repetition of two strings affixed together. For example the following strings are 
//double strings "aa", "meme", "abbabb" Where as the follwing are not double strings "ab", "abc", "acbab" - 
//(posted by Arun prakash)
import java.util.*;
public class DoubleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		int n=str.length()/2;
		char ch[]=str.toCharArray();
		char temp[]=new char[n];
		char temp2[]=new char[n];
		int t1=0,t2=0;
		if(str.length()%2==0)
		{	
			for(int i=0;i<ch.length;i++)
			{
				if(i>=n)
				{
					temp2[t2++]=ch[i];
				}
				else
				{
					temp[t1++]=ch[i];
				}
			}
			int res=1;
			for(int j=0;j<temp.length;j++)
			{
				if(temp[j]!=temp2[j])
				{
					res=0;
					break;
				}
			}
			if(res==1)
			{
				System.out.println("Yes a double string");
			}
			else
			{
				System.out.println("not a double string");
			}
			
		}
		else
		{
			System.out.println("not a double string by length");
		}
	}

}
