import java.util.ArrayList;

class ArrayRecursion{
	//static String name="ankit";  // static variable defined at class leveel, hence it must be accessible from all class entities. 
	public static void main(String[] args){
	//	System.out.println(isSorted(new int[]{0,1,1,2,3,4}, 0));
		//System.out.println(linearRecurSearch(new int[]{23,54,67,85,12},0,85));
		//System.out.println(findAllIndex(new int[]{1,12,114,15,12,12,12,18,20,21,24,22,12}, 0, 12, new ArrayList<>()));
		System.out.println(findAllIndex1(new int[]{1,12,114,15,12,12,12,18,20,21,24,22,12}, 0, 12));
		ArrayList<String>list1=new ArrayList<>();
		ArrayList<String>list2=new ArrayList<>();
		list1.add("Aadarsh");
		list2.add("AAru");
		list2.addAll(list1);
		System.out.println(list2);
	}





	
	public static ArrayList<Integer> findAllIndex1(int[] arr, int start, int key){
		ArrayList<Integer> arl=new ArrayList<>();
		if(arr.length==start){
			return arl;
		}else if(arr[start]==key){
			arl.add(start);
		}
		arl.addAll(findAllIndex1(arr, start+1, key));
		return arl;
	}
	


	public static ArrayList findAllIndex(int[] arr, int start, int key, ArrayList<Integer> arl){
		//System.out.println(name);
		if(start==arr.length){
			return arl;
		}else if(arr[start]==key){
			arl.add(start);
		}
		return findAllIndex(arr, start+1, key, arl);  // whatever subproblem returns, return that in the main problem as well.
	}

	public static boolean linearRecurSearch(int[] arr, int start, int key){
		if(start==arr.length){
			return false;
		}
		else if(arr[start]==key){
			return true;
		}
		return linearRecurSearch(arr, start+1, key);   // return what is the solution of arr[1,n-1];
	}

	public static boolean isSorted(int[] arr, int start){
		if(start==arr.length-2){
			if(arr[start]>arr[start+1]){
				return false;
			}
			return true;
		}
		if(arr[start]>arr[start+1]){   // as soon as the subproblem gives a complete solution without involving
			return false;              // any recursive call, control starts moving back towards the main problem
		}
		return isSorted(arr, start+1);
		
	}
}