import java.util.Scanner;


class Chapter1{
	public static void main(String[] args){
		//ex1();
		//ex3();
		//ex4();
		//ex5(8);
		//ex7(1);
		ex9(50,40, 2);
	}

	public static void ex1(){
		for(int i=0; i<4; i++){
			for(int j=0; j<20; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

/*
    public static void ex2(){
    	for(int i=0; i<4; i++){
    		if(i==0 || i==3){
    			for(int j=0; j<20; j++)
    				System.out.print("*");
				System.out.println();
    		}else{
    			System.out.print("*");
    			for(int j=0; j<18; j++){
    				System.out.print(" ");
    			}
    			System.out.println("*");
    		}

    	}
    }

    public static void ex2(){
    	for(int i=0; i<4; i++){
    		if(i==0 || i==3){
    			for(int j=0; j<20; j++){
    				System.out.print("*");
				}
			}else{
				System.out.print("*");
    			for(int j=0; j<18; j++){
    				System.out.print(" ");
    				
    			}
    			System.out.print("*");
    			System.out.println();
    		}
    	}
	   */

	static void ex3(){
		float a=512.00f-282.00f;
		float b =44.48f*5.00f;
		System.out.println(a/b);
	}


	static void ex4(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		
		System.out.println("Square of thee number is " +a*a);

	}


	static void ex5(int n){
		for(int i=0; i<n; i++)
			if(i==n-1){
				System.out.println(i*n);
			}else{
			System.out.print(i*n+ "-->");
		}
	}

	static void ex7(int kg){
		System.out.println(2.2*kg);
	}

	static void ex9(int price, int tip, int quantity){
		System.out.println(price*quantity+tip);
	}

}