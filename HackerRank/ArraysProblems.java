import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class ArraysProblems{
	public static void main(String[] args){
		//List<Integer> list = new ArrayList<>();
		//list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
		//miniMaxSum(list);
		//System.out.println(Math.max(9,9));
		//String name="ankit";
		//System.out.println(name.indexOf("ankit"));
		System.out.println(Arrays.toString(plusOne(new int[]{9,9})));

	}
	 public static int[] plusOne(int[] arr) {
     	String s="";
     	for(int i=0; i<arr.length; i++){
     		s+=arr[i];
     	}
     	Integer value=Integer.parseInt(s);
     	value+=1;
     	int[] temp=new int[Integer.toString(value).length()];
     	for(int i=temp.length-1; i>=0; i--){
     		temp[i]=value%10;
     		value=value/10;
     	}
     	return temp;

	}

	 public static void miniMaxSum(List<Integer>arr){
    // Write your code here
    	int min=arr.get(0); int max=arr.get(0); int sum=arr.get(0);
    	for(int i=1; i<arr.size(); i++){
        	if(arr.get(i)>max){
            	max=arr.get(i);
        	}else if(arr.get(i)<min){
            	min=arr.get(i);
        	}
        	sum+=arr.get(i);

    	}
    	//System.out.println(sum);
    	int minSum=sum-max;
    	int maxSum=sum-min;
    	System.out.println(minSum+"  "+maxSum);

	}
}

