class RemoveNthNode{
	public static void main(String[] main){
		Node removeN=LinkedList.convertArr2LL(new int[]{1,2,3,4,5,6,7});
		LinkedList.printLL(removeN);
		Node returned=removeNthNode(removeN, 10);
		LinkedList.printLL(returned);
	}

	public static Node removeNthNode(Node head, int k){
		int count=0;
		Node curr=head;
		while(count<=k){    //counter increases inside the body,
			curr=curr.next;
			if(curr==null){
				System.out.println("index out of LinkedList length");
				return head;
			}
			++count;
		}
		Node temp=head;
		while(curr!=null){
			curr=curr.next;
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;

	}
}