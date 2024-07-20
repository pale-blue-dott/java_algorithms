

class Node{
	int data;
	Node next;

	protected Node(int data){
		this.data=data;
		this.next=null;
	}

	public Node(int data, Node other){
		this.data=data;
		this.next=other;
	}
}


public class LinkedList{
	Node head;
	Node tail;

	LinkedList(){
		this.head=null;
		this.tail=null;
	}

	public void insert(int data){
		Node node=new Node(data);
		if(this.head==null){
			this.head=node;
			this.tail=node;
		}else{
			tail.next=node;
			tail=node;
		}
	}

	public void traverse(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println(current);
	}

	public static int length(LinkedList l){
		int i=0; 
		if(l.head!=null){
			Node temp=l.head;
			++i;
			while(temp!=null){
				++i;
				temp=temp.next;
				
			}

		}else{
			return 0;
		}
		return --i;
	}
	public boolean search1(int data){
		//method: yaha se yaha tk gye, mil gya toh true
		// agar loop terminate hua toh false.
	    Node temp=this.head;
	    while(temp!=null){
	    	if(temp.data==data){
	    		return true;
	    	}
	    	temp=temp.next;
	    }
	    return false;
	}

	public boolean search(int data){
		// method: complicated method
		Node temp=this.head;
		while(temp!=null && temp.data!=data){
			temp=temp.next;
		}
		if(temp.data==data){
			return true;
		}else if(temp==null){
			return false;
		}
		return false;
	}

	public void deleteHead(){
		if(this.head==null || this.head.next==null){
			return ;
		}
		this.head=this.head.next;

	}

	public void deleteAtPosition(int k){
		int position=0;
		Node temp=this.head;
		Node prev=null;
		if(this.head.next==null){
			this.head=null;
			return;
		}
		while(temp!=null){
		
			if(position==k){
				prev.next=temp.next;
				return ;
			}
			//System.out.print(temp.data+" ");
			prev=temp;
			temp=temp.next;
			++position;

		}
		if(temp==null){
			System.out.println("Position does not exist");
		}else{
			System.out.println();
		}
	}

	public void deleteTail(){
		Node temp=this.head;
		if(this.head==null || this.head.next==null){
			this.head=null;
			return ;
		}
		while(temp.next.next!=null){
			temp=temp.next;
		}
		this.tail=temp;
		temp.next=null;
	}

	public void deleteTail2(){
		Node temp=this.head;
		if(this.head==this.tail){
			this.head=null;
			return;
		}
		while(temp.next!=this.tail){
			temp=temp.next;
		}
		this.tail=temp;
		temp.next=null;

	}

	public static LinkedList mergeTwoLL(LinkedList l, LinkedList m){
		Node temp=l.head;
		Node temp2=m.head;
		LinkedList mergedLL=new LinkedList();
		while(temp!=null && temp2!=null){
			if(temp.data<temp2.data){
				mergedLL.insert(temp.data);
				temp=temp.next;
			}else{
				mergedLL.insert(temp2.data);
				temp2=temp2.next;
			}
		}

		while(temp!=null){
			mergedLL.insert(temp.data);
			temp=temp.next;
		}
		while(temp2!=null){
			mergedLL.insert(temp2.data);
			temp2=temp2.next;
		}
		return mergedLL;
	}

	public LinkedList removeMiddle(){
		LinkedList ll=this;
		Node temp=this.head;
		Node curr=temp;
		Node prev=null;
		//Node prev=temp;
		if(temp==null){
			return null;
		}else if(temp.next==null){
			return this;
		}
		while(temp.next!=null && temp.next.next!=null){
			prev=curr;
			curr=curr.next;
			temp=temp.next.next;
		}
		prev.next=curr.next; 
		return this;
	}

	public LinkedList reverse(){
		// method: 1. create three Node referneces, namely previous, current, next;
                // 2. refer current to head and both rest to null;
		        // 3. while current refers to some node, next= current.next, current.next=previous
		        // 4. refer prev to current and current to next  
			LinkedList ll=this;
			Node current=this.head;
			Node last=current;
			Node next=null;
			Node previous=null;
			while(current!=null){
				next=current.next;
				current.next=previous;
				previous=current;
				current=next;
			}
			this.head= previous;
			this.tail=last;
			return ll;
		/*
		LinkedList ll=this;
		Node prev=this.head;
		this.tail=prev;	
		Node curr=this.head.next;
		Node temp=curr.next;
		while(temp!=null){
			curr.next=prev;
			prev=curr;
			curr=curr.next;
			temp=curr.next.next;
			this.head=temp;
		}

		return ll;
		
		LinkedList ll=this;
		

		Node first=this.head;
		Node last=first;
		Node second=this.head.next;
		Node temp=second;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp=second.next;
			second.next=first;
			first=second;
			second=temp;
			//temp=temp.next;
		}
		this.head=second;
		this.tail=last;
		last.next=null;
		return  this.head;

		*/
	}

	public static LinkedList createLLFromArray(int[] arr){
		LinkedList linked = new LinkedList();
		for(int i=0; i<arr.length; i++){
			linked.insert(arr[i]);
		}
		return linked;
	}

	

	public static void main(String[] args){
		LinkedList ll =new LinkedList();
		//ll.insert();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		//ll.insert(6);
		ll.traverse();

		LinkedList ll2=new LinkedList();
		ll2.insert(-1);
		ll2.insert(4);
		ll2.insert(5);
		//ll2.traverse();
		//ll2.deleteTail();
		//ll2.traverse();
		//ll2.deleteAtPosition(1);
		//ll2.traverse();

		//ll.traverse();
		//System.out.println(LinkedList.length(ll));
		//System.out.println(ll.search1(5));
		//ll.deleteHead();
		
		//ll.traverse();
		//ll.deleteTail2();
		//ll.traverse();
		//mergeTwoLL(ll, ll2).traverse();

		//ll.removeMiddle();
		//ll.reverse();
		//System.out.println("Ankit Kr");
		//ll.traverse();
		ll.reverse();
		ll.traverse();
		ll2.traverse();
		ll2.reverse();
		ll2.traverse();
		LinkedList lll = null;

		//System.out.println(lll.head);
	}
}