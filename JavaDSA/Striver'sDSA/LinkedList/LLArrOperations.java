class LLArrOperations{

	public static void main(String[] args){
		LinkedList arrOperations=LinkedList.createLLFromArray(new int[]{1,2,3,3,3,3,4,5,6,6,6,7,8,3,3,3,3,9,3,3,3,3});
		deleteAllOccurences(arrOperations, 3).traverse();
	}

	public static LinkedList deleteAllOccurences(LinkedList l, int val){
		Node temp=l.head;
		while(temp!=null){
			Node start=temp;
			boolean flag=false;
			while(start.next!=null && start.next.data==val){
				start=start.next;
				flag=true;
			}
			if(start.next==null){
				temp.next=null;
				return l;
			}
			if(flag==true){
				temp.next=start.next;
				//break;
			}
			temp=temp.next;
		}
		System.out.println(temp.data);
		return l;
	}
}