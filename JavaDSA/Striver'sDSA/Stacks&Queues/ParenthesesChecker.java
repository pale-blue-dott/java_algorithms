//import java.util.Stack;

class ParenthesesChecker{
	public static void main(String[] args){
		System.out.println(areBracketsBalanced("()[()"));	
	}


	public static boolean areBracketsBalanced(String expr){
		Stack<String> stack=new Stack<>();
		String lefty="({[";
		String righty=")}]";

		for(int i=0; i<expr.length(); i++){
			String s=expr.charAt(i)+"";
			if(s.equals("(") || s.equals("{") || s.equals("[")){
				stack.push(s);
			}else{
	          	String out = stack.pop();
	          	if(lefty.indexOf(out)!=righty.indexOf(s)){
	       			return false;
	       		}
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		return false;
	}
}