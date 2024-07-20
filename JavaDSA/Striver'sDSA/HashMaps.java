import java.util.HashMap;

class HashMaps{
	public static void main(String[] args){
		int[] array = {1,2,3,4,1,2,0,6,5,4,4,4,4,4};
		HashMap freqMap = getArrayFreq(array);
		System.out.println(freqMap.get(1));
		System.out.println(freqMap.get(2));
		System.out.println(freqMap.get(3));
		System.out.println(freqMap.get(4));
		System.out.println(freqMap.get(5));
		System.out.println(freqMap.get(6));
		System.out.println(array.hashCode());
		String name="ankit";
		//int eng = 8; 
		//Integer ang1 = Integer(eng);
		System.out.println(name.hashCode());
	}

	public static HashMap getArrayFreq(int[] arr){
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count=0;
		for(int elem:arr){
			if(hm.containsKey(elem)){
				hm.put(elem, hm.get(elem)+1);
			}else{
				hm.put(elem, count+1);
			}
			

		}
		return hm;
	}

	/*

	public static int[] getArrayFreq2(int [] arr){
		int count = 0;
		for(int elem : arr){
			int elemHash = elem.hashCode();
			int elemIndex = elemHash%arr.length;
			if()



		}
	}
	*/


}