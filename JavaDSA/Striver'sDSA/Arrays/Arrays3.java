import java.util.Arrays;

class Arrays3{

	public static void main(String[] args){
		//int[] array={1,4,3,2};
		int[] maxCount = {1,1,1,0,0,2,2,2,2,2,2,2,2,2,2,0,1,2,0,1,1,1};
		int[] onlyOnce={0,0,1,1,1,2,2,3,4,4,5,5};
		//System.out.println(elemThatAppearsOnce1(onlyOnce));
		System.out.println(maxConsecutiveElem(onlyOnce));
		//System.out.println(missingNumber1(array));
		//System.out.println(9^9);

	}
	public static int elemThatAppearsOnce1(int[] arr){
		//method : contruct a hash[1+arr.length], iterate through the arr[]
		//current index in arr, arr[i] increment the corresponding ++hash[i];   
		int[] hash = new int[(arr.length+1)/2];
		int n=arr.length+1;

		for(int i=0; i<arr.length; i++){
			hash[arr[i]%n]=++hash[(arr[i]%n)];
			System.out.println(Arrays.toString(hash));
		}
		for(int j=0; j<hash.length; j++){
			if(hash[j]==1){
				return j;
			}
		}
		return -1;
	}


	public static int elemThatAppearsOnce(int[] arr){
		//external loop provides the value, internal loop compares and increment
		//even after the internal loop terminaton if count == 1, then that elem appears only once.
		for(int i=0; i<arr.length; i++){
			int count=0;
			for(int j=0; j<arr.length; j++){
				if(arr[i]==arr[j]){
					++count;
				}
				//System.out.println(count);
			}
			if(count<2){
				return arr[i];
			}
		}
		return -1;
	}

	public static int maxConsecutiveElem(int[] arr){
		// within the iteration loop, the value of count alters, 
		// based on the count value, max value also alters.

		//int[] onlyOnce={0,0,1,1,1,2,2,3,4,4,5,5};
		
		int max=1;
		int count=1;
		for(int i=1; i<arr.length; i++){
			if(arr[i]==arr[i-1]){
				count+=1;
			}else{
				count=1;
			}
			if(count>max){
				max=count;
			}
		}
		return max;
	}


	public static int missingNumber2(int[] arr){
		//method : we cant escape 0th index of hash[] and one element additionally is misisng in arr[],
		// hence we create a hash of arr.length+2
		//traverse the arr, we set hash[arr[i]%n]=true 

		boolean[] hash=new boolean[arr.length+2];
		int n=hash.length;
		for(int i =0; i<arr.length; i++){
			hash[arr[i]%n]=true;
		}

		System.out.println(Arrays.toString(hash));
		for(int j=1; j<hash.length; j++){
			if(hash[j]==false){
				return j;
			}
		}
		return -1;
	}

	public static int missingNumber1(int[] arr){
		int n=arr.length+1;
		int mathSum=n*(n+1)/2;
		int arrSum=0;
		for(int i=0; i<arr.length; i++){
			arrSum+=arr[i];
		}
		return mathSum-arrSum;
	}

	public static int missingNumber(int[] arr){
		//method : one elem is missing from arr hence it is supposedly to be itearted arr.length+1 time
		// i iteration provides the number counters from 1 to arr.length+1
		// j iteration checks in arr if it exists or not.
		for(int i=1; i<=arr.length+1; i++){
			boolean flag=false;
			for(int j=0; j<arr.length; j++){
				if(arr[j]==i){
					flag=true;
					break;
				}
			}
			if(flag==false){
				return i;
			}
		}
		return -1;
	}
}