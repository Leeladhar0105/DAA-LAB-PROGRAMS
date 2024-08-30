import java.util.*;
;public class PrintPairsGivenSum {

    static void printPairs(int[] arr,int n,int sum){
         HashSet<Integer> hs=new HashSet<>();
         boolean flag=true;
         for(int a:arr){
            if(hs.contains(sum-a)){
                flag=false;
                System.out.println(a+","+(sum-a));
            }
            else{
            hs.add(a);
            }
           
         }
         if(flag){
            System.out.println("-1");
        }



    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,2,1,7,5,3};
        int n=arr.length;
        int sum=5;
        printPairs(arr, n, sum);

        
    }
    
}
