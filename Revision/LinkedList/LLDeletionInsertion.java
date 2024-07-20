

class LLDeletionInsertion{
	public static Node insertHead(Node head, int val){
		Node newHead=new Node(val);
		newHead.next=head;
		head=newHead;
		return newHead;
	}

	public static Node deleteHead(Node head){
		head=head.next;
		return head;
	}	

	public static Node insertTail(Node tail, int val){
		Node curr=tail;
		if(tail==null){
			Node head=new Node(val);
			return head;
		}
		while(curr.next!=null){
			curr=curr.next;
		}

		if(curr.next==null){
			curr.next=new Node(val);
		}
		curr.next.next= null;
		return tail;
	}


	public static Node deleteLast(Node head){
		Node temp=head;
		if(head==null){
			return null;
		}
		if(head.next==null){
			head=null;
			return head;
		}
		while(temp.next.next!=null){  // for deletion temp.next.next == null is mandatory
			temp=temp.next;           // we will bring the node to fulfill this condtion
		}
		temp.next=null;
		return head;
	}

	public static Node insertAtK(Node head, int val, int posi){
		if(posi==1){
			return insertHead(head,val);

		}
		int count=1;
		Node curr=head;
		while(count<posi-1 && curr!=null){  // due to this while condition, involving multiple checks, we dont have to
			++count;                        // manually write multiple condition checks for multiple case, 
			curr=curr.next;                 // see while() of deleteKthNode
		}
		if(curr==null){
			System.out.println("Index "+posi+" does not exist.");
			return null;
		}else{
			Node nextCurr=curr.next;
			curr.next=new Node(val);
			curr.next.next=nextCurr;
			return head;
		}
	}

	public static Node deleteAtK(Node head, int k){
		int count=1;             // has not gone through any while loop yet hence count==0;
		Node temp=head;
		if(k==1){                // while(=>, =<) : "=" allows the access to the while body of lastest configuration,  
			head=head.next;      // while(<, >) does not allow any access to the body of latest configuration
		}
		while(count<k-1){      // clear while loop concept from this example
			temp=temp.next;
			++count;
		}
		if(temp.next!=null && temp.next.next!=null){
			//System.out.println("acess available");
			temp.next=temp.next.next;
		}else if(temp.next==null){
			System.out.println("Index does not exist");
		}else if(temp.next.next==null){
			temp.next=null;
		}
		return head;
	}





	public static void main(String[] args){
		Node m=LinkedList.convertArr2LL(new int[]{1,2,3,4,5,6});
		LinkedList.printLL(m);
		Node newHead=deleteHead(m);
		//LinkedList.printLL(m);
		LinkedList.printLL(newHead);
		Node delete2=deleteAtK(newHead, 5);
		LinkedList.printLL(delete2);
		Node newest=insertHead(delete2, 0);
		LinkedList.printLL(newest);
		Node atTail=insertTail(newest ,8);
		LinkedList.printLL(atTail);
		Node insertedAt5=insertAtK(atTail, 9, 1);
		LinkedList.printLL(insertedAt5);


	}
}