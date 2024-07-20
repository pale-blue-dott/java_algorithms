import java.util.ArrayList;
import java.util.List;

class Todo{
	private static String user;
	private static List<String>todos=new ArrayList<>();

	static{
		todos.add("Learning Springboot");
		todos.add("Learning Microservices");
	}

	public static void main(String[] args){
		for(String todo: todos){
			System.out.println(todo);
		}
	}

}