public class SubArrayWithGivenSum {

    static void findSubArray(int[] arr,int reqsum,int n){
        int sum=0;
        int i=0,j=0;
        while (j<n) {
            sum=sum+arr[j];
            if(sum==reqsum){
                System.out.println("start index:"+i+"\nend index:"+(j));
                break;
            }
            
            if(sum>reqsum){
                sum=sum-arr[i];
                i++;
            }
            j++;

        }
        System.out.println("No subarray present for given sum");
        
    }


    public static void main(String[] args) {
        
        int[] arr=new int[]{-3,8,12,-2,3,-4};
        int reqsum=17;
        int n=arr.length;
        findSubArray(arr,reqsum,n);
        
    }
    
}
