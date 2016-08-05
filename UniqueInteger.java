import java.util.*;
//4 - Given an array filled with integers that appear exactly twice, with the exception of one integer that appears once, find the unique integer.
//ex:findUnique([1, 2, 6, 9, 9, 1, 3, 6, 2]) 
//returns: 3

//ex: findUnique([12, 45, 32, 65, 32, 65, 45])
//returns: 12

public class UniqueInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		//getting input as 1,2,3,4,56,74. so split it using ',' in to a string array
		String strNum[]=s.split(",");
		
		
		int intNum[]=new int[strNum.length];
		int temp;
		int sameNum;
		int sameNumCount=0;
		
		for(int i=0;i<strNum.length;i++)
		{
			intNum[i]=Integer.parseInt(strNum[i]);
			//System.out.println(Integer.parseInt(strNum[i]));
		}
		
		
		//sorting a
		for(int j=0;j<intNum.length;j++)
		{
			for(int k=1;k<intNum.length-j;k++)
			{
				if(intNum[k-1]>intNum[k])
				{
					temp=intNum[k-1];
					intNum[k-1]=intNum[k];
					intNum[k]=temp;
				}
			}
			
	   	}
		
		
		
		for(int m=1;m<intNum.length;m++)
		{
			if(intNum[m-1]==intNum[m])
			{
				m++;
			}
			else 
			{
				System.out.print(+intNum[m-1]);
			}
			
		}
		

	}

}
