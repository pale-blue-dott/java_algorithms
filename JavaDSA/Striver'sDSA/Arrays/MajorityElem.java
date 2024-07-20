class MajorityElem{
	public static void main(String[] args){
		int[] array={1,2,3,4,3,2,1,1,1,1,1,1,3};
		System.out.println(majorityElem(array));

	}

	public static int majorityElem(int[] arr){
		//System.out.println(arr.length);
		for(int i=0; i<arr.length; i++){
			int count=1;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]==arr[i]){
					++count;
				}
			}
			System.out.println("elem: "+arr[i]+"count: "+count);
			if(count>arr.length/2){
				return arr[i];
			}
		}

		return -1;
	}
}