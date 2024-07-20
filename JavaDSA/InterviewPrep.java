import java.util.Arrays;
import java.util.Hashtable;
import java.util.HashMap;

class InterviewPrep{
	public static void main(String[] args){

		
		//System.out.println(arraySum(7645));
		//int a=10;
		//int b =20;
		//String s1 = Integer.toString(b);
		//System.out.println(s1+" Kumar"); 
		//int name = Integer.parseInt(s1);
		//System.out.println("name: "+name);
		//int[] a1 = {1,9,1,0,5,8};
		//StringBuilder str = new StringBuilder();
		//for(int i=0; i<a1.length; i++){
		//	str.append(a1[i]);
		//}
		//System.out.println(str.toString());
		//System.out.println(Arrays.toString(addOneToArray(a1)));
		//Integer arth = new Integer("100");
		//System.out.println(arth.hashCode());
		//System.out.println(Arrays.toString(rotateByOne(a1)));
		//System.out.println(printInc(0,5));
		int[] arr={0,0,0,1,1,1,2,234,56,23,1,0,0,2};
		//System.out.println(longestSubarray(arr));
		//Hashtable<Integer, String> hsh= new Hashtable<>();
		//hsh.put(1,"5");
		//System.out.println(hsh);
		Hashtable hasFre=(getArrayFrequency(arr));
		System.out.println(hasFre.keySet());

		//System.out.println(8+5);
		System.out.println(Arrays.toString(getSumIndex(new int[] {1,2,3,4,5,6,7,8}, 15)));
		System.out.println(Arrays.toString(sort012sArrays(new int[] {1,1,1,1,0,0,0,1,2,2})));
		//System.out.println(majorityElements(new int[] {0,0,0,1,1,2,2,2,2,2,2}));
		//System.out.println(majorityElement1(new int[]{0,0,0,1,1,2,2,2,2,2,2,3,3,3,3,3}));
		System.out.println(Arrays.toString(arrangeBySign(new int[] {-1,-2,-3,-4,5,6,7,8})));
		HashMap<Integer, String>map= new HashMap<>();
		map.put(0, "Ankit");
		map.put(1, "Chhotu");
		map.put(2, "Adi");
		int[] a=map.keySet();




	}

	public static int arraySum(int x){
		/*
		String num = Integer.toString(x);
		int sum=0;
		for(int i=0; i<num.length(); i++){
			int number = Integer.valueOf(num.charAt(i));
			sum+=number;
		}

		return sum; 

		*/
		int sum=0;
		//int num=x;
		System.out.println(sum);
		while(x>0){
			int digit = x%10;
			sum+=digit;
			System.out.println("digit: "+digit);
			x=x/10;
			System.out.println(x);
		}
		return sum;



	}

	

	public static int[] addOneToArray(int[] arr){
		//StringBuilder str = new StringBuilder();
		String str="";
		for(int i:arr){
			str+=i;
		}
		//String str1 = str.toString();
		Double value = Double.valueOf(str);
		value += 1;
		String intoStr = String.valueOf(value);

		int[] array = new int[intoStr.length()]; 

		for(int i=0; i<intoStr.length(); i++){
			array[i]=Character.getNumericValue(intoStr.charAt(i));
		}
		return array;

	}

	public static int[] rotateByOne(int[] arr){
		int temp=arr[0];
		for(int i=0; i<arr.length-1; i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

	

	public static int longestSubarray(int[] arr){
		int longest = 0;
		for(int i=0; i<arr.length-1; i++){
			int currentLongest = 1;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]!=arr[j]){
					break;
				}else{
					currentLongest+=1;
				}
			}
			if(currentLongest>longest){
				longest=currentLongest;
			}

		}
			return longest;
	}

	public static Hashtable getArrayFrequency(int[] arr){
		int count=0;
		Hashtable<Integer, Integer> freqHash = new Hashtable<>();
		for(int i=0; i<arr.length; i++){
			if(freqHash.containsKey(arr[i])){
				freqHash.put(arr[i], freqHash.get(arr[i])+1);
			}else{
				count=0;
				freqHash.put(arr[i], ++count);
			}
			
		}


		return freqHash;
	}

	public static int[] getSumIndex(int[] arr, int sum){
		Hashtable<Integer, Integer> table = new Hashtable<>();
		for (int i=0; i<arr.length; i++){
			int secValue = sum-arr[i];
			if(table.containsKey(secValue)){
				return new int[] {i,table.get(secValue)};
			}else{
				table.put(arr[i], i);
			}
		}
		return new int[] {};
	}

	public static int[] sort012sArrays(int[] arr){
		int i=0;
		int j=1;
		while(i<arr.length){
			while(j<arr.length){
				if(arr[j]<arr[i]){
					exchange(arr,i,j);
					i++;
				}
				j++;
			}
			i++;
		}
		return arr;
	}

	private static void exchange(int[] arr, int m, int n){
		int temp = arr[m];
		arr[m]=arr[n];
		arr[n]=temp; 
	}

	public static int majorityElements(int[] arr){
		HashMap<Integer, Integer> table = new HashMap<>();
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(table.containsKey(arr[i])){
				table.put(arr[i], table.get(arr[i])+1);
				if(table.get(arr[i])>arr.length/2){
					return arr[i];
				}
			}else{
				table.put(arr[i],1);
			}
		}

		return 0;
	}

/*
	public static int majorityElement1(int[] arr){
		//{0,0,0,1,1,2,2,2,2,2,2}
		int current = arr[0];
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(current==arr[i]){
				++count;
			}else if(count==0 && i<arr.length){
				current=arr[i+1];
			}else if(current!=arr[i]){
				--count;
			}
			//System.out.print(count+" ");

		}
		return current;
	}
*/

	public static int[] arrangeBySign(int[] arr){
		//  {-1,-2,-3,-4,5,6,7,8}
		int n=arr.length-1;
		int[] posArr = new int[n/2];
		int[] negArr = new int[n/2];
		int i=0; int j=0;

		for(int k=0; k<=n; i++ ){
			if(arr[k]>=0){
				System.out.println("i: "+i+" arr[k]: " +arr[k]);
				posArr[i]=arr[k];
				i++;
			}else{
				System.out.println("j: "+j+" arr[k]: " +arr[k]);
				negArr[j]=arr[k];
				j++;
			}
		} 
		/*
		for(int k=0; k<=n/2; k++){
			arr[k*2]=posArr[k];
			arr[k*2+1]=negArr[k];
		}*/
		return arr;
	}
	
}