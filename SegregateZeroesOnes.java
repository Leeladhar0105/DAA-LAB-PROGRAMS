
public class SegregateZeroesOnes {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,0,1,0,0,1,0,0,0,1};
        int n=arr.length;
        int left=0,right=n-1;
        while (left<right) {
            while((arr[left]==0)&&(left<right)){
                left++;
            }
            while((arr[right]==1)&&(left<right)) {

                right--;
            }
            if(left<right){
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
            
        }
        for (int i : arr) {
            
        System.out.print(i+" ");
    }
}
    
}
