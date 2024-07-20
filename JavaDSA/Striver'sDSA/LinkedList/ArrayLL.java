class ArrayLL{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		//LinkedList ll=new LinkedList();
		System.out.println("a"=="a");
		String str="Ankit";
		System.out.println(str[0]);
		
	/* array-as-Node
      
		Node start = arrayAsNode(new int[]{0,1,2,3,4,5});
		while(start!=null){
			System.out.print(start.data+"-->");
			start=start.next;
		}
		System.out.println("null");

		}

	*/

	/*
		Node ll1=arrayAsLL(new int[]{0,1,2,3,4,5});
		System.out.println(ll1.data);
	*/
	}

	/*


		
	public static Node arrayAsLL(int[] arr){
		LinkedList ll=new LinkedList();
		
		for(int i=0; i<arr.length; i++){
			ll.insert(arr[i]);
		}
		return ll.head;
	}

	public static Node arrayAsNode(int[] arr){
		//LinkedList ll=new LinkedList();
		
		Node previous = new Node(arr[0]);
		Node head=previous;
		for(int i=1; i<arr.length; i++){
			
			Node current= new Node(arr[i]);
			previous.next=current;
			previous=current;

		}
		return head;
	}

	*/
}
