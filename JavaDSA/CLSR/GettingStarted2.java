import java.util.Arrays;

class GettingStarted2{


	public static void main(String[] args){

		int[] array = {1265, 1860, 10 ,10, 50, 30, 20, 40, 80};
		int[] array1 = {31, 41, 59, 26, 41, 58};
		//System.out.println(Arrays.toString(array1));
		//sort3(array1);
		//System.out.println(sumArray(array));
		//System.out.println(Arrays.toString(array1));
		//revInsertionsort(array1);
		//System.out.println(Arrays.toString(array1));
		//System.out.println(linearSearch(array, 40));
		//System.out.println(mergePrint(array,0,8));
		//changeIndex(array1, 4, 800);
		//System.out.println(Arrays.toString(array1));
		//printName("ankit");
		mergeSortInPlace(array,0,5);

	}

	public static void mergeSortInPlace(int[] arr, int start, int end){
		if(start+1==end){
			System.out.print("start: "+start+ " end: "+end);
			return;
		}
		int mid=start+end/2;
		mergeSortInPlace(arr, start, mid);
		mergeSortInPlace(arr, mid, end);
		return;
	}

	

	public static int[] changeIndex(int[] arr, int index, int value){
		arr[index]=value;
		return arr;
	}


	public static int linearSearch(int arr[], int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}

	public static void insertionSort(int [] arr){
		for(int i=1; i<arr.length; i++){
			int current = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current){
				arr[j+1]=arr[j];
				j--;
			}
			arr[++j]=current;
		}
	}

	public static int sumArray(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}

	public static void revInsertionsort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int current =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<current){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
	}


}