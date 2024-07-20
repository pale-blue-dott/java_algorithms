import java.util.Arrays;

class Arrays4{

	public static void main(String[] args){
		//int[] sumK={2,2,3,1,1,1,1,1,1,1,1,7,8};
		//int[] ans1=longestSubArrWithSumK2(sumK, 17);
		//System.out.println(Arrays.toString(ans1));
		

	}

	public static int[] longestSubArrWithSumK2(int[] arr, int k){
		int sum=0;
		int j=0;
		int i=0;
		int streak=0;
		int[] ans=new int[3];
		while(j<arr.length){
			sum=sum+arr[j];
			System.out.print(sum+"-->");
		    if(sum==k){
				streak=Math.max(streak,j-i+1);
				ans[0]=i;
				ans[1]=j;
				ans[2]=streak;
			}else if(sum>k){
				while(sum>k){
					sum=sum-arr[i];
					System.out.print(sum+"-->");
					i++;
				}
				//--i;
			}
			j++;
		}
		--j;
		
		return ans;

		
	}
/*
	public static int longestSubArrWithSumK1(int[] arr, int k){
		int len=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum=0;
				for(int k=i; k<=j; k++){
					sum+=arr[k];
				}
				if(sum==k){
					len=Math.max(len,k-j+1);
				}
			}
		}
		return len;
	}

*/

	public static String longestSubArrWithSumK(int[] arr, int k){
		//method : point out the starting element in outer iteration 
		// traverse from starting element as long as sum<k and j<arr.length
		// update the count if (i-j)>count[1]-count[0] 
		int[] count=new int[2];
		for(int i=0; i<arr.length; i++){
			int sum=0;
			int j=i;

			while(sum<k && j<arr.length){
				sum+=arr[j];
				j++;
			}
			--j;

			if(sum==k){
				//System.out.println(i);
				//System.out.println(j);
				if((j-i)>count[1]-count[0]){
					count[0]=i;
					count[1]=j;
				}
			}
		} 
		return "i: "+count[0]+" j: "+count[1];
	}
}