//11 - Write a function to reverse the order of words in a string in place.
import java.util.*;
public class ReverseWordOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char  s[]=sc.nextLine().toCharArray();
		int j=0;
		char temp='\0';
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==' '||i==0)//here i==0 is done to check the first word in the list
			{
				
				if(i!=0)// to avoid spaces being filled in the second and forth coming words
				{
					i++;
				}
				//search through the string to find the index of the next space character 
				for(j=i+1;j<s.length;j++)
				{
					if(s[j]==' ')
					{
						j=j-1;
						break;
					}
					
				}
				if(j==s.length)
				{
					j=j-1;
				}
				//after finding the index of the next space ,swap the last letter with the first letter using the last 
				// and first index
				for(int k=i,m=j;k<=(i+j)/2;k++,m--)
				{
					temp=s[k];
					s[k]=s[m];
					s[m]=temp;
					
					
				}
				
				//change i to point the letter after the last index of the particular word in the string
				i=j;
			}
		}	
		for(int l=0;l<s.length;l++)
		System.out.print(s[l]);

	}

}
