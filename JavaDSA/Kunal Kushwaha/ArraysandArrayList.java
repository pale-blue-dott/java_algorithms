import java.util.Arrays;
import java.util.ArrayList;

class ArraysandArrayList{
	public static void main(String[] args){
		//int[] rollNo={765, 21, 253, 765, 45};
		//boolean[] ar={true, true, false};
		//System.out.println(ar[2]);
		ArrayList ai= new ArrayList();
		ai.add(45);
		System.out.println(ai);

		// int[] rollNo = new int[number];
		//number : number of variables it can accomodate 

		// array : one single datatype can act as set of multiple reference variables
		//hence saving a huge chunk of reference data
		// rollNo0 = 756; rollNo1=21, ... rollNo4=45;

		//System.out.println(Arrays.toString(rollNo));

		//int[] [] twoD = {{1,2,3, 5,7}, {4,5,6}, {7}};
	}
		
	public static void printVar2DArr(int[] [] twoD){
		for(int row=0; row<twoD.length; row++){
			for(int col=0; col<twoD[row].length; col++){
				System.out.print(twoD[row][col]+ ",");
			}
			System.out.println();
		}


	}
}