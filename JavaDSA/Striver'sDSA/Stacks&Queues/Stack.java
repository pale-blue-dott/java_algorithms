import java.util.ArrayList;

class Stack<T>{
	private int capacity=5;
	private int currentSize=-1;
	private ArrayList<T> arr=new ArrayList<>(capacity);

	public void push(T m){
	/*	if(currentSize==capacity-1){      // if currensize==capacity is given, when arr is full,
			capacity=2*capacity;          // it still shows current size as 4, as it uses prefix condition, 
			T[] temp=new T[capacity];
			for(int i=0; i<currentSize; i++){
				temp[i]=this.arr[i];
			}
			this.arr=temp;
		} */
		if(currentSize<-1){
			currentSize=-1;
		}
		arr.add(++currentSize,m);     // size increments first, then elem is inserted, when 4->5; if(currentSize==capacity)
		  // is inaccessible from here, hence if(currentSize==capacity-1) is true;
	}                                  

	public void top(){
		System.out.println(arr.get(currentSize));
	}

	public T pop(){
		if (currentSize<=-1){
			return null;
		}
		return arr.get(currentSize--);
	}

	public boolean isEmpty(){
		return currentSize<=-1;
	}

	public static void main(String[] args){
		Stack<String> stack = new Stack<>();
		stack.push("Ankit");
		stack.top();
		stack.push("kumar");
		stack.top();
		stack.push("Abhi");
		stack.push("Abhishek");
		stack.push("Amrut");
		stack.push("Adi");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.currentSize);
		stack.pop();
		System.out.println(stack.currentSize);
		stack.pop();
		System.out.println(stack.currentSize);

		
		stack.pop();
		stack.pop();
		System.out.println("a:"+stack.pop());
		stack.push("ankit");
		System.out.println(stack.currentSize);
		stack.push("kumar");
		System.out.println(stack.currentSize);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.top();
		stack.pop();
		stack.top();
		
		//System.out.println(stack.isEmpty());
		



		
		
	}
}
