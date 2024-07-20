import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Arrays;

class JavaArrayQuestions{
	public static void main(String[] args){
		//System.out.println(findDuplicateELem(new int[]{1,5,4,2,1,4,7}));
		//System.out.println(findDuplicateELem1(new int[]{1,5,4,2,1,4,7}));
		//System.out.println(findDuplicateELem2(new int[]{1,6, 4, 7, 8, 4, 7, 9, 9}));
		///System.out.println(arrayWithGivenSum(new int[]{1,2,3,4,5,6,7},9));
		int[] first={1,5,10,20,40,80}; int[] second = {6,7,20,80,100}; int[] third={3,4,15,20,30,70,80,120};
		//System.out.println(findCommonElemIn3SortedArr(first, second, third));
		//System.out.println(Arrays.toString(deleteAtK(first,1)));
		//System.out.println(Arrays.toString(separate0sN1s(new int[]{1,1,0})));
		System.out.println(removeDuplicate(new int[] {1,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,8,0,0,0,-1,-1}));
		
	}

	public static ArrayList<Integer> removeDuplicate(int[] arr){               // tricky question
		Hashtable<Integer, Integer> table= new Hashtable<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			int key=arr[i];
			if(!table.containsKey(key)){
				table.put(key, 1);
				list.add(key);
			}
		}
		return list;
	}


	private static void swap(int[] arr, int m, int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}

	public static int[] separate0sN1s(int[] arr){
		int zero=-1;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==0){
				swap(arr, ++zero, i);

			}
		}
		return arr;
	}

	public static int[] deleteAtK(int[] arr, int k){
		for(int i=k+1; i<arr.length; i++){
			arr[i-1]=arr[i];
		}
		return arr;
	}



	public static ArrayList<Integer> findCommonElemIn3SortedArr(int[] arr1, int[] arr2, int[] arr3){
	// technique : put random pointers at random places in three arrays, and based on the current situation constructs the cases and resolve them 
		int i=0; int j=0; int k=0;
		ArrayList<Integer> list = new ArrayList<>();
		while(i<arr1.length && j<arr2.length && k<arr3.length){
			while(arr1[i]>arr2[j]){                   // introduce three pointers for each array each, and while all three
				j++;                                  // pointers are within their respective array domain
			}                                         // catch one array and apply all the condiitons with respective to rest of arrays
			while(arr1[i]>arr3[k]){
				k++;                                   
			}                                         //since comparison is made one at a time, one of the contion will always be true
			while(arr1[i]<arr2[j]){
				i++;
			}                                         // if arr1[i]<arr[j], arr1[i]<arr3[k], arr1[i]>arr2[j], arr1[i]>arr3[k]
			while(arr1[i]<arr3[k]){
				i++;                                   // and if arr1[i] == arr2[j] == arr3[k], this conditon is partial solution
			}
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
				
				list.add(arr1[i]);
				i++; j++; k++;
			}

		}
		return list;
	}

	public static ArrayList<ArrayList> arrayWithGivenSum(int[] sortedArr, int sum){
		ArrayList<ArrayList> list = new ArrayList<>();
		for(int i=0; i<sortedArr.length; i++){              // in similar question if we are asked to find out all the pair(2 val) 
			int currSum=0;                                  // inside araay with provided sum, we can provide two pointer at both     
			int start=i;                                    // the extremes of the array, while(low<end) 
			int end=start;                                  // if(arr[low]+arr[high]<sum) -> low++, if(arr[low]+arr[high]>sum) -> end--;
			while(end<sortedArr.length && currSum<sum){     // else, register low and high, iow++ and end--
				currSum=currSum+sortedArr[end++];
			}
			if(currSum==sum){
				ArrayList<Integer> nestedList = new ArrayList<>();
				nestedList.add(start);
				nestedList.add(--end);
				list.add(nestedList);
			}

		}
		return list;
	}

	public static ArrayList findDuplicateELem2(int[] arr){
		Hashtable<Integer, Integer> table = new Hashtable<>();
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			if(table.containsKey(arr[i])){
				list.add(arr[i]);
			}else{
				table.put(arr[i],1);
			}
		}
		return list;
	}


	public static ArrayList<Integer> findDuplicateELem1(int[] arr){
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list= new ArrayList<>();   // HashSet : add() - add 'obj' toHashSet, contains(obj) - checks 'obj' availability  
		for(int i=0; i<arr.length; i++){               //          delete(obj) - deletes 'obj' from HashSet
			set.add(arr[i]);
		}
		for(int i=0; i<arr.length; i++){
			if(set.contains(arr[i])){
				set.remove(arr[i]);
			}else{
				list.add(arr[i]);
			}
		}
		return list;
	}



	public static ArrayList<Integer> findDuplicateELem(int[] arr){
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					if(!list.contains(arr[i])){
						list.add(arr[i]);
					}
				}
			}
		}
		return list;
	}
}