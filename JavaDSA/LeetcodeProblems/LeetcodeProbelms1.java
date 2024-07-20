public class LeetcodeProblems1{


	public static void main(String[] args){
		int[] arr={1,3,5,6};
		System.out.println(searchInsert(arr,4));


	}

	 public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        return searchInsert(nums, target, 0, n-1);    
    
    
    }

	public static int searchInsert(int[] nums, int target, int start, int end){
        int mid= start+end/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            return searchInsert(nums, target, mid+1, end);
        }else{
            return searchInsert(nums, target, start, mid-1);
        }

       // return -1;

        //System.out.println("start: "+start+"mid: "+mid+"end: "+end);


/*
        if(nums[start]>target){
            return start;
        }else{
            return start+1;
        } */
    }



}