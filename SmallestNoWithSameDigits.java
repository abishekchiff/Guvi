//34 - Given a number n, find the smallest number that has same set of digits as n and is greater than n.
//If x is the greatest possible number with its set of digits, then print “not possible”. - (posted by Arun prakash)
import java.util.*;
public class SmallestNoWithSameDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		String str1=String.valueOf(no);
		no=no+1;
		String str2=String.valueOf(no);
		if(str2.length()>str1.length())
		{
			System.out.println("not possible");
		}
		else
		{
			System.out.println(no);
		}
		
	}

}
