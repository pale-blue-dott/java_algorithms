class OddEvenLL{
	public static void main(String[] args){
		Node node=LinkedList.convertArr2LL(new int[] {1,2,3,4});
		Node oddEvenHead=oddEvenLL(node);
		LinkedList.printLL(oddEvenHead);

	}

	public static Node oddEvenLL(Node head){
/*
		Node curr1=head;
		Node curr2=head.next;
		Node secHead=curr2;
		boolean flag=false;
		//System.out.println("Ankit Kr");


		while(curr2.next!=null){
			curr1.next=curr2.next;
			curr1=curr1.next;
			if(curr1.next==null){
				curr1.next=secHead;
				curr2.next=null;
				return head;
			}
			curr2.next=curr1.next;
			curr2=curr2.next;
			
		}
		if( curr2.next==null){
			curr1.next=secHead;
		}
		return head;
	}
*/

		Node curr1=head;
		Node curr2=head.next;
		Node secHead=curr2;
		boolean flag=false;
		//System.out.println("Ankit Kr");


		while(curr2.next!=null){
			curr1.next=curr2.next;
			curr1=curr1.next;
			curr2.next=curr1.next;
			curr2=curr2.next;
			if(curr2==null){
				curr1.next=secHead;
				return head;
			}
			
		}
		if( curr2.next==null){
			curr1.next=secHead;
		}
		return head;
	}
}