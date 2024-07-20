

class Chapter2 {

  public static void main(String[] args) {
    
    int[] arr={1,4,6,78,90, 1203, 450, 1760, 1860};
    //int n=arr.length;
    //System.out.println(search(arr, 100,0, n, 1));
    System.out.println(getRecMax(arr, 0, 8));

  }

  public static int search(int[] arr, int key, int start, int end, int times ){
    System.out.println("start: "+start+"end: "+end);
    if(start>end){
      System.out.println("Doesnt contain Key");
      return times;
    }
    int mid=(start+end)/2;
    if(arr[mid]==key){
      return times;
    }
    else if(key<arr[mid]){
      return search(arr, key, start, mid-1, times+1);
    }else{
      return search(arr, key, mid+1, end, times+1);
    }
  }

  public static int getRecMax(int [] arr, int start, int end){
    int mid = start+end/2; 

    //if (start==mid)
      //return start;

   

   
    int left = getRecMax(arr, start, mid);
    int right = getRecMax(arr, mid+1, end);
    return getMax(arr, left, right);
  }

  public static int getMax(int[] arr, int leftMax, int rightMax){
    if (arr[leftMax] > arr[rightMax]){
      return arr[leftMax];
    }else{
      return arr[rightMax];
    }
  }

}