import java.util.Arrays;


class ShellSort{
	public static void main(String[] args){
		int[] a={23, 20, 18, 19, 14, 26};
		sort(a);
		System.out.println(Arrays.toString(a));

	}

	public static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void sort(int[] arr){
		int n=arr.length;
		for(int gap=n/2; gap>0; gap=gap/2){
			for(int j=gap; j<n; j++){
				for(int i=j-gap; i>=0; i=i-gap){
					if(arr[i+gap]>arr[i]){
						break;
					}else{
						swap(arr, i+gap, i );
					}
				}
			}
		}
	}
}