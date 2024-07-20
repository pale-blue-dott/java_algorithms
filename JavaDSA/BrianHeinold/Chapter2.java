class Chapter2{
	public static void main(String[] args){
		//triangle(6);
		//print100();
		//squares(20);
		fibonacci(12);


	}


	static void triangle(int m){
		for(int i=0; i<m; i++){
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void print100(){
		for(int i=0; i<=100; i+=3)
			System.out.println(i);
	}

	static void squares(int m){
		for(int i=0; i<m; i++){
			System.out.println(i+ "-->" + i*i);
		}
	}

	static void fibonacci(int m){
		int beforeLast=0;
		int last=1;
		System.out.println(last);
		System.out.println(beforeLast);
		int current;
		int temp;
		for(int i=3; i<m; i++){
			current=beforeLast+last;
			System.out.println(current);
			temp=last;
			last=current;
			beforeLast=temp;
		}
	}

	static void recInput
}