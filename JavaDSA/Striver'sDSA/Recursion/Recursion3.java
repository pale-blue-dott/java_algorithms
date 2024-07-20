class Recursion3{
 	// fundamental rules of recursion : 1. no matter the type of recursion, it always traverse to base case and back to the main case
    //2. if solution exist in a specific subproblem, i.structure the subproblem such that it returns the solution.
	//                                            ii.the way main problem reaches to the speific subproblem.
    //3. this is the same way subproblem travels back to the main problem
    //4. problems are always solved while recursion travels toward the base condition, traversal toward main problems fetch solution towards the main recursive method instance.
  	//5. As, the subproblem always traverses back to the main problem, solution is always fetched back to main problem calling it. 
  	//6. One nice trick is the solve recursion assuming that there is only one subproblem in the current recursive problem.

	public static int summation(int m){
		if(m==1){
			return 1;
		}
		int a=m + summation(m-1);  // return keyword : whatever summation(m-2) returns put the return value where function call is placed    
		return a;
	}

	public static int summation1(int m, int sum){
		if(m==0){       //// summation(0,sum) -> sum (5050) ;
			return sum;  // at m==0, sum1 receives the value for the very first time.
		}
		   
		int sum1=summation1(m-1,sum+m); // 99 -> 1, summation is unknown, at 0 sum1 is known, 100<-1, sum1 is fetched till 100 from 0.
		return sum1; // parametrized recursion : only parameter value updates

	}

	public static int factorial(int n){
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);  // factorial(n-1) -> x ; x is the solution of all the subproblems of current n;
	}

	public static int factorial1(int n, int prod){
		if(n==1){
			return prod;
		}
		return factorial1(n-1, prod*n);
	}


	public static void main(String[] args){
		//System.out.println(summation1(100,0));
		//System.out.println(factorial(5));
		System.out.println(factorial1(5,1));
	}
}

