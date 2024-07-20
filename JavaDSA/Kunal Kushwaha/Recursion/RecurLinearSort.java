import java.util.Arrays;

class RecurLinearSort{
	public static void main(String[] args){
		//lowerTriangle(0,4);

		int[] bubbleSortArr={5,4,3,2,1,65,654,0,56,987,464572,2726,0,474,890};
		//System.out.println(Arrays.toString(bubbleSortRecur(bubbleSortArr,0,bubbleSortArr.length-1)));
		System.out.println(Arrays.toString(selectionSort(bubbleSortArr,0,bubbleSortArr.length-1, bubbleSortArr.length-1)));
		
	}
	private static void swap(int[] arr, int m, int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}

	public static int[] selectionSort(int[] arr, int start, int end, int max){
		if(start<end){
			if(arr[start]>arr[max]){
				max=start;
				return selectionSort(arr, start+1, end, max);
			}else{
				return selectionSort(arr, start+1, end, max);
			}
		}else if(start==end){
			swap(arr,end,max);
			return(selectionSort(arr,0,end-1,end-1));
		}else if(start==end){
			return arr;
		}
		return arr;
	}

/*		if(start<end){
			if(arr[start]<arr[min]){
				min=start;
				return selectionSort(arr, pointer, start+1, end, min);
			}else{
				return selectionSort(arr, pointer, start+1, end, min);
			}
		}else if(start>end){
			swap(arr,pointer, min);
			return selectionSort(arr, pointer+1, pointer+1, end, min);

		}else if(pointer==end){
			return arr;
		}
		return arr;
	} */

	public static int[] bubbleSortRecur(int[] arr, int start, int end){
		if(start<end){
			if(arr[start]>arr[start+1]){                    // return keyword acts as a link between problem and subproblem so that
				int temp=arr[start];                        // it can traverse towards subproblem while solving and toward main problem
				arr[start]=arr[start+1];                    // while accumulating solutions of the subproblem
				arr[start+1]=temp;
				return bubbleSortRecur(arr,start+1, end);
			}else{
				return bubbleSortRecur(arr, start+1, end);
			}
		}
		else if(start==end){
			return bubbleSortRecur(arr,0,end-1);
		}else if(end==0){
			return arr;
		}
	
		return arr;
	}

	public static void lowerTriangle(int col, int row){
		if(col<row){
			System.out.print("*");
			lowerTriangle(col+1, row);
		}else if(col==row){
			System.out.print("*");
			System.out.println();
			lowerTriangle(0,row-1);
		}else if(row==0){
			return;
		}
		
	}




	

}