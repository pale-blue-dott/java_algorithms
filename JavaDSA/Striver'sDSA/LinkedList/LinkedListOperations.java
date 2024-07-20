import java.util.Arrays;

class LinkedListOperations{
	public static void main(String[] args){
		LinkedList linker=LinkedList.createLLFromArray(new int[]{1,1,1,0,0,0,2,2,2,0,0,0,1,2,2,1,0});
		LinkedList linker1=LinkedList.createLLFromArray(new int[]{1,2,3,4,5,5,4,3,2,1});
		//linker.traverse();
		//sort0s1s2s1(linker).traverse();
		//removeNthFromEnd(linker1, 2).traverse();
		//LinkedList palinList=LinkedList.createLLFromArray(new int[]{1,2,3});
		//System.out.println(getRecNode(linker1, linker1.head).data);
		//isPalindrome(palinList);
		//System.out.println(Arrays.toString(getLLIntoArr(linker1, linker1.head, new int[3], 2)));
		//System.out.println(isPalindrome(linker1));
		deleteDuplicates(linker1).traverse();


	}

	 public static LinkedList deleteDuplicates(LinkedList ll) {
 		
     Node curr=ll.head;
     if(ll.head.next==null){
        return ll;
     }
     while(curr!=null){
        Node temp=curr.next;
        while(temp.data==curr.data){
            temp=temp.next;
            if(temp==null){
                curr.next=temp;
                return ll;
            }
        }
        curr=curr.next;
     }
    return ll ;
    }

	

	public static Node getRecNode(LinkedList l, Node half){
		if(half.next==null){
			return half;
		}
		getRecNode(l, half.next);
		return half.next;
	}
/*
	private static ArrayList getLLIntoArr(LinkedList l, Node node, ArrayList<Integer>al){
		if(node.next==null){
			al.add(node.data);
		}
		getLLIntoArr(l, node.next, al);
		al.add(node.data);
		return al;
	}
	*/
	private static int[] getLLIntoArr(LinkedList l, Node node, int[] arr, int i){
		if(node.next==null){
			arr[i]=node.data;
			return arr;
		}
		getLLIntoArr(l, node.next, arr, i-1 );
		arr[i]=node.data;
		return arr;
	}



	public static boolean isPalindrome(LinkedList l){
		Node curr=l.head;
		int count=0;
		while(curr!=null){
			++count;
			curr=curr.next;
		}
		int[] arr=new int[count];
		int[] palinarr=getLLIntoArr(l,l.head,arr,arr.length-1);
		Node temp=l.head;
		for(int i=0; i<arr.length; i++){
			if(temp.data!=arr[i]){
				return false;
			}
			temp=temp.next;
		}
		return true;
	}

	public static LinkedList removeNthFromEnd(LinkedList l, int n){
		Node temp=l.head;
		Node closer=temp;
		while(n>0){
			closer=closer.next;
			--n;
		}
		if(n==0){
			return l;
		}else if(closer==null){
			l.head=l.head.next;
			return l;
		}
		
		while(closer.next!=null){
			temp=temp.next;
			closer=closer.next;
		}
		temp.next=temp.next.next;
		return l;

	}

	public static LinkedList sort0s1s2s1(LinkedList l){
		Node dummy0=new Node(80);
		Node aux0=dummy0;
		Node dummy1=new Node (100);
		Node aux1=dummy1;
		Node dummy2=new Node(200);
		Node aux2=dummy2;

		Node temp=l.head;
		while(temp!=null){
			if(temp.data==0){
				dummy0.next=temp;
				dummy0=temp;
			}else if(temp.data==1){
				dummy1.next=temp;
				dummy1=temp;
			}else{
				dummy2.next=temp;
				dummy2=temp;
			}
			temp=temp.next;
		}
		dummy0.next=aux1.next;
		dummy1.next=aux2.next;
		dummy2.next=null;
		return l;
	}

	public static LinkedList sort0s1s2s(LinkedList l){
	int count0=0;
	int count1=0;
	int count2=0;

	Node temp=l.head;
	while(temp!=null){
		if(temp.data==0){
			++count0;
		}else if(temp.data==1){
			++count1;
		}else{
			++count2;
		}
		temp=temp.next;
	}
	System.out.println("count0: "+count0+"count1: "+count1+"count2: "+count2);
	temp=l.head;
	while(true){
		if(count0!=0){
			temp.data=0;
			--count0;
			temp=temp.next;
			continue;
		}else if(count1!=0){
			temp.data=1;
			--count1;
			temp=temp.next;
			continue;
		}else if(count2!=0){
			temp.data=2;
			--count2;
			temp=temp.next;
			continue;
		}
		if(temp==null){
			break;
		}
	}	
	return l;
	}
}