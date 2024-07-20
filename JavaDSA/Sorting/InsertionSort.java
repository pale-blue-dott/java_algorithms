import java.util.Arrays;

class InsertionSort{
	public static void main(String[] args){

		int[] array = {1265, 1860, 10 ,10, 50, 30, 20, 40, 80};
		int[] array1 = {31, 41, 59, 26, 41, 58};
		System.out.println(Arrays.toString(array1));
		sort3(array1);
		System.out.println(Arrays.toString(array1));

		

	}


	public static void sort(int[] arr){
		int n=arr.length;
		for(int i=1; i<n; i++){
			for(int j=i; j>0 && less(arr, j,i); j--){
				exchange(arr , arr[j], arr[i]);
			}
		}
	}

	public static void sort2(int[] arr){
		int n=arr.length;
		for(int j=1; j<n; j++){
			int current = arr[j];
			int i=j-1;
			while(i>=0 && arr[i]>current){
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=current;
		}
	}

	public static void exchange(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] =temp;
	}

	public static boolean less(int[] arr, int x, int y){
		if (arr[x]<arr[y]){
			return true;
		}else{
			return false;
		}
	}

	public static void sort3(int [] arr){
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
}