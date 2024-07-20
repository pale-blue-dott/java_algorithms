class Arrays3{

	public static void main(String[] args){
		boolean array = {true, true, false};
		System.out.println(array[2]);

	}

	public static int missingNumber(int[] arr){
		int n=arr.length;
		for(int i=1; i<n; i++){
			int value=-1;
			for(int j=1; j<n; j++){
				if(j==i){
					value=j;
					break;
				}else if(j!=i && j==arr.length){
						return j;
				}
			}
			return -1;
		}
	}
}