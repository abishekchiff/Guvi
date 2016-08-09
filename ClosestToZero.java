import java.util.*;
//9 - Given an array with both positive and negative numbers. Find two elements such that their sum is closest to zero

public class ClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc=new Scanner(System.in);
		int j,temp=0,min=100000,tempi=0,tempj=0;
		
		String str[]=sc.nextLine().split(",");
		int a[]=new int[str.length];
		
		
		for(int i=0;i<str.length;i++)
		{
			
			a[i]=Integer.parseInt(str[i]);
		}
	

	for(int i=0;i<a.length;i++)
	{
		for(j=1;j<a.length;j++)
		{
			if(i!=j)
			{	
				if(Math.abs(a[i]+a[j])<min)
				{
					min=Math.abs(a[i]+a[j]);
					tempi=i;
					tempj=j;
				}
			}
		}
	}
	
		System.out.println(a[tempi]+","+a[tempj]+",sum="+min);
		

	}

}
