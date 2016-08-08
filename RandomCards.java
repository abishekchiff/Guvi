import java.util.*;
public class RandomCards {

	
	public int[] swap(int i,int ran,int a[])
	{
		int temp;
		temp=a[i];
		a[i]=a[ran];
		a[ran]=temp;
		return a;
	}
	
	public int[] randomize(int a[])
	{
		
		int ran;
		if(a.length>1)
		{
			int i=a.length-1;
			while(i>0)
			{
				ran=(int)Math.random()*a.length;
				a=swap(i,ran,a);
				i--;
			}
			
		}
		
		return a;
	}
	public void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int a[]=new int[sc.nextInt()];
			RandomCards obj=new RandomCards();
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			a=obj.randomize(a);
			
			obj.print(a);
			
		
		
		}

}
