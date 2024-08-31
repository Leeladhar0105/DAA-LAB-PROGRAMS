import java.util.*;
public class AllNoOccurringOddTimes {
    private static void printOddTimes(int[] arr,int n){
        Map<Integer,Integer> hm=new HashMap<>();
        for(int number:arr){
            if(hm.containsKey(number)){
                hm.put(number,hm.get(number)+1);
            }
            else{
                hm.put(number, 1);
            }
        }
        for(Map.Entry<Integer,Integer> en:hm.entrySet()){
            if(en.getValue()%2!=0){
                System.out.println("key:"+en.getKey()+" value:"+en.getValue());
                
            }
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,2,3,6,7,7};
        int n=arr.length;
        printOddTimes(arr,n);

        
    }
    
}
