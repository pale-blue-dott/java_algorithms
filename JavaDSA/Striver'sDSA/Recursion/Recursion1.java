class Recursion1{
	public static void printN(int m,int n){

		if(m==n){
			System.out.println(n);
			return;
		}
		System.out.println(m);
		m++;
		printN(m, n);
	}
	public static String printTillN(int m, int n){
		if(m==n){
			return ""+m;
		}

		String a=m+""+printTillN(m+1,n);
		return a;
	}

	public static void printName(int n){
		if(n==5){
			System.out.println("Ankit Kr");
			return;
		}
		System.out.println("Ankit Kr");
		printName(n+1);
	}


	
	

	public static void main(String[] main){
		//printN(2,10);
		//printTillN(0,10);
		//int cnt=0;
		//printName(1);
		//print1ToN(0,5);
		printNto1(5);

		
	}

	public static void print1ToN(int m,int n){
		if(m==n){
			System.out.println(n);
			return ;
		}
		System.out.println(m);
		print1ToN(m+1,n);
	}

	public static void printNto1(int m){
		if(m==0){						
			return;
		}
		printNto1(m-1);
		System.out.println(m);
		
	}
}