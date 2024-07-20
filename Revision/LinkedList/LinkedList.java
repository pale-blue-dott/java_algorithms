class Node{
 	int data;
	Node next;

	Node(int m){
		this.data=m;
		this.next=null;
	} 

	Node(int n, Node m){
		this.data=n;
		this.next=m;
	}
}

public class LinkedList{
	Node head;

	public static Node convertArr2LL(int[] arr){
		Node head = new Node(arr[0]);
		Node mover= head;

		for(int i=1; i<arr.length; i++){
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;	
		}
		return head;
	}

	public static void printLL(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public static int getLLLength(Node head){
		int count=0;
		Node temp=head;
		while(temp!=null){
			++count;
			temp=temp.next;
		}
		return count;
	}

	public static boolean search(Node head, int val){
		Node temp=head;
		while(temp!=null){
			if(temp.data==val){
				return true;
			}
			temp=temp.next;
		}
		return false;
	}

	



	public static void main(String[] args){
		Node n=convertArr2LL(new int[]{1,2,3,4,5});
		printLL(n);
		//System.out.println(getLLLength(n));
		//System.out.println(search(n, 15));
		
	}
}