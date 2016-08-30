/*Write a function that returns true if the given Binary Tree is SumTree else false. A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present in its left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.

Following is an example of SumTree.

          26
        /   \
      10     3
    /    \     \
  4      6      3*/
import java.util.LinkedList;
import java.util.Queue;
class Tree3
{
	int data;
	Tree3 left;
	Tree3 right;
	

	
	
}
public class SumBinaryTree {
	
	
	public Tree3 insert(int da,Tree3 head)
	{
		
			
		Queue<Tree3> q=new LinkedList<Tree3>();
		Tree3 newNode=new Tree3();
		newNode.data=da;
		
		if(head==null)
		{
			head=newNode;
			return head;
		}
		q.add(head);
		Tree3 cur=new Tree3();
		while(!q.isEmpty())
		{
			cur=q.remove();
			if(cur.left!=null)
			{
				q.add(cur.left);
			}
			else
			{
				cur.left=newNode;
				break;
			}
			if(cur.right!=null)
			{
				q.add(cur.right);
			}
			else
			{
				cur.right=newNode;
				break;
			}
			
		}
		return head;
	}
	public Tree3 findMirror(Tree3 head)
	{
		Tree3 temp=new Tree3();
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
	public void display(Tree3 head)
	{
		Queue<Tree3> q=new LinkedList<Tree3>();
		Tree3 cur=head;
		Tree3 temp=new Tree3();
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
						System.out.print("/ \\");
						
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
	public int checkSumTree(Tree3 head)
	{
		int left=0;
		int right=0;
		if(head==null)
		{
			return 0;
		}
		else
		{
			
			left=checkSumTree(head.left);
			
			
			right=checkSumTree(head.right);
			
			if(left==-1 || right==-1)
			{
				return -1;
			}
			else if(left+right==head.data || (head.left==null && head.right==null))
			{
				
				return head.data+left+right;
			}
			else
			{
				return -1;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Tree3> q=new LinkedList<Tree3>();
		SumBinaryTree obj=new SumBinaryTree();
		
		Tree3 head=new Tree3();
		head=obj.insert(26,null);
		head=obj.insert(10, head);
		head=obj.insert(3, head);
		head=obj.insert(4, head);
		head=obj.insert(6, head);
		head=obj.insert(3, head);
		obj.display(head);
		//head=obj.findMirror(head);
	//	System.out.println("After mirroring");
	//	obj.display(head);
		
		
		int res=obj.checkSumTree(head);
		if(res!=-1)
		{
			System.out.println("yes it a sum tree");
		}
		else
		{
			System.out.println("No its not a sum tree");
		}
		
	}

}
