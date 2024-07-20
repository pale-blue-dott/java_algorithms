import java.util.Arrays;
import java.util.Scanner;


class Chapter1{
	public static void main(String[] args){
		// boolean[] [] arr = {{true, false, true}, {true, true, false}, {false, false, true}};
    //	String[] [] strArr = booleanArray(arr);
    //	printArray(strArr);
    int [] nums = {2,7,11,15};
    System.out.println(nums);
	}

	public static String[] [] booleanArray(boolean[] [] arr){
    String[] [] arr1 = new String[arr.length][arr[0].length];
    
    for(int i =0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        if(arr[i][j]==true){
          arr1[i][j]="*";
        }else{
          arr1[i][j]=" ";
        }
      }
    }
    return arr1;
  }

  public static void printArray(String [] [] arr){
    for(int i=0; i<arr.length; i++){
      System.out.println(Arrays.toString(arr[i]));
    }
  }

   public int[] twoSum(int[] nums, int target) {
        int firstIndex, secondIndex;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    firstIndex = i;
                    secondIndex =j;
                    int[] arr={firstIndex, secondIndex};
            return arr;
                }
            }
            
        }
        return arr;
    }


}