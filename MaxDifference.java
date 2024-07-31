//MAXIMUM DIFFERENCE BETWEEN ANY 2 ELEMENTS SUCH THAT SMALL ELEMENT APPEARS BEFORE LARGE ELEMENT

public class MaxDifference {
    public static void main(String[] args) {
        
        int[] arr={4,59,8,23,35,3,35,66,4,3,12,55,6,10};
        int size=arr.length;
        System.out.print(diff(arr,size));
    }

    public static int diff(int[] arr,int size){

        int max_diff=arr[1]-arr[0];
        int min_element=arr[0];
        for(int i=1;i<size;i++){
            if((arr[i]- min_element)>max_diff){
                max_diff=arr[i]-min_element;

            }
            if(arr[i]<min_element){
                min_element=arr[i];
            }
        }
        System.out.println("min ele:"+min_element);
        return max_diff;

    }
    
}
