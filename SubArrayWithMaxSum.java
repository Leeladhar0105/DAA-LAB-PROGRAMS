
public class SubArrayWithMaxSum {

    static int findMaxSubArray(int[] arr,int n){
        int maxsum=0;
        int currentsum=0;

        for(int i=1;i<n;i++){
            currentsum=Math.max(currentsum+arr[i], arr[i]);
            maxsum=Math.max(maxsum, currentsum);
        }
        return maxsum;

    }

    public static void main(String[] args) {
        int[] arr=new int[]{-3,8,12,-2,3,-4};
        int n=arr.length;
        System.out.println("Max Sum:"+findMaxSubArray(arr,n));
    }
    
}
