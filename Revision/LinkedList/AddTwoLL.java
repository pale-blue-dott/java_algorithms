class AddTwoLL{
	public static void main(String[] args){
		Node head1=LinkedList.convertArr2LL(new int[]{1,2,3,4,5,6,7,8,9,9,8,7,6,5,4});
		Node head2=LinkedList.convertArr2LL(new int[]{9,9,9,9,9,9,9});
		Node head3=addLL(head1, head2);
		LinkedList.printLL(head3);
		//System.out.println(9%10);
	}

	public static Node addLL(Node head1, Node head2){
		Node temp1=head1;
		Node temp2=head2;
		int carry=0;
		Node temp3=new Node(-1);         // we make this auxiliary node, for loop variant to sustain, we need a certain configuration
		Node head3=temp3;                // that there is already a node, we just have to add its next nodes, moreover we must have a
                                         // reference to the new head Node, if we put inside loop, a head node is created everytime.
		int sum=0;
		while(temp1!=null &&  temp2!=null){
			sum=temp1.data+temp2.data+carry;
			carry=sum/10;
			sum=sum%10;
			
			Node newNode=new Node(sum);
			temp3.next=newNode;
			temp3=newNode;

			temp1=temp1.next; temp2=temp2.next;

		}
		while(temp1!=null){
			sum=temp1.data+carry;
			carry=sum/10;
			sum=sum%10;
			Node newNode=new Node(sum);
			temp3.next=newNode;
			temp3=newNode;
			temp1=temp1.next;
		}
		while(temp2!=null){
			sum=temp2.data+carry;
			carry=sum/10;
			sum=sum%10;
			Node newNode=new Node(sum);
			temp3.next=newNode;
			temp3=newNode;
			temp2=temp2.next;
		}
		if(carry>0){
			temp3.next=new Node(carry);
		}
		head3=head3.next;
		return head3;
	}
}