class LongestSubarray{
	public static void main(String[] args){
		System.out.println(longestSubarrayWithSumK(new int[]{2,3,0}, 5));

	}
	public static int longestSubarrayWithSumK(int[] arr, int sum){
		int count=1;
		int max=0;
		int currSum=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(currSum<sum){
					currSum+=arr[i];
					count+=1;
				}
				if(currSum==sum){
					max=Math.max(count, j-i-1);
				}else if(currSum>sum){
					count=0;
					break;
				}
			}
		}
		return max;
	}
}