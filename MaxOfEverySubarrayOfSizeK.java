public class MaxOfEverySubarrayOfSizeK {

    static void findMax(int[] arr,int n,int k){
        for(int i=0;i<n-k+1;i++){
            int max=arr[i];
            for(int j=1;j<k;j++){
                max=Math.max(max,arr[i+j]);

            }
            System.out.print(max+" ");

        }
    }

    public static void main(String[] args) {
        
        int[] arr=new int[]{1,4,-5,3,5,6,1};
        int n=arr.length;
        int k=3;
        findMax(arr,n,k);
    }
    
}
