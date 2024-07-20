import java.util.Random;

class Chapter4{
	public static void main(String[] args){
		//randGuess(5);
		//gameScore(85);
		sumAll(101);
		String name="String";
		System.out.println(name.length());
		int[] arr=new int[5];
		System.out.println(arr.length);

	}

	public static void randGuess(int m){
		Random rand= new Random();
		int randNum= rand.nextInt(1,10);
		if(m==randNum){
			System.out.println("Correct Guess");
		}else{
			System.out.println("Incorrect Guess: " + randNum);
		}
	}

	public static void gameScore(int score){
		if(score>90 && score<100){
			System.out.println("Best Score");
		}else if (score>80 && score<100){
			System.out.println("Good One");
		}
	}

	public static void sumAll(int m){
		int sum=0;
		for (int i=0; i<101; i++){
			sum+=i;
		}
		System.out.println(sum);
	}



	
}