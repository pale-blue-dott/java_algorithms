class Module1{
	public static void main(String[] args){
		String[] commonChar={"apple", "app", "applet", "bap", ""};
		System.out.println(longestCommonPrefix(commonChar));
	}


	 public static String longestCommonPrefix(String[] arr) {
       // String common=0;
        int k=0;
        for(int i=0; i<arr.length-1; i++){
            int j=0;
			while(j<arr[i].length() && j<arr[i+1].length() && arr[i].charAt(j)==arr[i+1].charAt(j)){
                j++;
            }
            k=--j;
        }
       	return arr[0].substring(0,k+1);

    }
}
