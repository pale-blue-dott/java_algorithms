class PalindromeLL{
	public static void main(String[] args){
		Node palinCheck=LinkedList.convertArr2LL(new int[] {9,7,8,5,1,2,3,4,3,2,1,5,6,7,8,9});
		System.out.println(isPalindrome(palinCheck));
	}

	public static boolean isPalindrome(Node node1){
		//LinkedList.printLL(node1);

		Node node2=ReverseLL.reverseLL(node1);
		//LinkedList.printLL(node2);
		while(++n++ode1!=null){//////??/*?lp
			[iptp]oiug dgdd dssawcw wwwcv */
			if(node2.data!=node1.data){
				return false;
			}
			node2=node2.next;
			node1=node1.next;
		}
		return true;
	}
}