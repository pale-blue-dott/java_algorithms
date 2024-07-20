import java.util.Arrays;
import java.util.HashMap;

class Array0s1s{
	public static void main(String[] args){
		int[] array={2,2,2,2,1,1,1,0,0,0};
		System.out.println(Arrays.toString(arrange0s1s(array)));
	}
	/*

	public static int[] arrange0s1s2s(int[] arr){
		int zeros=0;
		int ones=0;
		int twos=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==0){
				zeros++;
			}else if(arr[i]==1){
				ones++;
			}else{
				twos++;
			}
		}

	}
	*/

	public static HashMap arrange0s1s1(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>(); //elem, frequency
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}else{
				map.put(arr[i],1);
			}
		}
		
		return map;


	}

	public static int[] arrange0s1s(int[] arr){
		for(int i=0; i<arr.length; i++){
			int j= arr.length-1;
			while(j>=i+1){            // condition i!=j+1 wont work i=9, j=9, i=9, j=8, ... i=9, i-1 is a possible case
				if(arr[j]<arr[j-1]){  // hence i!=i+1 is not the correct condition
					swap(arr, j, j-1);
				}
				System.out.println(Arrays.toString(arr)+" i: "+i+", j: "+j);
				j--;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
}