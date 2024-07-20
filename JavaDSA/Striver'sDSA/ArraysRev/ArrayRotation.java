import java.util.Arrays;

class ArrayRotation{
	public static void main(String[] args){
		//System.out.println(Arrays.toString(singleElemRotationByK(new int[] {1,2,5,4,7,7,54,43,3}, 1)));
		//System.out.println(Arrays.toString(moveLeftByK(new int[] {1,2,5,4,7,7,54,43,3}, 4)));
		//System.out.println(Arrays.toString(moveLeftByK2(new int[] {1,2,5,4,7,7,54,43,3}, 1)));
		//System.out.println(Arrays.toString(moveZeroesToEnd(new int[]{0,0,0,0,0,0,0,0,8,0,0,0,0,9,1,2,3,4}))); 
		//System.out.println(Arrays.toString(moveZeroesToEnd2(new int[]{0,0,0,0,0,0,0,4,7,0,8,0,0,0,0})));
		//System.out.println(Arrays.toString(segregate0s1s2s(new int[]{0,0,1,1,2,2,1,1,2,1,0,0})));    // fix this code
		//System.out.println(linearSearch(new int[]{1,2,3,4,5,6,7},8 ));
		String s="12";
		try{
			int i=Integer.parseInt(s);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static int linearSearch(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}

	public static int[] segregate0s1s2s(int[] arr){
		int zeros=0; int twos=arr.length-1; int i=0;
		while(i<twos){
			if(arr[i]==0 && arr[zeros]!=0){
				swap(arr, i, zeros);
			}else if(arr[i]==0 && arr[zeros]==0){
				while(arr[zeros]==0 && zeros<twos){
					++zeros;
				}
				swap(arr, i, zeros);
			}
			if(arr[i]==2 && arr[twos]!=2){
				swap(arr, i, twos);
			}else if(arr[i]==2 && arr[twos]==2){
				while(arr[twos]==2 && twos>zeros){
					--twos;
				}
				swap(arr, i, twos);
			}
			i++;
		}
		return arr;

	}

	public static int[] moveZeroesToEnd2(int[] arr){ // exchange the non-zero indexes after first zeroth index
		int j=0;
		while(arr[j]!=0){                 // catch the left most 0, traverse the array after leftmost zero,
			j++;                          // as soon as !=0 is retrieved, exchange it with leftmost zero, and increment 
		}                                 // both indexes
		int i=j+1;
		while(i<arr.length){
			if(arr[i]!=0){
				swap(arr, j++,i);
			}
			i++;
		}
		return arr;
	}
	private static void swap(int[] arr, int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	public static int[] moveZeroesToEnd(int[] arr){  
		// new int[]{0,0,0,0,0,0,0,0,8,0,0,0,0}
		int zeros=arr.length-1;
		int i=0;
		while(i<zeros){
			if(arr[i]==0 && arr[zeros]!=0){
				swap(arr, i, zeros--);
			}else if(arr[i]==0 && arr[zeros]==0){
				while(arr[zeros]==0  && zeros>i){          // zeros>i : in case there only 0 between i and zero,
					--zeros;                               // it will furthur move leftside of i to look for nonzero ele,
				}
				//System.out.println("exchanging " +i+ " with "+zeros);
				swap(arr, i, zeros--);
				//System.out.println(Arrays.toString(arr));
			}
			i++;
		}
		return arr;

	}

	private static void reverseArr(int[] arr, int start, int end){
		while(start<=end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;

		}
	}

	public static int[] moveLeftByK2(int[] arr, int d){
		int k=d%arr.length;
		reverseArr(arr, 0, k-1);
		reverseArr(arr, k, arr.length-1);
		reverseArr(arr,0, arr.length-1);
		return arr;
	}

	public static int[] moveLeftByK(int[] arr, int k){
		int[] temp=new int[k];
		for(int i=0; i<k; i++){
			temp[i]=arr[i];
		}
		for(int i=0; i<arr.length-k; i++){
			arr[i]=arr[i+k];
		}
		for(int i=0; i<temp.length; i++){
			arr[arr.length-k+i]=temp[i];
		}
		return arr;
	}
/*
	public static int[] singleElemRotationByK(int[] arr, int step){
		int temp;

		for(int j=0; j<arr.length; j++){
			int key=j;
			for(int i=0; i<step; i++){
				--j;
				if(j==-1){
					j=arr.length-1;
				}
				temp=j;
			
			}
			
		}
		return arr;
			
	}
	*/
}