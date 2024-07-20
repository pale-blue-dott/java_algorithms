import java.util.HashMap;

class LinkedListOperations2{
	public static void main(String[] args){
 		LinkedList cyclic=LinkedList.createLLFromArray(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,45, 55, 87, 98, 645,34, 1,23,95,23});
 		LinkedList uncyclic=LinkedList.createLLFromArray(new int[]{1,2,3,4,5,6,7,8});
 		Node loop=cyclic.head.next.next.next.next.next.next;
 		cyclic.tail.next=loop;
 		//System.out.println(cyclic.tail.next.data);
 		//System.out.println(isCyclic(cyclic));
 		//System.out.println(isCyclic2(cyclic));
 		LinkedList cyclicCheck=LinkedList.createLLFromArray(new int[]{3,4,5,6,7,8,9});
 		cyclicCheck.tail.next=cyclicCheck.head;
 		System.out.println(loopLength1(cyclicCheck));

	}
	public static int loopLength1(LinkedList l){
		Node slow=l.head;
		Node fast=slow.next;
		while(fast!=null){
			if(fast.next==null || fast.next.next==null){
				return 0;
			}else if(fast==slow){
				int counter=1;
				fast=fast.next;
				while(fast!=slow){
					++counter;
					fast=fast.next;
				}
				return counter;
			}
			fast=fast.next;
		}
		return 0;
	}

	public static int loopLength(LinkedList l){
		HashMap<Node, Integer>map=new HashMap<>();
		int count=0;
		Node temp=l.head;
		while(temp!=null){
			if(map.containsKey(temp)){
				count=count-map.get(temp)+1;
				return count;
			}else{
				map.put(temp,++count);
			}
			temp=temp.next;
		}
		
		return 0;
		

	}

	public static boolean isCyclic2(LinkedList l){
		Node slow=l.head;
		Node fast=slow.next;

		while(slow!=null){
			System.out.print("slow: "+slow.data+" fast: "+fast.data+"<-- ->");
			if(fast.next==null || fast.next.next==null){
				System.out.println();
				return false;
			}else if(fast==slow){
				System.out.println();
				return true;
			}
			fast=fast.next.next;
			slow=slow.next;
		}

		return false;
	}

	public static boolean isCyclic(LinkedList l){
		int count=0;
		Node curr=l.head;
		HashMap<Node, Integer> map=new HashMap<>();
		while(curr!=null){
			if(map.containsKey(curr)==true){
				return true;
			
			}else{
				map.put(curr, 1);
			}
			curr=curr.next;
		}
		return false;
	}




}