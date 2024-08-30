//  TC:O(n)  SC:O(K)  

public class CountPairsGivenSum {
    static int countPairs(int[] arr,int n,int k){
        int[] karr=new int[k];
        int cnt=0;
        for(int i=0;i<n;i++){
            karr[arr[i]%k]++;
        }
        cnt+=(karr[0]*(karr[0]-1))/2;
        if(k%2==0)
        cnt+=(karr[k/2]*(karr[k/2]-1)/2);
        for(int i=1;(i<=k/2)&&(2*i!=k);i++){

            cnt+=karr[i]*karr[k-i];
        }
        return cnt;

    

    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,2,1,7,5,3};
        int n=arr.length;
        int k=4;
        System.out.println(countPairs(arr,n,k));
    }
}