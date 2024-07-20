public class Main {
    public static void main(String[] args) {
       // int[] a= {1,4,6,87, 90};
       // int b=binarySearch(a, 87);
       // System.out.println(b);
        int[] sumLowerThanK = {2,2,3,1,1,1,1,1,1,7,8};  //{4,5,6,7,1,2,4,7,3};
        int[] ans=(keepSumLowerThanK(sumLowerThanK, 17));
        System.out.println(ans[0]);
        System.out.println(ans[1]);

        

    }

    public static int[] keepSumLowerThanK(int[] arr, int k){
        int i=0;
        int sum=0;
        int j=0;
        int startIndex=0;
        int endIndex=0;

        while(j<arr.length ){
            sum=sum+arr[j];
            System.out.print(sum +"-->");
            if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    System.out.print(sum+"-->");
                    i++;
                }
            }
            

            j++;
           
            
        }
        --j;
        int[] sol= new int[]{i,j};
       System.out.println();
       // System.out.println(startIndex);
       // System.out.println(endIndex);
        return sol;
    }


    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return -1;
    }
}