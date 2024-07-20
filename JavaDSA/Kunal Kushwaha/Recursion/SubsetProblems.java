import java.util.ArrayList;

class SubsetProblems{
	public static void main(String[] args){
		//System.out.println(removeA2("akkadbakkadbambaeboo"));
		//System.out.println(skipApple("bananaaaaappleiiappleyuiudjg"));
		//System.out.println(skipAppNotApple("appnotapple"));
		//subsequence("","abc");
		//printWords("ankit");
		System.out.println(subsequencesArr("", "abc"));
	}

	public static ArrayList<String> subsequencesArr(String p, String up){
		
		if(up.isEmpty()){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> upper=subsequencesArr(p+ch, up.substring(1));  // lower and upper accquires values as soon as its arguments
		ArrayList<String> lower=subsequencesArr(p,up.substring(1));      // meet base condition criteria, i.e. up==" ";
		
		upper.addAll(lower);          // imagine upper & lower as two branches, that are come out from the main problem 
		return upper;                 // under whose body these subproblems are specified.

	}

	public static void printWords(String str){
		if(str.isEmpty()){
			System.out.println("Completed");
			return;
		}
		char ch=str.charAt(0);
		printWords(str.substring(1));
	}
	

	public static void subsequence(String p, String up){
		if(up.length()==0){
			System.out.println(p);
			return;                        // return ; -> stops exectuion of the compiler beyond the base problem
		}                                  //             without return , compiler moves out of if statement. 
		char a=up.charAt(0);               // 
		subsequence(p+a,up.substring(1));
		subsequence(p,up.substring(1));
	}


	public static String skipAppNotApple(String str){
		if(str.isEmpty()){
			return "";
		}else if(str.startsWith("app") && !str.startsWith("apple")){
			return skipAppNotApple(str.substring(3));
		}else{
			return str.charAt(0)+skipAppNotApple(str.substring(1));
		}
	}

	public static String skipApple(String str){
		if(str.isEmpty()){                              // string.substring(0,4): return sub-string from index 0 to 3;
			return "";                                  // string.substring(3): return sub-string from index 3 to last index
		}else if(str.startsWith("apple")){              // string.startsWith/endsWith("substring") : returns true/false    
			return skipApple(str.substring(5));
		}else{
			String sol=str.charAt(0)+"";
			return sol+skipApple(str.substring(1));
		}
	}

	public static String removeA2(String str){
		if(str.isEmpty()){
			return "";
		}
		
		if(str.charAt(0)=='a'){
			return removeA2(str.substring(1));            //if str.charAt(0)=='a' : dont do anything just enter next subproblem str.substring(1)
		}else{                                            // else : return str.charAt(0)+removeA2(str.substring(1))
			return str.charAt(0)+removeA2(str.substring(1));
		}
	}

	public static String removeA1(String str, int i){
		if(i==str.length()){
			return "";
		}else if( str.charAt(i)=='a'){
			return removeA1(str, i+1);
		}
		String solution=str.charAt(i)+"";
		return solution.concat(removeA1(str, i+1));
	}

	public static String removeA(String str,String solution, int i){
		if(i==str.length()){
			return solution;
		}else if(str.charAt(i)=='a'){            // there must contain one argument variable inside the argument list
			return removeA(str, solution, i+1);  // through which we can smallify the bigger problem.3
		}
		solution+=str.charAt(i)+"";
		return removeA(str, solution, i+1);
	}
}