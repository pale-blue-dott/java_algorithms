class RecursionLevel1{
	public static void main(String[] args){
		//printNTo1(0,10);
		//System.out.println(factorial(5));
		//System.out.println(sumOfN(10));
		//System.out.println(sumOfDigits(55));
		//System.out.println(product(123456));
		//System.out.println(reverse(123456));
		//System.out.println(palindrome(120031,0,2,true));
		System.out.println(countZeroes(30210004));

	}
	public static int countZeroes(int n){
		if(n<10 && n==0){                    // base case should never call any subproblem
			return 1;                        // it must hands down return some straight forward finite value. 
		}else if(n<10 && n!=0){                
			return 0;
		}

		if(n%10==0){
			return 1+countZeroes(n/10);     // if solution is meant to occur as soon as the base case is encountered
		}else{                              // partial solution must be attached from the current problem to the subproblem.
			return countZeroes(n/10);
		}
	}


	public static boolean palindrome(int n, int start, int end, boolean flag){
		String m=n+"";
		if(flag==false){
			return false;
		}
		if(start>end){
			return true;
		}
		flag=m.charAt(start)==m.charAt(end);
		return palindrome(Integer.parseInt(m), start+1, end-1, flag);
}

	public static int product(int n){
		if(n<10){
			return n;
		}

		return n%10*product(n/10);
	}

	public static void printNTo1(int start, int end){  // only the arguments specified can be sent to subprobelms 
		if(start>end){                                 // from the entire function body for solution.
			return;      
		}
		System.out.println(start);
		printNTo1(start+1, end);    // solve this smaller problem first, then current problem will be etaken on furthur,
		System.out.println(start);
	}

	public static int factorial(int n){
		if(n==1){
			return 1;
		}
		int smallerProblem=factorial(n-1); // storing the solution of subproblem in the current problem.
		return n*smallerProblem;
	}

	public static int sumOfN(int n){
		if(n==0){
			return 0;
		}
		return n+sumOfN(n-1);
	}

	public static int sumOfDigits(int n){   // if processing and operations done in currentProbelm is correct and what is sent to subproblem is correct as well,
		if(n<10){                           // it leads towards to correct solution only.
			return n;                       // partialSolution+currentProblem->subProblem : i did my work and whatever problem i transferred
		}                                   // to you is correct, make sure you do it correct. 
		return n%10+sumOfDigits(n/10);      // tip : instead of converting an int -> String, rather use n%10 and n/10; 
	}                         //currentProblem : what i added is correct,now  subproblem you provide me the rest of addition.
}