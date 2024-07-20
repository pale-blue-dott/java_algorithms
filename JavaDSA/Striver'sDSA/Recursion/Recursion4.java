import java.util.Arrays;

class Recursion4{
	// rules of studying and visualizing the recursion:
	// 1. first and foremost consider the recursive part of the problem only until it hits the base problem.
	     // always watch how it alters/updates object state and how it reaches base conditon etc.
	// 2. always consider the base consition as different problem and device a solution for base condition
	// 3. after base conditon is updated, function calls are activated in order, main problem -> base condition; base condition->main problem.
	// 4. f(2) > f(1) > f(0) < == > f(0) > f(1) > f(2)
    // 5. after base consition is handled, every subproblem executes after recursive step except for return step 
    //     which is accessible only on the main problem.
	// 6. problem(){ return sub-probelm()  }   problem() -> solution/value of subproblem()
	public static int[] reverseArr(int[] arr, int i, int n){
		if(i==n){
			return arr;       // base problem is the only subproblem that return something; in such case
		}                     // what base constion returned will be returned by the problem as a whole.
		swap(arr, i, n);               
		return reverseArr(arr, i+1, n-1);
		// return arr  :is also correct // returing object coz recursive problem was acting onto an object, 
	}                                   // otherwise we would return what base condition returned

	public static int[] reverseArr1(int[] arr, int i, int n){
		if(i==n){                  // 2. then hits base problem.
			swap(arr,i,n);
		}
		
		reverseArr(arr, i+1, n-1); // 1. execution takes place here, until 2nd smallest subproblem hits.
		swap(arr, i, n);   // 3. after base problem is handled every subproblem execution repeats in reverse order i.e. reverArr(arr,i-1,n+1)
		return arr;        //4. reverseArr1(arr, 0, 5) -> arr;
		
	}

	public static boolean palindrome1(String str, int i){
		int n= str.length();
		if(i>=n/2){
			return true;
		}

		else if(str.charAt(i)!=str.charAt(n-1-i)){   // return statement is encountered before reaching the base problem;
			return false;                       // progression no more mmoves towards base problem, in fact it fetches the 
		}                                       // return false, towards the main problem
		return palindrome1(str, i+1);

	}

	private static void swap(int[] arr, int m, int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}

	public static int findMax(int[] arr, int n, int max){
		if(n==arr.length){
			return max;  //findMax(arr, 7, 6) -> 6, this value only will be fetched to the main problem if it is simply returned
		}
		
		//max=Math.max(max, arr[n]);
		if(max>arr[n]){
			max=max;
		}else{
			max=arr[n];
		}
		
		return findMax(arr, n+1, max);
		//System.out.println(max);
	}
/*
	public static boolean palindrome(String str, int i, int n, boolean flag){
		if(i==n){
			return flag;
		}
		if(str.charAt(i)!=str.charAt(n)){
			flag=false;
		}
		System.out.println(flag);
		return palindrome(str, i+1, n-1);
	}
*/

	public static  boolean printTill(int m, int n){
		if(m==n){
			return true;
		}
		else if(m==16){           // return statement is encountered before reaching the base problem, 
			return false;         // furthur progression towards base case is cancelled, and result is fetched towards main problem
		}
		System.out.println(m);
		return printTill(m+1, n);
	}
	public static void main(String[] args){
		//System.out.println(Arrays.toString(reverseArr(new int[]{1,2,3,4,5}, 0, 4)));
		//System.out.println(findMax(new int[]{3,5,6,4,3,2,1},0,0));
		//System.out.println(Math.max(456, 221));
		System.out.println(palindrome1("MADAM", 0));
	}
}