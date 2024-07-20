class LeetcodeProbelms{
	public static void main(String[] args){
		//System.out.println(strStr("ankitabhi", "abhi"));
		String name1= "ankit";
		String name2="ankit";
		//System.out.println(name1.substring(1, 1+ name2.length()));
		//System.out.println(strStr("sadbutsad", "sad"));
		//System.out.println(strStr("ankit", "t"));
		//System.out.println(name1==name2);
		int[] arr= {1,3,5,6};
		int[] arr2 = {1,3,5,6};
		System.out.println(searchInsert(arr2,7));

	}
/*
	public static int strStr(String haystack, String needle) {
        int leng = needle.length();
   
        for(int i=0; i<haystack.length()-leng; i++){
            if (haystack.substring(i, i+leng-1)==needle){
                return i;
            }
        }

        return -1;
        
    }

    */

     public static int strStr(String haystack, String needle) {
        String str2=needle;
        for(int i=0; i<haystack.length()-needle.length()+1; i++){
        	//System.out.println(haystack.substring(i, i+needle.length())+":"+needle);
        	String str1=haystack.substring(i, i+needle.length());

            if (str1.equals(str2)){
                return i;
            }
        }

        return -1;
        
    }

    public static int searchInsert(int[] nums, int target) {
        int i=0;
        while(i<nums.length && nums[i]<target){
            i++;
        }
        System.out.println("i: "+i);
        
        
        if(nums[i]==target){
            return i;
        }else if(nums[i]>target){
            return i+1;
        }else if(i==nums.length){
            return i;
        }
    }
}