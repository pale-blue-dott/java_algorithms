class RecurExamples{
	public static void main(String[] args){
		System.out.println(retBase(4));
	}

	public static boolean retBase(int n){
		if(n==0){
			return true; 
		}

		return retBase(n-1);


	}
}