import java.util.*;


public class PairWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String str[]=sc.nextLine().split(",");
		
		int a[]=new int[str.length];
		List<Integer> l=new ArrayList<Integer>();
		
		for(int k=0;k<str.length;k++)
		{
			a[k]=Integer.parseInt(str[k]);
			l.add(k,a[k]);
		}
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(i!=j)
				{
					int sum=a[i]+a[j];
					if(l.contains(sum))
					{
						
						System.out.println(i+","+j+"\tsum="+sum);
						i=str.length;
						break;
					}
				}
			}
		}
		
		

	}

}
