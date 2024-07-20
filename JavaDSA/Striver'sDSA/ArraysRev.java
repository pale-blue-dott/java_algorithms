import java.util.Arrays;

class ArraysRev{
	public static void main(String[] args){
		//System.out.println(getLargestElem(new int[] {222,3,456,786,4,32,4,567,88,8,99,86,6,6}));
		//System.out.println(getSecLargestElem2(new int[] {1,1,1,1,1}));
		//System.out.println(Arrays.toString(secLargestNSmallest(new int[] {222,3})));
		//System.out.println(isSorted(new int[] {3,4,5,6,7,10}));
		System.out.println(Arrays.toString(removeDuplicates(new int[] {1,1,1,1,2,2,3,3,3,4})));
	}
	private static void swap(int [] arr, int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	public static int[] removeDuplicates(int[] arr){
		int curr=1;
		for(int i=1; i<arr.length; i++){
			if(arr[i]!=arr[i=1]){
				swap(arr, i);
				++curr;
			}
		}
		return arr;
	}

	public static boolean isSorted(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				return false;
			}
		}
		return true;
	}

	public static int[] secLargestNSmallest(int[] arr){
		int largest=Integer.MIN_VALUE; int smallest=Integer.MAX_VALUE;
		int secLargest=Integer.MIN_VALUE; int secSmallest = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>largest){
				secLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secLargest && arr[i]!=largest){
				secLargest=arr[i];
			}
			if(arr[i]<smallest){
				secSmallest=smallest;
				smallest=arr[i];
			}else if(arr[i]<secSmallest && secSmallest>smallest){
				secSmallest =arr[i];
			}
		} 
		return new int[] {secSmallest, secLargest};
	}

	public static int getSecLargestElem2(int[] arr){
		Arrays.sort(arr);
		int j=arr.length-1;
		while(j>=1 && arr[j-1]==arr[j]){
			j--;
		}
		if(j==0){
			System.out.println("No second largest element exists");
			return -1;
		}
		return arr[j-1];

	}

	public static int getLargestElem(int[] arr){
		int largest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		return largest;
	}
	public static int secLargest(int[] arr){
		int largest=Integer.MIN_VALUE;
		int secLargest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>largest){
				secLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secLargest && arr[i]!=largest){
				secLargest=arr[i];
			}
		}
		return secLargest;
	
	}


}