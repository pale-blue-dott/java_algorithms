class Sort0s1s2sLL{
	public static void main(String[] args){
		Node ll=LinkedList.convertArr2LL(new int[] {0,0,0,0});
		Node sorted=sort0s1s2sLL(ll);
		LinkedList.printLL(sorted);
	}

	public static Node sort0s1s2sLL(Node head){
		Node curr=head;
		Node zero=new Node(-1); Node head0=zero; Node newHead=zero;
		Node one=new Node(-1);  Node head1=one;
		Node two=new Node(-1);  Node head2=two;

		while(curr!=null){
			if(curr.data==0){
				zero.next=curr;
				zero=curr;
			}else if(curr.data==1){
				one.next=curr;
				one=curr;
			}else{
				two.next=curr;
				two=curr;
			}
			curr=curr.next;
		}

		zero.next=head1;
		one.next=head2;
		two.next=null;
		Node temp=head0.next;

	

		while(temp!=null){                   // extremely important case handling especially for linked list
			Node check=temp.next;
			boolean flag=false;
			while(check!=null && check.data==-1 ){  // if we have ever moved beyond the point where we dont know if Node is null or not,
				check=check.next;                   // always check for the Node's validity
				flag=true;
			}
			if(check==null){
				temp.next=null;
			}else if(check.data!=-1 && flag==true){
				temp.next=check;
				temp=temp.next;
				continue;
			}
			temp=temp.next;

		} 
		
		return head0.next;
	}
}