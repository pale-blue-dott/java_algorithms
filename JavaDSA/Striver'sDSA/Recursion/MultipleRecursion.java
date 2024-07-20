import java.uti.ArrayList;

class MultipleRecursion{
	public static void main(String[] args){
		System.out.println(fibonacci(5));
	}

	public static int fibonacci(int n){
		if(n<=1){
			return n;
		}
		int last=fibonacci(n-1); // until last is not determined it wont move for secLast
		int secLast=fibonacci(n-2);
		return last+secLast;
	}

	public static ArrayList<ArrayList> subsequence(int[] arr, int i, int j, ArrayList<ArrayList>arl){
		if(i==arl.length() && j==arl.length()){
			return arl;
		}
		if(j==arl.length()){
			arl.add(arr.sub)
			subsequence(arr,i+1,i+1,arl);
		}
	}
}