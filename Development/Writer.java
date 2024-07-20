class Human{
	private int a=10;
	private String b="20";

	public Human(int a, String b){
		this.a=a;
		this.b=b;
	}

	public String toString(){
		return "I am a human";
	}

	
}

public class Writer{
	private static Human human;

	static{

		System.out.println("Ankit");
	}

	static{
		Human h=new Human(5, "Ankit");
		Writer.human=h;
	}

	public static void main(String[] args){
	    System.out.println(Writer.human);

	}
}