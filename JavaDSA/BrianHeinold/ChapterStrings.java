class ChapterStrings{
	public static void main(String[] args){
		permutations("abc");
	}

	static void permutations(String p, String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		Char ch=up.charAt(0);
		for(int i=0; i<=up.length(); i++){
			String f = up.substring(0, i);
			string s = up.substring(i, p.length());
			permutations(f+ch+s, up.substring(1));

		}


	}


}