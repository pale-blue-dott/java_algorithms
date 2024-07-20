

class LLOperations{
	
	public static void main(String[] args){
		
		LinkedList linked =new LinkedList();
		linked.insert(1);
		linked.insert(2);
		linked.insert(3);
		linked.insert(4);
		linked.insert(5);
		linked.traverse();

		//addOne(linked).traverse();

		//LinkedList linked1 =new LinkedList();
		//LinkedList linked2 =new LinkedList();

		//linked1.insert(1);
		//linked1.insert(2);
		//linked1.insert(3);
		//linked1.insert(4);

		//linked2.insert(3);
		//linked2.insert(4);

		//addTwoLL(linked1, linked2).traverse();
		
		//System.out.println(addTwos(0,0));
		reverseUsingRec(linked, linked.head).traverse();
		
		//reversePrint(linked.head);





	}
	public static void reversePrint(Node node){
		if(node==null){
			return ;  // return of void function return type simply kills the function call
		}
		reversePrint(node.next);
		System.out.print(node.data+" ");
	}

	public static LinkedList reverseUsingRec(LinkedList l,Node node){
		// argument reference variable of recusrion might be same in all recursion call, 
		// but it refers to differnt object/entity in each call
		if(node.next==null){           //every problem and subproblem must return a value of specified return type
			l.head=node;
			return l;

		}
		reverseUsingRec(l,node.next); // if statements lower than return must be executed before exiting the current call,
		Node next=node.next;          // opertion can be collected in a variable instead of returning it right now.
		next.next=node;               // and that variable can be return whereever necessary.
		node.next=null;
		
		l.tail=node;
		return l;
	}

	public static int addTwos(int count, int sum){
		if(count==100){
			sum+=count;
			return sum;
		}
		sum=sum+count;
		return addTwos(count+1, sum);
	}

	public static LinkedList addOne(LinkedList l){
		LinkedList ll=l.reverse();
		Node curr=ll.head;
		
		int sum=curr.data+1;
		//System.out.println(sum);
		curr.data=sum%10;
		int carry=sum/10;
		curr=curr.next;

		while(curr!=null){
			if(carry>0){
				sum=curr.data+carry;
				//System.out.println(sum);
				curr.data=sum%10;
				carry=sum/10;
				curr=curr.next;
			}else{
				break;
			}
			
		}
		if(carry>0){
			ll.insert(carry);
		}


		return ll.reverse();

	}

	public static LinkedList addTwoLL(LinkedList l1, LinkedList l2){
		LinkedList l3=new LinkedList();
		LinkedList revL1=l1.reverse();
		LinkedList revL2=l2.reverse();

		Node curr1=revL1.head;
		Node curr2=revL2.head;
		Node curr3=l3.head;
		int carry=0;
		int sum=0;

		while(curr1!=null || curr2!=null){
			if(curr2!=null && curr1==null){
				sum=curr2.data+carry;
				l3.insert(sum%10);
				carry=sum/10;
				curr2=curr2.next;
			}else if(curr1!=null && curr2==null){
				sum=curr1.data+carry;
				l3.insert(sum%10);
				carry=sum/10;
				curr1=curr1.next;
			}else if(curr1!=null && curr2!=null){
				sum=curr1.data+curr2.data+carry;
				l3.insert(sum%10);
				carry=sum/10;
				curr2=curr2.next;
				curr1=curr1.next;
	
			}
		}
		if(carry>0){
			l3.insert(carry);
		}
		return l3.reverse();


	}

	


}