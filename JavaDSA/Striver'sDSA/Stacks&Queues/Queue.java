class Queue{
	private int currentSize=-1;
	private int capacity=5;
	private int[] arr=new int[capacity];

	public void enqueue(int m){
		if(currentSize==capacity-1){
			capacity=2*capacity;
			int[] temp=new int[capacity];
			for(int i=0; i<currentSize; i++){
				temp[i]=arr[i];
			}
			arr=temp;
		}
		arr[++currentSize]=m;
	}

	public int dequeue(){
		int elem = arr[0];
		for(int i=1; i<currentSize; i++){
			arr[i-1]=arr[i];
		}
		--currentSize;
		return elem;
	}

	public void top(){
		System.out.println(arr[0]);
	}


	public static void main(String[] args){
		Queue queue=new Queue();
		queue.enqueue(-3);
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.top();
		queue.dequeue();
		queue.top();
		queue.dequeue();
		queue.top();

	}
}