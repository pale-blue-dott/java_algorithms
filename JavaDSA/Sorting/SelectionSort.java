import java.util.Arrays;



class SelectionSort{
	public static void main(String[] args){
		int[] a = {4,65,3,54,13,25,87, 12};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] arr){
		int n= arr.length;
		for(int i=0; i<n-1; i++){
			int min=i;
			for(int j=i+1; j<n; j++){
				if(arr[j]<arr[min]){
					min=j;
				}
				
			}
			ShellSort.swap(arr, i, min);
		}
	}

	public static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}


}