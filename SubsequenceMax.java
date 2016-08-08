//15 - Given an array,describe an algorithm to identify the subarray with the maximum sum. For example,if the input is [1,‐3,5,‐2,9,‐8,‐6,4],the output would be[5,‐2, 9]

import java.util.*;
public class SubsequenceMax {

	
	//this subset function will only give max among subsequences ,for eg if input is  [1,‐3,5,‐2,9,‐8,‐6,4] output max set will be [5,‐2, 9] ,see the output is a subsequnece not subset 
	public Object[] subsequence(int a[])
	{
					int sum=0,max=0;
					Set<Integer> set=new HashSet<Integer>();
					//Set<Integer> maxSet=new HashSet<Integer>();
					Object maxSet[]=new Object[a.length];
					
					for(int i=0;i<a.length;i++)
					{
						sum=0;
						for(int j=i+1;j<a.length;j++)
						{
							set.add(a[j]);
							sum+=a[j];
							if(sum>max)
							{
								max=sum;
								maxSet=new Object[set.size()];
								maxSet=set.toArray();
								//System.out.println(sum+" : "+maxSet.toString());
								
							}	
							
						}
						set.clear();
					}
					
					
					return maxSet;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				SubsequenceMax obj=new SubsequenceMax();
				//Set<Integer> maxset=new HashSet<Integer>();	
				Object maxset[];
				int sum=0;
				
				System.out.println("Enter the size of Integer");
				int a[]=new int[sc.nextInt()];
				
				
				System.out.println("Enter the Integers");
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				maxset=obj.subsequence(a);
				//System.out.println();
				System.out.println("The set is");
				for( Object i: maxset)
				{
					System.out.println(i);
					sum=sum+(int)i;
				}
				
				System.out.println("the sum is:"+sum);	
				
				
		
		
	}

}
