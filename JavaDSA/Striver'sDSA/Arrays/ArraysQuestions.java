import java.util.Arrays;


class ArraysQuestions{
	public static void main(String[] args){
		//getSecLargest(new int[]{5,78,96,4,54,30,89,90,100});
		int[] array={5,78,96,4,54,30,89,90,100};
		//leftRotateBy1(array);
		//leftRotateBySwap(array);
		//System.out.println(Arrays.toString(array));
		int[] array1={0, 0, 0, 5,78,96,4,54,0,0,0,30,89,90,100};
		//moveZeroToEnd(array1);
		//moveZeroToEnd1(array1);
		//System.out.println(Arrays.toString(array1));
		int[] arr0sn1s = {0, 0, 1,1, 0,0};
		//System.out.println(maxConsecutiveOnes(arr0sn1s));
		int[] oneElemOneTime = {1,2,3,4,5,1,2,3,4, 6};
		int[] oneElemOneTime1= {1,1,2,2,3,4,4,5,5};
		System.out.println(freqLesserThan2(oneElemOneTime1));
		//System.out.println(linearSearch(oneElemOneTime, 3));
		//System.out.println(printTillIndex(oneElemOneTime, 8));

	}
	// thinking process  : what we need to achieve, set up all the resources that can help us 
                         // achieve the end goal.
	public static void getSecLargest(int[] arr){
		int largest=arr[0];
		int secLargest=-1938598;
		for(int i=1; i<arr.length; i++){
			if(arr[i]>largest ){
				secLargest=largest;
				largest=arr[i];
				
			}else if(arr[i]>secLargest && arr[i]!=largest){
				secLargest=arr[i];
			}
		}
		System.out.println(secLargest);
	}

	public static void leftRotateBy1(int [] arr){
		int temp = arr[0];
		for(int i=1; i<arr.length; i++){
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}

	public static void leftRotateBySwap(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			exchange(arr, i, i+1);
		}
	}

	private static void exchange(int[] arr, int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	public static void moveZeroToEnd(int[] arr){
	  // thought process: there must be some variable at the end that set value at the last 
	  //                  that can echange the zeroth element with
		int j=arr.length-1;
		for(int i=arr.length-1; i>=0; i--){    // move from last index towards first index, 
			if (arr[i]==0){
				exchange(arr, i, j);
				j--;
			}
		}
	}

	public static void moveZeroToEnd1(int[] arr){
		int j=-1;
		while(j!=0){
			j++;
		}
		for(int i=j+1; i<arr.length; i++){
			 // j points to zeroth index, i points to non-zeroth index
			 // if arr[i] is non-zero, exchange arr[i(non-zero index)] with arr[j(zero index)] increment j++; 
			if(arr[i]!=0){
				exchange(arr,i,j);
				j++;
			}
		}
		
	}
	

	public static int maxConsecutiveElem(int[] arr){
		//int[] arr0sn1s = {0, 0, 1,1, 0,0};
		int maxConsecutives=1;
		int consecutives=1;
		for(int i=1; i<arr.length; i++){
			if(arr[i]==arr[i-1]){
				consecutives++;                     //as soon as consecutive value is updated
				if(consecutives>maxConsecutives){   // a check is made to if current consecitive value is greater than 
					maxConsecutives=consecutives;   // maxConsecutive or not, maxConsecutive is updated accordingly.
					
				}
			else{
				consecutives=1;
			}
			
		}
		return maxConsecutives;
	}

	public static int freqLesserThan2(int[] arr){  //int[] oneElemOneTime = {1,2,3,4,5,1,2,3,5};
		//even if your condition is always true, the compiler has to assume that there is a
		//possibility of it being false. Therefore you always need to put a return at 
		//the end of your non-void method outside of any conditions just in case all of your conditions fail
		for(int i=0; i<arr.length; i++){
			int count = 0;
			for(int j=0; j<arr.length; j++){
				if(arr[j]==arr[i]){
					count++;
				}
			}	
			if(count<2){
				return arr[i];
			}
		} 
		return -1;
	}

	public static int linearSearch(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		} 
		return -1;
	}

	public static int printTillIndex(int[] arr,int n){
		for(int i=0; i<n;i++){
			if(i==n){
				return i*i*i;
			}
			System.out.println(arr[i]);
		}
		return -1;
	}

}