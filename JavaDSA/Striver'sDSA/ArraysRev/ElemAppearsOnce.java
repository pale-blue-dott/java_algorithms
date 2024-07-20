class ElemAppearsOnce{
	public static void main(String[] args){
		//System.out.println(missingNumber(new int[] {1,2,3,4,5}));
		//System.out.println(missingNumber(new int[] {1,2,4,5}));
		System.out.println(maximumConsecutives(new int[] {1,1,2,2,2,2,3,4,5,6,6,65,4,4,4,4,4}));
	}
	public static int maximumConsecutives(int[] arr){
		int consecutive=1; int longest=0;
		for(int i=1; i<arr.length; i++){
			if(arr[i]==arr[i-1]){
				++consecutive;
			}else{
				consecutive=1;
			}
			if(consecutive>longest){
					longest=consecutive;
			}
		}
		return longest;
	}

	public static int missingNumber2(int[] arr){
		int m=arr.length+1;               // one number is missing from array, hence its length is supposed to be "m"
		int sum=m*(m+1)/2;
		int sum1=0;
		for(int i=0; i<arr.length; i++){
			sum1+=arr[i];
		}
		return sum-sum1;
	}

	public static int missingNumber(int[] arr){
		for(int i=1; i<=arr.length+1; i++){  // for providing the counting value
			boolean flag=false;
			for(int j=0; j<arr.length; j++)  // matching the counting to the array elements
				if(i==arr[j]){
					flag=true;
					break;
			}
			if(flag==false){
				return i;
			}
		}
		return -1;
	}
}