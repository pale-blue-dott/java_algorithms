import java.util.Arrays;
import java.util.ArrayList;


class Arrays2{

	public static void main(String[] args){
		int [] array = {0,0,34,5,64,2,23,45,6,78,123,4};
		int[] array1={1,0,0,6,7,0,0,0,0,0,0,0,2,3, 1,0,0,0,0,78,98, 0,0};
		int[] array2={0,1,3,6,7,23,65,123};
		int[] array3={0,1,2,3,4,56,78};
		//System.out.println(Arrays.toString(intersectionArray(array2, array3)));
		
		//System.out.print(Arrays.toString(mergingTwoSortedArrays(array3,array2)));
		//System.out.println(linearSearch(array, -123));
		//System.out.println(Arrays.toString(moveZeroToEnd2(array)));
		//reverse(array, 0, 9);
		//System.out.println(Arrays.toString(array));
		// System.out.println(Arrays.toString(moveOneByLeft(array)));
		//+System.out.println(Arrays.toString(leftRotateByN(array, 2)));
		//System.out.println(Arrays.toString(leftRotateByN1(array, 2)));
		//System.out.println(Arrays.toString(zerosToEnd(array1)));

	}

	public static int[] intersectionArray(int[] arr, int[] arr2){
		int i=0;
		int j=0;
		int k=0;
		int[] intersection = new int[15];
		while(i<arr.length && j<arr2.length){                
			if(arr[i]<arr2[j]){
				i++;
			}else if(arr[i]>arr2[j]){
				j++;
			}else{
				intersection[k]=arr[i];
				i++;
				j++;
				k++;
			}
		}
		
		return intersection;
	}

	public static int[] mergingTwoSortedArrays(int[] arr1, int[] arr){
		int k=0;
		int i=0;
		int j=0;
		int[] temp=new int[arr.length + arr1.length];
		//int currentIndex=-1;

		while(i<arr.length && j<arr1.length){
			
			if(arr[i]<arr1[j]){
			   temp[k++]=arr[i++];
			}else{
				temp[k++]=arr1[j++];
			}
		}

		while(i<arr.length){
			temp[k++]=arr[i++];
		}
		while(j<arr1.length){
			temp[k++]=arr1[j++];
		}
		return temp;
	}

	//union of arrays 

	public static int linearSearch(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	} 

	public static int[] moveZeroToEnd2(int[] arr){
		//method : using linear subsequence i.e. zerothIndex always points to zeroth elem and other index traverses
		int zerothIndex=-1;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==0){
				zerothIndex=i;
				break;
			}
		}
		for(int j=zerothIndex+1; j<arr.length; j++){
			if(arr[j]!=0){                 // j and zeroth elem will always be adjacent unless there are multiple adjacent zeros
				swap(arr,zerothIndex++,j);
			}
		}
		return arr;
	}

	public static int[] moveZeroToEnd1(int[] arr){
		//method : traverse the array and put all non-zeros into temp[]
		           //traverse into temp[] beyond the the non-zero element and put 0 there
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]!=0){
				temp[j++]=arr[i];
			}
		}	
		for(int k=j; k<arr.length; k++){
			temp[k]=0;
		}	
		arr=temp;
		return arr;
	}


	public static int[] zerosToEnd(int[] arr){
		//method : iterate the array, when non-zero elem is encountered, update the nonzero index by elem
		// and increment nonzero index value, keeps the track of zero count, as long as zero count is +ve
		//update the array index from backwards to 0.

		int nonZero=-1;
		int count=0;

		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0){
				arr[++nonZero]=arr[i];
			}else{
				++count;
			}
			
		}
		
		int i=0;
		while(count!=0){
			arr[arr.length-1-i]=0;
			++i;
			--count;
		}

		return arr;
		
	}

	private static void swap(int[] arr, int m, int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}

	private static void reverse(int[] arr, int start, int end){
		while(start<=end){
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	public static int[] leftRotateByN1(int[] arr, int n1){
		int n=n1%arr.length;
		int length=arr.length-1;
		reverse(arr,0,n-1);
		reverse(arr, n, length);
		reverse(arr, 0, length);
		return arr;
	}

	public static int[] leftRotateByN(int[] arr, int m){
		//method : save first (index: 0->n-1) elems into temp[] as these values would be overwritten in arr
		//			switch arr[i] to arr[i-N]
		// transfer the temp elem from arr[n->length]

		int n=m%arr.length;
		int[] temp = new int[n];
		for(int i=0; i<n; i++){
			temp[i]=arr[i];
		}

		for(int i=n; i<arr.length; i++){
			arr[i-n]=arr[i];
		}

		int j=0;
		for(int i=arr.length-n; i<arr.length; i++){
			arr[i]=temp[j++];

		}


		return arr;
	}

	public static int[] moveOneByLeft(int[] arr){
		int temp = arr[0];
		for(int i=1; i<arr.length; i++){
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

	
}