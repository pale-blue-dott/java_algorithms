import java.util.Arrays;


class Arrays1{
	public static void main(String[] args){
		//int[] array1={111111,23,45091,78000,896400,896400,55300000,55300000,43,1,23,0, -10, -5}; 
		//System.out.println(largestElem(array1));
		//System.out.println(thirdLargest(array1));
		//Arrays.sort(array1);
		//System.out.println(nthLargest2(array1, 4));
		//System.out.println(Arrays.toString(secLargestNSmallest(array1)));
		//int [] array2 ={2,3,46,46,78,90, 654, 999};
		//System.out.println(isSorted(array2));
		int[] array3 ={0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,5,5,6,7};
		System.out.println(Arrays.toString(removeDuplicates(array3)));
	

		
	}

	public static int[] removeDuplicates(int[] arr){
		int i=0;
		int j=1;
		while(j<arr.length){
			if(arr[j]!=arr[i]){
				arr[++i]=arr[j];
			}
			j++;
		}
		return Arrays.copyOfRange(arr, 0, i);
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
		int i=1;
		int largest=arr[0];
		int secLargest=Integer.MIN_VALUE;

		int smallest=arr[0];
		int secSmallest=Integer.MAX_VALUE;

		while(i<arr.length){
			if(arr[i]>largest){
				secLargest=largest;
				largest=arr[i];
			}else if(secLargest<arr[i]){
				secLargest=arr[i];
			}
			//System.out.println("largest: "+largest+" sec-largest: "+secLargest);
			if(arr[i]<smallest){
				secSmallest=smallest;
				smallest=arr[i];
			}else if(secSmallest>arr[i]){
				secSmallest=arr[i];
			}
			//System.out.println("smallest: "+smallest+" sec-smallest: "+secSmallest);
			
			i++;
		}
		return new int[]{secSmallest,secLargest};
		
	}


	public static int nthLargest2(int[] arr, int n){
		//method : using Arrays.sort(), 
		// as soon as a different element is encountered -> count++
		// index i at which count == n, return arr[i]
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int i=arr.length-1;
		int count=0;
		while(count<n){
			if(arr[i]!=arr[i-1]){
				count++;
			}
			i--;
		}
		return arr[i];
	}

	
	public static int secLargest2(int[] arr){
		//method : using Arrays.sort method 
		Arrays.sort(arr);
		int i=arr.length-1;
		while(arr[i-1]==arr[i]){
			i=i-1;
		}
		return arr[i-1];
	}


	public static int thirdLargest(int [] arr){
		// implementing array.sort method
		int largest=arr[0];
		int secLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length; i++){
			if(arr[i]>largest){
				thirdLargest=secLargest;
				secLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secLargest){
				thirdLargest=secLargest;
				secLargest=arr[i];
			}else if(arr[i]>thirdLargest){
				thirdLargest=arr[i];
			}
		}
		return thirdLargest;
	}

	public static int secLargest(int[] arr){
		//method : maintain two indexes, largest and secLargest and traverse the array
		//update accordingly, if element is greater than largest both variables should be updated
		//if element is greater than secLargest, only secLargest is updated
		int largest=arr[0];
		int secLargest=Integer.MIN_VALUE;
		int i=1;
		while(i<arr.length){
			if(arr[i]>largest){
				secLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secLargest){
				secLargest=arr[i];
			}
			i++;
		}
		return secLargest;
	} 

	public static int largestElem(int[] arr){
		//method1: sort the arr; and obtain the last elem.
		//method2: 
		int largest=arr[0];
		int i=1;
		while(i<arr.length){
			if(arr[i]>largest){
				largest=arr[i];
			}
			i++;
		}
		return largest;
	} 


}