import java.util.ArrayList;
import java.util.Arrays;

public class LeetcodeProblems1{


	public static void main(String[] args){
		//int[] arr={1,3,5,6};
		//System.out.println(searchInsert(arr,7));
		String name="Ankit";
        System.out.println(name.charAt(2));
		if(name.charAt(4)!=' '){
			System.out.println(name);
		}
		if(name!=null){
			System.out.println("Ankit");
		}

		System.out.println(Math.max(3,6));

		int a=5;
		int b=2*a;
		System.out.println("a: "+a+"b: "+b);
        String[] name1 = {"ankit", "Kumar", "Abhi"};
        //ArrayList<String> name2=Arrays.asList(name1);
        System.out.println(2.6 * 2.6);





	}

	 public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        return searchInsert(nums, target, 0, n-1);    
    
    
    }

	public static int searchInsert(int[] nums, int target, int start, int end){
        int mid = start+end/2;
        if(nums[mid]==target){
            return mid;
        }else if(start==nums.length){
        	return start+1;
        }else if(start==end){
        	return getInd(nums,start, target);
        }else if(target<nums[mid]){
            return searchInsert(nums, target, start, mid-1);
        }else{
            return searchInsert(nums, target, mid+1, end);
        }
    }

       // return -1;

        //System.out.println("start: "+start+"mid: "+mid+"end: "+end);


   public static int getInd(int[] arr,int m, int target){
        if(target<arr[m]){
            return m;
        }else{
            return m+1;
        } 
    }



}