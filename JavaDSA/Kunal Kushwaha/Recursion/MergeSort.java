import java.util.Arrays;

class MergeSort{
	public static void main(String[] args){
		System.out.println(Arrays.toString(mergeSort(new int[]{4,3,2,1,5,6,5,90,87,-95,108},0,10)));
		//System.out.println(Arrays.toString(merge(new int[]{4,5,12,18,27}, new int[]{9,10,12,17})));
	}
	private static int[] merge(int[] arr1, int[] arr2){
		int[] temp = new int[arr1.length+arr2.length];
		int i=0; int j=0; int k=0;
		while(i<arr1.length && j<arr2.length){  
			if(arr1[i]<arr2[j]){
				temp[k]=arr1[i++];
			}else{
				temp[k]=arr2[j++];
			}
			k++;
		}
		while(i<arr1.length){
			temp[k++]=arr1[i++];
		}
		while(j<arr2.length){
			temp[k++]=arr2[j++];
		}
		return temp;
	}

	public static int[] mergeSort(int[] arr, int start, int end){
		int mid=(start+end)/2;               //start=4, end=4
		if(start==end){                  
			return new int[]{arr[start]};
		}
		int[] left= mergeSort(arr, start, mid);
		int[] right=mergeSort(arr, mid+1, end);
		//return merge(left, right);
		int[] temp = new int[left.length+right.length];
		int i=0; int j=0; int k=0;
		while(i<left.length && j<right.length){  
			if(left[i]<right[j]){
				temp[k]=left[i++];
			}else{
				temp[k]=right[j++];
			}
			k++;
		}
		while(i<left.length){
			temp[k++]=left[i++];
		}
		while(j<right.length){
			temp[k++]=right[j++];
		}
		return temp;
	

	} 

}