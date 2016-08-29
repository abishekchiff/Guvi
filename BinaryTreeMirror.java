import java.util.*;
class Tree2
{
	int data;
	Tree2 left;
	Tree2 right;
	

	
	
}
public class BinaryTreeMirror {
	
	
	public Tree2 insert(int da,Tree2 head)
	{
		if(head==null)
		{	head=new Tree2();
			head.data=da;
			head.left=null;
			head.right=null;
		return head;
		}
		else
		{	
			if(head.data>da)
			{
				head.left=insert(da,head.left);
			}
			else if(head.data<=da)
			{
				head.right=insert(da,head.right);
			}
		}
		return head;
	}
	public Tree2 findMirror(Tree2 head)
	{
		Tree2 temp=new Tree2();
		if(head==null)
		{
			return head;
		}
		else
		{
			temp=head.left;
			head.left=findMirror(head.right);
			head.right=findMirror(temp);

		}
		return head;
	}
	public void display(Tree2 head)
	{
		Queue<Tree2> q=new LinkedList<Tree2>();
		Tree2 cur=head;
		Tree2 temp=new Tree2();
		q.add(cur);
		q.add(temp);
		int level=1;
		while(!q.isEmpty())
		{
			cur=q.remove();
			if(cur==null)
			{
				System.out.print(" ");
			}
			else if(cur==temp )
			{
				if(!q.isEmpty())
				{	System.out.println();
					for(int k=0;k<level;k++)
					{
						System.out.print("/\\");
					}
					q.add(temp);
					System.out.println();
					level++;
					
				}
			}
			else
			{	
				
									q.add(cur.left);
				
				
									q.add(cur.right);
				
				
				System.out.print(cur.data+" ");
								
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Tree2> q=new LinkedList<Tree2>();
		BinaryTreeMirror obj=new BinaryTreeMirror();
		
		Tree2 head=new Tree2();
		head=obj.insert(3,null);
		head=obj.insert(2, head);
		head=obj.insert(5, head);
		head=obj.insert(4, head);
		head=obj.insert(1, head);
		obj.display(head);
		head=obj.findMirror(head);
		System.out.println("After mirroring");
		obj.display(head);
		
		
	}

}
