import java.util.Random;


class Chapter3{
	public static void main(String[] args){
		//printRand();
		//randVal();
		//timeConvert(240);
		//lastDigit(15,4);
		//factorial(6);
		//leapYear(2024);
		//modRec(5, 6);


	}

	public static void printRand(){
		for(int i=0; i<50; i++){
			Random r=new Random();
			int e = r.nextInt(3,50);
			System.out.println(e);
		}
	}

/*
	public static void twoRandoms(){
		Random rand2=new Random();
		Random rand1=new Random();
		int product=1;
		int x=rand1.nextInt(1,50);
		int y=rand2.nextInt(2,5);
		for(int i=0; i<y; i++){
			product=product*rand1;
		}

		System.out.println(product);

	}
	
	/*

	public static void printRandName(){
		Random rand = new Random();
		
		//System.out.println(x);
		for(int i=0; i<rand.nextInt(1,10); i++)
			System.out.println();
			System.out.println(i+"Ankit Kumar");
	}

	*/

	
			
	public static void randVal(){
		Random rand=new Random();
		 
		float x=rand.nextFloat(1.00f,10.00f);
		float y=rand.nextFloat(1.00f,24.00f);
		System.out.println(x+" "+ y);
		float mod=x-y;
		if(mod<0)
			mod=-1*mod;
		System.out.println(mod/(x+y));
	}


	public static void timeConvert(int seconds){
		int minutes=seconds/60;
		int remSeconds=seconds%60;
		System.out.println("seconds: "+seconds + "minutes: "+minutes+ "seconds: "+remSeconds);
	}

	public static void lastDigit(int m, int digits){
		int answer=1;
		int value=1;
		for(int i=0; i<m; i++){
			answer=answer*2;
		}

		for(int j=0; j<digits; j++){
			value=value*10;
		}
		System.out.println(answer);
		System.out.println(answer%value);
	} 


	static void factorial(int n){
		int product=1;
		for(int i=n; i>0; i--)
			product=product*i;
		System.out.println(product);
	}

	public static void leapYear(int year){
		int currentYear=year;
		int count=0;
		for(int i=1600; i<currentYear; i+=4){
			if((i%4==0 && 1%100==0) && (i%4==0 && i%400==0))
				count+=1;
		}
		System.out.println(count);

	}

	public static void modRec(int length, int height){
		for(int i=0; i<height; i++){
			for(int j=0; j<length; j++){
				for(int k=0; k<100; k++){
					if(k==j){
						break;
					}
					System.out.print(k%10);
				}
			System.out.println();
		}
		}
	}


	public static void recSum(S) 

	

}n