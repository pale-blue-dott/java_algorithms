import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;


class twoSum{
	public static void main(String[] args){
		int[] array={1,2,346,67,89,7,34,2,8,8};

		//int[] ans=(twoSum3(array,3));
		//System.out.println(Arrays.toString(ans));
		Arrays.sort(array);
		System.out.println(Arrays.toString(twoSum4(array,9)));
		System.out.println(twoSum5(array,53));


	}
	public static boolean twoSum5(int[] arr, int sum){
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int temp=arr[start]+arr[end];
			if(temp==sum){
				
				return true;
			}else if(temp<sum){
				start++;
			}else{
				end--;
			}
		}
		return false;
	}

	public static int[] twoSum4(int[] arr, int sum){
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int temp=arr[start]+arr[end];
			if(temp==sum){
				int[] sol = new int[] {start, end};
				return sol;
			}else if(temp<sum){
				start++;
			}else{
				end--;
			}
		}
		return null;
	}

	public static int[] twoSum3(int[] arr, int sum){
		Hashtable<Integer, Integer> table =new Hashtable<>();
		for(int i=0; i<arr.length; i++){
			int firstKey=arr[i];
			int secondKey=sum-arr[i];

			if(table.containsKey(secondKey)){
				int[] ans = new int[]{i,table.get(secondKey)};
				if(ans[0]>ans[1]){
					int temp=ans[0];
					ans[0]=ans[1];
					ans[1]=temp;
				}
				return ans;
			}else{
				table.put(firstKey, i);
			}

		}
		return null;
	}

	public static int[] twoSum2(int[] arr, int sum){
		for(int i=0; i<arr.length; i++){
			int otherNumber=sum-arr[i];
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]==otherNumber){
					if(i!=j){
				   		int[] ans=new int[]{i,j};
				   		return ans;
				   	}/*  else{
				   		   continue  ||  break;
				   	}*/
				}
			}
		}
		return null;
	}

	public static boolean twoSum1(int[] arr, int sum){
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			int firstKey=arr[i];
			int secondKey=sum-firstKey;
			if(hash.containsKey(secondKey)){
				return true;
			}else{
				hash.put(firstKey,i);
			}
		}
		return false;
	}

	public static boolean twoSum(int[] arr, int sum){
		for(int i=0; i<arr.length; i++){
			int otherNumber=sum-arr[i];
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]==otherNumber){
					if(i!=j){
						return true;
					}
				}
			}
		}
		return false;
	}

	

	
}